package com.company;
import java.util.Scanner;
abstract class Marking
{
    public abstract void Mark();
    public static void f(){
        System.out.println("Enter the Marks");
    }
}
class Marks extends Marking{
    public void Mark()
    {
        Scanner in = new Scanner(System.in);
        int n,i,sum=0;
        n = in.nextInt();
        int []a= new int[100];
        for(i=0;i<n;i++)
        {
            a[i]= in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum = sum+a[i];
        }
        System.out.println("Sum is "+" "+sum+" "+"and the average is "+ sum/n);
    }
}
public class Main {
    public static void main(String[] args) {
       Marks m = new Marks();
       m.Mark();
    }
}
