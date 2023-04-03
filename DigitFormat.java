import java.text.DecimalFormat;

/**
 *
 * @author aryalpatrick
 */
public class DigitFormat {

    public static void main(String[] args){

        DecimalFormat f = new DecimalFormat("000");
      
        int a=6;
      
        System.out.println("without formater : "+a);
        System.out.println("with formater    : "+f.format(a));


    }
}
