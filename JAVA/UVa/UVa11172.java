import java.util.*;
import static java.lang.System.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
    String a[] = new String[n];
    for (int i = 0; i < a.length; i++) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      if (n1>n2)
        a[i]=">";
      else if (n1<n2)
        a[i]="<";
      else if (n1==n2)
        a[i]="=";
    }
    for (int i = 0; i < a.length; i++)
      out.println(a[i]);
  }
}
