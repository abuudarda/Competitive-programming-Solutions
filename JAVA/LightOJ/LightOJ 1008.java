import java.io.*;
import java.util.*;
public class Main { 
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    long x1 [] = new long[T];
    long y1 [] = new long[T];
    for ( int i=0; i<x1.length; i++){
      long temp=0;
      long S = sc.nextLong();
      long line = (long) Math.sqrt(S);
      line++;
      long x =(line*line)-(S-1);
      long y =S - ((line-1)*(line-1));
      if (x>line || x==line)
        x1[i]=line;
      else 
        x1[i]=x;
      if (y>line || y==line)
        y1[i]=line;
      else 
        y1[i]=y;
      if (line%2==0){
        temp=x1[i];
        x1[i]=y1[i];
        y1[i]=temp;
      }
      if (x1[i]==0){
        x1[i]=1;
        y1[i]=y1[i]-1;
      }
      if (y1[i]==0){
        y1[i]=1;
        x1[i]=x1[i]-1;
      }
    }
    for ( int i=0; i<x1.length; i++)
      System.out.println("Case "+(i+1)+": "+x1[i]+ " "+y1[i]);
  }
}
