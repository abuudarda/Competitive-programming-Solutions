import java.util.*;
import static java.lang.System.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      a[i] = n1+n2;
      n1=0;
      n2=0;
    }
    for (int i = 0; i < a.length; i++)  
      out.println("Case "+(i+1)+": "+ a[i]);
  }
}
