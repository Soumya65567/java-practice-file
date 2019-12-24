import java.util.Scanner;
class Array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,s,flag=0;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter number to be searched");
s=sc.nextInt();
for(int i=0;i<n;i++)
{
if(a[i]==s)
flag=i+1;
else 
flag=-1;
}
System.out.println(flag);
}
}
