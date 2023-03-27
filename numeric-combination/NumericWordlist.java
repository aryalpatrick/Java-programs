//numeric combination maker
import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author aryalpatrick
 */
public class fileyo {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Path\\new.txt"); //set path
        BufferedWriter yo = new BufferedWriter(fileWriter);
        DecimalFormat dw = new DecimalFormat("000");//no of digits = no of zeros
        int a = 999;//set upper limit of the combination
        long i;
        for (i = 0; i < a; i++) { 
            yo.write(dw.format(i) + "\n");
        }
        yo.close();
        
        System.out.println("Job is done");

    }
}
