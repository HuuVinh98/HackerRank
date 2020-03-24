package Solution;

import java.util.Scanner;

public class javaSubarray {

	public static void main(String[] args)
	{
      Scanner sc = new  Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[n];
      int count = 0;
      
    	  for (int i =0;i<n;i++)
          {
    	  
    	  array[i] = sc.nextInt();
      }
     
      for(int i = 0;i<n;i++)
      {
    	  for(int j=0;j<n-i;j++)
    	  {
    		  int sum = 0;
    		  for(int t= j;t<=j+i;t++)
    		  {
    			  sum+=array[t];
    			  
    		  }
    		  if(sum<0) count++;
    	  }
      }
      
      System.out.println(count);

	}

}
