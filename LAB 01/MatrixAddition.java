/*
1. Develop a JAVA program to add TWO matrices of suitable order N( The value of N should be read
from Command Line Arguments).*/

import java.util.Scanner;
public class MatrixAddition
{
 public static void main(String[] args)
 {
 Scanner s=new Scanner(System.in);
// check if the number of command line arguments is correct
if(args.length!=1)
{
System.out.println("Usage:Java MatrixAddition <Order N>");
return;
}
int N=Integer.parseInt(args[0]);
// Check if N is a postive integer
if(N<=0)
{
System.out.println("Please Provide a Valid Positive Integer for the Order N");
return;
}
// Create two matrices of order N
int[][] matrix1 = new int[N][N];
int[][] matrix2 = new int[N][N];
int[][] matrix3 = new int[N][N];
// Accept the values of Matrix1
System.out.println("Enter the Values of Matrix1");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
matrix1[i][j]=s.nextInt();
}
}
// Accept the values of Matrix2
System.out.println("Enter the Values of Matrix2");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
matrix2[i][j]=s.nextInt();
}
}
// Adding of two Matrices
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
// Displaying the values of Matrix1
System.out.println("The Values of Matrix1");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
System.out.print(matrix1[i][j]+ "\t");
}
System.out.println();
}
// Displaying the values of Matrix2
System.out.println("The Values of Matrix2");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
System.out.print(matrix2[i][j]+ "\t");
}
System.out.println();
}
// Resultant Matrix3
System.out.println("Resultant Addition Matrix3");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
System.out.print(matrix3[i][j]+ "\t");
}
System.out.println();
}
 }
}
