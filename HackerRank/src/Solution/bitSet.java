package Solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bitSet 
{

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
        int bitSetSize = sc.nextInt();
        int numOfOperations = sc.nextInt();
        BitSet[] bitSet = new BitSet[2];
        bitSet[0]= new BitSet(bitSetSize);
        bitSet[1]= new BitSet(bitSetSize);
        
        sc.nextLine();
        for(int i=0;i<numOfOperations;i++)
        {
        	String[] opArr = sc.nextLine().split(" ");
        	switch(opArr[0])
        	{
        	case "AND" : 
        	{
        		bitSet[Integer.parseInt(opArr[1])-1].and(bitSet[Integer.parseInt(opArr[2])-1]);
        		break;
        	}
        	case "OR" :
        	{
        		bitSet[Integer.parseInt(opArr[1])-1].or(bitSet[Integer.parseInt(opArr[2])-1]);
        		break;
        		
        	}
        	case "XOR" :
        	{
        		bitSet[Integer.parseInt(opArr[1])-1].xor(bitSet[Integer.parseInt(opArr[2])-1]);
        		break;
        	}
        	case "FLIP" :
        	{
        		bitSet[Integer.parseInt(opArr[1])-1].flip(Integer.parseInt(opArr[2]));
        		break;
        	}
        	case "SET" :
        	{
        		bitSet[Integer.parseInt(opArr[1])-1].set(Integer.parseInt(opArr[2]));
        		break;
        	}
        	}
        	
        	System.out.println(bitSet[0].cardinality()+" "+bitSet[1].cardinality());
        	
        }
        

	}

}
