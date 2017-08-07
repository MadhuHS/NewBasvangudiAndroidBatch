package com.aquamax.viralshare;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ProgressDialog mProgressDialog;
    private StorageReference mStorageReference;
    private static final int GALLERY_INTENT = 2;
    private DatabaseReference mDatabaseReference;
    private FirebaseAuth firebaseAuth;
    private RecyclerView recyclerView;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_dashboard:
                    Intent i1 = new Intent(Intent.ACTION_PICK);
                    i1.setType("image/*");
                    startActivityForResult(i1, GALLERY_INTENT);
                    return true;
                case R.id.navigation_notifications:

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStorageReference = FirebaseStorage.getInstance().getReference();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference().child("allPosts");
        firebaseAuth = FirebaseAuth.getInstance();
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Viral Sharing.....");


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        recyclerView = (RecyclerView) findViewById(R.id.main_recyclerview_home);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(MainActivity.this,3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        FirebaseRecyclerAdapter<Post,PostViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Post, PostViewHolder>
                        (Post.class,R.layout.cards_home,PostViewHolder.class,mDatabaseReference) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder, Post model, int position)
            {
                 viewHolder.setImage(getApplicationContext(),model.getImage());
            }
        };

        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder
    {
        View mView;
        public PostViewHolder(View itemView)
        {
            super(itemView);
            mView = itemView;
        }

        public void setImage(Context context,String image)
        {
            ImageView post_img = (ImageView) mView.findViewById(R.id.card_post_imageview);
            Picasso.with(context).load(image).resize(100,100).centerInside().into(post_img);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GALLERY_INTENT && resultCode == RESULT_OK) {
            startPosting(data);
        }

    }

    private void startPosting(Intent data)
    {
        mProgressDialog.show();
        Uri uri = data.getData();

        StorageReference filepath = mStorageReference.child("Photos").child(uri.getLastPathSegment());
        filepath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                Uri downloaduri = taskSnapshot.getDownloadUrl();
                DatabaseReference newpost = mDatabaseReference.push();
                newpost.child("image").setValue(downloaduri.toString());
                newpost.child("uid").setValue(firebaseAuth.getCurrentUser().getUid());
                mProgressDialog.dismiss();
            }
        });
    }


    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finishAffinity();
    }
}
