import java.io.*;
import java.util.*;
public class Main{
  static String grade(double n){
    if (n>=90 && n<=100)
      return "A";
    else if ( n>=80 && n<90 )
      return "B";
    else if ( n>=70 && n<80 )
      return "C";
    else if ( n>=60 && n<70 )
      return "D";
    else 
      return "F";
  }
  
  //sca
  static class FastReader  { 
    BufferedReader br; 
    StringTokenizer st; 
    
    public FastReader()   { 
      br = new BufferedReader(new
                                InputStreamReader(System.in)); 
    } 
    
    String next()   { 
      while (st == null || !st.hasMoreElements()) 
      { 
        try
        { 
          st = new StringTokenizer(br.readLine()); 
        } 
        catch (IOException  e) 
        { 
          e.printStackTrace(); 
        } 
      } 
      return st.nextToken(); 
    } 
    
    int nextInt() 
    { 
      return Integer.parseInt(next()); 
    } 
    
    long nextLong() 
    { 
      return Long.parseLong(next()); 
    } 
    
    double nextDouble() 
    { 
      return Double.parseDouble(next()); 
    } 
    
    String nextLine() 
    { 
      String str = ""; 
      try
      { 
        str = br.readLine(); 
      } 
      catch (IOException e) 
      { 
        e.printStackTrace(); 
      } 
      return str; 
    } 
  }
  //driv 
  public static void main(String[] args) throws IOException
  { 
    FastReader s=new FastReader(); 
    int T = s.nextInt();
    String a[]= new String[T];
    for (int i=0;i<a.length;i++){
      int t1=s.nextInt();
      int t2=s.nextInt();
      int f=s.nextInt();
      int att=s.nextInt();
      double ct[]=new double [] {s.nextInt(), s.nextInt(),s.nextInt()};
      Arrays.sort(ct);
      double fnlmrks= t1+t2+f+att+ ((ct[1]+ct[2])/2.0);
      a[i]=grade(fnlmrks);
    }
   for (int i=0;i<a.length;i++)
     System.out.println("Case "+(i+1)+": "+a[i]);
   }
}
