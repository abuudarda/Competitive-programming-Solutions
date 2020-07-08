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
      int n3 = sc.nextInt();
      if (((n1>n2)&&(n2>n3))||((n3>n2)&&(n2>n1)))
        a[i]=n2;
      else if (((n2>n1)&&(n1>n3))||((n3>n1)&&(n1>n2)))
        a[i]=n1;
      else if (((n1>n3)&&(n3>n2))||((n2>n3)&&(n3>n1)))
        a[i]=n3;
    }
    for (int i = 0; i < a.length; i++)
      out.println("Case "+(i+1)+": "+a[i]);
  }
}
