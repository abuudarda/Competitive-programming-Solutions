import java.io.*;
import java.util.*; 

public class Main{
  
  static String queen (int n){
    String s="";
    Vector<Integer> v= new Vector<Integer>();
    
    if (n<=9){
      s =(""+n);
      return s;
    }
    for (int i = 9; i >= 2 && n > 1; i--) { 
      while (n % i == 0) { 
        v.add(i); 
        n = n / i; 
      } 
    }
    if (n != 1) {
      s = "-1";
      return s; 
    } 
    for (int i=v.size()-1;i>=0;i--){
      s=s+v.get(i);
      
    }
    return s;
  } 
  //sc
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
  //dri
  public static void main(String[] args) throws IOException
  { 
    FastReader s=new FastReader(); 
    int t = s.nextInt();
    String a[] = new String [t];
    for ( int i=0;i<a.length;i++){
      int N= s.nextInt();
      a[i]=queen(N);
    }
    for ( int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
