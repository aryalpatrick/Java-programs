/**
 *
 * @author aryalpatrick
 */
import java.util.Scanner;

public class Transpose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimension of matrix \n Row: ");

        int a = sc.nextInt();

        System.out.println("Column: ");

        int b = sc.nextInt();

        int arr[][] = new int[a][b];

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {

                System.out.println("Enter value for index " + i + "and " + j);

                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("original matrix is: ");

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println("");

        }
        System.out.println("Transposed matrix is: ");

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {

                System.out.print(arr[j][i] + " ");

            }
            System.out.println("");

        }
    }
}
