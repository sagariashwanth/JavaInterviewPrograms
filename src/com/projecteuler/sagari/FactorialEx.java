package com.projecteuler.sagari;

public class FactorialEx {
	
	public static int findFactorial(int n) {
		
//		if(n==0) {
//			return 1;
//		}
//		
//		int result ;
//		
//		result = n*findFactorial(n-1);
//		
//		return result;
//		=============================================
		
//		return (n==0 || n==1 )? 1 : n*findFactorial(n-1);
//		=============================================
		
		int res=1,i;
		for( i=2;i<=n;i++) {
			res *=i;
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		int result =findFactorial(6);
		System.out.println(result);

	}

}
