package Solution;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeTest 
{
	public static void main(String[]args)
	{
		System.out.println("Nhap so cần kt : ");
		Scanner sc =  new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		sc.close();
		if(n.isProbablePrime(1))
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		
	}

}
