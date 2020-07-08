import java.io.*;
import java.util.*; 
public class Main{  
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
  // sieve
  static int countDivisors(int n) 
  { 
    
    boolean hash[] = new boolean[n + 1]; 
    Arrays.fill(hash, true); 
    for (int p = 2; p * p < n; p++) 
      if (hash[p] == true) 
      for (int i = p * 2; i < n; i += p) 
      hash[i] = false; 
    
    int total = 1; 
    for (int p = 2; p <= n; p++)  
    { 
      if (hash[p]) 
      { 
        
        int count = 0; 
        if (n % p == 0)  
        { 
          while (n % p == 0)  
          { 
            n = n / p; 
            count++; 
          } 
          total = total * (count + 1); 
        } 
      } 
    } 
    return total; 
  }
  //dd
  public static void main(String[] args) 
  { 
    FastReader sc=new FastReader();
    ArrayList<Integer> x= new ArrayList<Integer>();
    //Scanner sc= new Scanner(System.in);
    for ( int i=1000;i>0;i--)
      x.add(i);
    Collections.sort(x,new Comparator<Integer>(){
      public int compare(Integer a, Integer b){
        if(countDivisors(a)==countDivisors(b)) return b-a;
        else return countDivisors(a)-countDivisors(b);
      }
    });
    int t = sc.nextInt();
    int n1[]=new int [t];
    for (int i=0;i<n1.length;i++){
      int g=sc.nextInt();
      n1[i]=x.get(g-1);
    }
    for (int i=0;i<n1.length;i++)
      System.out.println("Case "+(i+1)+": "+n1[i]);
    
//    System.out.print(x);
  }
}
