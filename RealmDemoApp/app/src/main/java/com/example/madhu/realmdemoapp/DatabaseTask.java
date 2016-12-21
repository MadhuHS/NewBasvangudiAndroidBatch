package com.example.madhu.realmdemoapp;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by MADHU on 18-12-2016.
 */

public class DatabaseTask
{
    private static Realm r1 = Realm.getDefaultInstance();
    private static User u1 = null;

  public static boolean addUser(String name, String email, String pwd)
  {

      if(name.length()!=0&&email.length()!=0&&pwd.length()!=0)
      {
          r1.beginTransaction();

          User u1 = r1.createObject(User.class);
          u1.setName(name);
          u1.setEmail(email);
          u1.setPassword(pwd);

          r1.commitTransaction();
          return true;
      }

      else
      {
          return false;
      }
  }

    public static RealmResults<User> getUserDet(String usn)
    {
        RealmResults<User> res1 = r1.where(User.class).
                                  equalTo("email",usn).
                                  findAll();
        return res1;
    }

    public static boolean updateuser(String email,String newpassword)
    {
        u1 = r1.where(User.class).equalTo("email",email).findFirst();
        if(u1!=null)
        {
            r1.beginTransaction();
            u1.setPassword(newpassword);
            r1.commitTransaction();
            return true;
        }
        else
        {
            return false;
        }
    }

}
