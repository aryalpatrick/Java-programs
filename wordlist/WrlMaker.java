//WRL final
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thekakunte
 */
public class wordl {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("path\\new.txt");
        BufferedWriter yo = new BufferedWriter(fileWriter);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < str.length(); k++) {
                    for (int l = 0; l < str.length(); l++) {
                        for (int m = 0; m < str.length(); m++) {

                            sb1.append(str.charAt(i));
                            sb1.append(str.charAt(j));
                            sb1.append(str.charAt(k));
                            sb1.append(str.charAt(l));
                            sb1.append(str.charAt(m));

                            yo.append(sb1 + "\n");
                            sb1.setLength(0);

                        }

                    }
                }

            }
        }

        yo.close();

    }

}
