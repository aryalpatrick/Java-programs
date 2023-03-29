//identical matrix

/**
 *
 * @author aryalpatrick
 */

import java.util.Scanner;

public class IdentityMatrixCheck
{

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

      System.out.println ("Enter dimension of matrix \n Row: ");
    int a = sc.nextInt ();

    int count = 0;
    int b = a * a;
    int arr1[][] = new int[a][a];
    int arrtest[][] = new int[a][a];

    for (int i = 0; i < a; i++)
      {
	for (int j = 0; j < a; j++)
	  {
	    if (i == j)
	      {
		arrtest[i][j] = 1;
	      }

	  }
      }

    System.out.println ("Matrix");
    for (int i = 0; i < a; i++)
      {
	for (int j = 0; j < a; j++)
	  {
	    System.out.println ("Enter value for index " + i + "and " + j);
	    arr1[i][j] = sc.nextInt ();
	  }
      }
    System.out.println ("Matrix is: ");
    for (int i = 0; i < a; i++)
      {
	for (int j = 0; j < a; j++)
	  {

	    System.out.print (arr1[i][j] + " ");

	  }
	System.out.println ("");

      }



    for (int i = 0; i < a; i++)
      {
	for (int j = 0; j < a; j++)
	  {

	    if (arr1[i][j] == arrtest[i][j])
	      {
		count++;
	      }


	  }

	System.out.println ("");

      }

    if (count == b)
      {
	System.out.println ("Yes it is Identical");
      }
    else
      {
	System.out.println ("Not identical");
      }





  }
}
