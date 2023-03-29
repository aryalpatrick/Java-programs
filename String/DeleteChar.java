// DELETA A CHAR


/**
 *
 * @author aryalpatrick
 */
import java.util.Scanner;
public class DeleteChar
{


  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String m1 = "abcd";
    StringBuilder m = new StringBuilder (m1);


      System.out.println ("Enter the char you need to remove");
    String c = sc.nextLine ();

    int charval = m.indexOf (c);

      System.out.println (m.deleteCharAt (charval));

  }
}
