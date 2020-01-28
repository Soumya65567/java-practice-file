import java.util.*;
class matrix1
{
public static void main(String args[])
{
int i,j,x;
x=args.length;
int a[][]=new int[2][2];
if(x!=4)
System.out.println("please enter 4 integer numbers");
if(x==4)
{
int k=0;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(args[k]);
k++;
}
}
System.out.println("The given matrix is..");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("The reverse of array is..");
for(i=1;i>=0;i--)
{
for(j=1;j>=0;j--)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
}
