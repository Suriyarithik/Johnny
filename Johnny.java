# Johnny
import java.io.*;
import java.util.Scanner;
public class Johnny{
    public static void main(String args[])
    {
    int i;
   Scanner s=new Scanner(System.in);
   java.lang.String num=s.nextLine();
    int n=num.length();
     int m[]=new int[n];
    char p;//[]=new char[n];
    int num1=Integer.parseInt(num);
  while(num1>0)
  {for(i=0;i<n;i++)
  { m[i]=num1%10;
  num1=num1/10;
  }for(i=n-1;i>=0;i--)
  {
      int str=97+m[i]-1;
  p=(char)str;
  System.out.println(p);
}
}
}
}
