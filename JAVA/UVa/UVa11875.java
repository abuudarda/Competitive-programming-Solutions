import java.util.*;
import static java.lang.System.*;
public class Main{
  public static void main (String[]args){
    Scanner sc=new Scanner (in);
    int n= sc.nextInt();
    int a[]=new int[n];
    for (int i=0;i<a.length;i++){
      int n1= sc.nextInt();
      int b[]=new int [n1];
      for (int j=0;j<b.length;j++)
        b[j]=sc.nextInt();
      a[i]=b[(n1-1)/2];
    }
    for (int i=0;i<a.length;i++)
      out.println("Case "+(i+1)+": "+a[i]);
  }
}
