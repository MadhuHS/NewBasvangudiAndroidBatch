package com.aquamax.utils;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by MADHU on 21-04-2017.
 */

public class ActivityUtils extends Activity
{
    Intent i;

   public void navigate(Activity from,Class to)
   {
       i = new Intent(from,to);
       this.startActivity(i);
   }
}
