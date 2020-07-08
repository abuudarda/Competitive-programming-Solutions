import java.io.*;
import java.util.*;
public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
   
    double a []= new double[T];
    for (int i=0; i<a.length; i++){
      double r= sc.nextDouble();
      double sqarea=(r*2)*(r*2);
      double crarea=2*Math.acos(0.0)*r*r; 
      a[i]= sqarea-crarea;
    }
    for(int i=0;i<a.length;i++)
      System.out.printf("Case "+(i+1)+": %.2f\n",a[i]);
  }
}
