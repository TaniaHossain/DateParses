import java.util.*;
import java.text.*;
  
public class DateParses {

   public static void main(String args[]) {
      SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy-MM-dd"); 
      String input1 = args.length == 0 ? "1818-11-11" : args[0]; 

      System.out.print(input1 + " Parses as "); 
      Date t1;
      try {
         t1 = ft1.parse(input1); 
         System.out.println(t1); 
      } catch (ParseException e) { 
         System.out.println("Unparseable using " + ft1); 
      }
      Date date = new Date();
      String str = String.format("\nCurrent Date/Time : %tc", date );
      System.out.printf(str);
      System.out.printf("%1$s %2$tB %2$td, %2$tY", "\n\nDue date:", date);
      
      System.out.printf("%s %tB %<te, %<tY", "\n\nDue date:", date);
      
      SimpleDateFormat ft2 = new SimpleDateFormat ("yyyy-MM-dd"); 
      String input2 = args.length == 0 ? "\n\n1818-11-11" : args[0]; 

      System.out.print(input2 + " Parses as "); 
      Date t2;
      
      try {
         t2 = ft2.parse(input2); 
         System.out.println(t2); 
      } catch (ParseException e) { 
         System.out.println("Unparseable using " + ft2 + "\n"); 
     }
      try { 
          System.out.println(new Date( ) + "\n"); 
          Thread.sleep(5*60*10); 
          System.out.println(new Date( ) + "\n"); 
       } catch (Exception e) {
          System.out.println("Got an exception!"); }
      
      try {
          long start = System.currentTimeMillis( );
          System.out.println(new Date( ) + "\n");
          
          Thread.sleep(5*60*10);
          System.out.println(new Date( ) + "\n");
          
          long end = System.currentTimeMillis( );
          long diff = end - start;
          System.out.println("Difference is : " + diff);
       } catch (Exception e) {
          System.out.println("Got an exception!");
       }
          
   }
}