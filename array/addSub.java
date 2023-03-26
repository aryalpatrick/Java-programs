import java.util.Scanner;

public class addSub{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter dimension of matrix \n Row: ");
        int a = sc.nextInt();
        
        System.out.println("Column: ");
        int b = sc.nextInt();
        
        int arr1[][] = new int[a][b];
        int arr2[][] = new int[a][b];
        int sum[][] = new int[a][b];
       
        
        System.out.println("Matrix 1");
        for(int i=0;i<a;i++){
             for(int j=0;j<b;j++){
                 System.out.println("Enter value for index "+i+"and "+j);
                 arr1[i][j]=sc.nextInt();
             }
        }
        System.out.println("Matrix 2");
                for(int i=0;i<a;i++){
             for(int j=0;j<b;j++){
                 System.out.println("Enter value for index "+i+"and "+j);
                 arr2[i][j]=sc.nextInt();
             }
        }
        
       
        
         System.out.println("Sum: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
                      
            }
            System.out.println("");
            
        }
                 System.out.println("Differentiation: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum[i][j]=arr1[i][j]-arr2[i][j];
                System.out.print(sum[i][j]+" ");
                      
            }
            System.out.println("");
            
        }

        
        
    }
}
