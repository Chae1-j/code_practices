import java.io.*;

public class Main{
   public static void main(String[] args) throws IOException { 
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      long N = Long.parseLong(bf.readLine());     
      long n = 0;     
      for(int i = 0; i < N-2; i++) {
    	  n += N-2-i;
      } 
      long sum = n;
      for(int i = 0; i < N-2; i++) {
    	  n -= N-2-i;
    	  sum += n;   	      	  
      }
      System.out.println(sum);
      System.out.println(3);
   }  
}     