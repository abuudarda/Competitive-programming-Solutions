
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
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

//dri

  public static void main (String[] args) throws java.lang.Exception
  {
    //Scanner scan = new Scanner(System.in);
    FastReader sc=new FastReader(); 
    while(true){
      int n = sc.nextInt();
      if(n==0) break;
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      for(int i = 0;i<n;i++){
        pq.add(sc.nextInt());
      }
      int sum = 0;
      while(pq.size()>1){
        int x = pq.remove() + pq.remove();
        pq.add(x);
        sum+=x;
      }
      System.out.println(sum);
    }
  }
}
