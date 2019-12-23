import java.util.Scanner;
public class Sum
{ 
public static void main(String args[])
{
int n,sum=0;
float avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elements in an array");
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println(sum);
avg=(float)sum/n;
System.out.println(avg);
}
}

