package androidsessions.weekendbatch.jspiders.converter;

/**
 * Created by Admin on 12-11-2016.
 */

public class Converters
{
  public static String toKilometers(String meters)
  {
      if(meters.length()!=0)
      {   double c1 = Double.parseDouble(meters);
          c1 = c1 / 1000;
          String res = String.valueOf(c1);
          return res;
      }
      else
      {
          return "meter caanot be empty";
      }
  }

   public static String tometers(String kilomtr)
   {
       if (kilomtr.length()!=0)
       {
           double c1 = Double.parseDouble(kilomtr);
           c1 = c1*1000.0;
           String res = String.valueOf(c1);
           return res;
       }

       else
       {
           return "kilometer cannot be empty";
       }
   }













}
