
import java.util.*; 
public class Main{
  public static void main(String[] args) 
  { 
    // FastReader sc=new FastReader();
    Scanner sc= new Scanner(System.in);
    HashMap<Integer,Integer> mains = new LinkedHashMap<Integer,Integer>();
    while(sc.hasNext()){
      
      int n= sc.nextInt();
      if ( mains.containsKey(n))
        mains.put(n,mains.get(n)+1);
      else
        mains.put (n,1);
    }
      for (Map.Entry<Integer,Integer> entry : mains.entrySet())  {
        System.out.println(entry.getKey()+" "+entry.getValue());
      }
    
    sc.close();
  }
}
