import java.io.*;
import java.util.*;
public class Main{ 
  //sca
  /*
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
   */
  
  public static void main(String[] args) 
  { 
    // FastReader sc=new FastReader();
    Scanner sc= new Scanner(System.in);
    while(sc.hasNext()){
      int n= sc.nextInt();
      if(n==0)
        break;
      Stack<Integer> s= new Stack<Integer>();
      Vector<Integer> v = new Vector <Integer>();
      
      for (int i=n;i>0;i--)
        s.push(i);
      while(s.size()>0){
        if(s.size()==1){
          break;
        }
        v.add(s.pop());
        s.add(0,s.pop());
      }
      System.out.print("Discarded cards:");
      for(int i=0;i<v.size();i++) {
        System.out.print(" "+v.get(i));
        if (i!=v.size()-1)
          System.out.print(",");
        
      }
      System.out.println();
      System.out.println("Remaining card: "+s.peek());
      s.pop();
      v.clear();
    }  
  }
}
