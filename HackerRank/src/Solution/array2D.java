package Solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class array2D {


		 private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) 
		    {
		        int[][] arr = new int[6][6];

		        for (int i = 0; i < 6; i++) 
		        {
		            String[] arrRowItems = scanner.nextLine().split(" ");
		            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		            for (int j = 0; j < 6; j++) 
		            {
		                int arrItem = Integer.parseInt(arrRowItems[j]);
		                arr[i][j] = arrItem;
		            }
		        }

		        scanner.close();
		        
		        // tinh
		       int[][] sum =  new int[4][4];
		       for(int s =0;s<=3;s++) 
		       {
		        for (int t=0;t<=3;t++) // so lan lay ma tran
		        {
		        	int[][] matrix = new int[3][3];
		        	for(int i=s;i<=s+2;i++)
		        	{
		        		for(int j=t;j<=t+2;j++)
		        		{
		        			matrix[i-s][j-t]=arr[i][j];	        			
		        		}
		        	}
		        	sum[s][t] = sum(matrix);
		        }
		        
		     }
		       int max=sum[0][0];
		       for(int s=0;s<=3;s++)
		       {
		    	   for (int t=0;t<=3;t++)
		    	   {
		    		   if(sum[s][t]>max)
		    			   max = sum[s][t];
		    	   }
		       }
		       System.out.println(max);
		    }
		    
		    //ham tinh tong dong ho cat
		    public  static int sum(int a[][])
		    { 
		    	int sum=0;
		    	for(int i=0;i<3;i++)
		    	{
		    		if(i!=1)
		    		{
		    			for(int j=0;j<3;j++)
			    		{
			    			sum+=a[i][j];
			    		}
		    		}
		    		else
		    		{
		    			sum+=a[1][1];
		    		}
		    		
		    	}
		    	return sum;
		    
		    }


}
	


