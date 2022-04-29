import java.util.Scanner;
class transpose
{
public static void main(String[]args)
{
int i,j;
Scanner sc =new Scanner (System.in);
System.out.println("Enter the matrix size");
System.out.println("Rows");
int r=sc.nextInt();
System.out.println("Columns");
int c=sc.nextInt();
int mat[][] = new int[r][c];  
    System.out.println("Enter matrix:");  
    for(i = 0; i < r; i++)  
    {  
        for(j = 0; j < c; j++)   
            {  
            mat[i][j] = sc.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("The above matrix before Transpose is ");  
    for(i = 0; i < r; i++)  
        {  
            for(j = 0; j < c; j++)  
            {  
            System.out.print(mat[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("The above matrix after Transpose is ");  
    for(i = 0; i < c; i++)  
        {  
            for(j = 0; j < r; j++)  
            {  
                System.out.print(mat[j][i]+" ");  
            }  
            System.out.println(" ");  
        }   
}
}