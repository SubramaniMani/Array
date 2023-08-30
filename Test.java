package test;

public class Test {

	public static void main(String[] args) {
		
		
		Test obj = new Test();
		
		//obj.one();
		//obj.two();
		//obj.three();
		//obj.four();
		//obj.five();
		//obj.six();
		//obj.seven();
	    //obj.eight();
		//obj.nine();
		//obj.ten();
		obj.con();
		
	}


	private void con() {
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,9,10};
	
		int j=0;
		
		int [] result  = new int [a.length+b.length];
		for(int i=0; i<result.length; i++)
		{
			if(i<a.length)
				
				result [i] = a[i];
			
			else 
			{
			result [i] =  b[j];
			
			j++;
			}	System.out.println(result[i]);
		}
			
		}
		
	


	private void ten() {
		for(int no=1;no<=100;no++)
		{
			if(no%5==0 && no%10!=0) {
				System.out.print(no+" ");
			}
			if(no/5==10 || no/5==11) {
				System.out.print(no+" ");
			}
		}
		
	}

	private void nine() {
	
		int  no = 1234;
		
		while(no>0)
		{
			int rem1 = no % 10;
			 no = no/10;
			 int rem2 = no %10;
			 no = no/10;
			 if(rem2<=rem1)
			 {
				continue;
			 }
			 else
			 {
				 System.out.println(no);
				 break;
			 }
		}
		
	}

	private void eight() {
		int no=1;
		while(no<100)
		{
			if (no % 5 == 0 && no % 10 != 0)
			{
			
				System.out.println(no);
		}
			if(no/5==10 || no/5==11)
			{
			
				System.out.println(no);
			}
		
		no++;
		
		}

}


	private void seven() {
		int no = 5;
		while(no>=3)
		{
			find_power(no,no-1);
			no--;
		}
		
	}

	private void find_power(int base, int power) {
		int result =1;
		while(power<0)
		{
			result = result* base;
			power--;
		}
		System.out.println(result);
		
	}

	private void six() {
		int no1=5, no2=0;
		while(no1>=1)
		{
			no2=no1;
			int fact =1;
			while(no2>=1)
			{
				fact = fact * no2;
				no2--;
				
			}
			System.out.println(fact);
			no1--;
		}
	}

	private void five() {
		
		int no = 100;
		int div = 2;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				find_prime(div);
			}
			div++;
			
		}
				
	}

	private void find_prime(int no) {
		 
		boolean prime = true;
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				prime = false;
				break;
			}
			div++;
		}
			if(prime == true )
				System.out.println("prime"+div);
				
			
	}

	private void four() {
		int first =0,second=1;
		while(first<=80)
		{
			if(first==5)
			{
				System.out.println(first);
			}
			int third = first + second;
				second = third;
				
			}
			
		}
		
	

	private void three() {
		boolean first=true;
		int lcd=0;
		int gcd=0;
		int no1=100,no2=120,div=2;
		int small=no1<no2 ? no1:no2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				if(first==true)
					lcd=div;
				first=false;
			}
			gcd=div;
			div++;	
		}
		System.out.println("GCD===>"+gcd);
		System.out.println("LCD===>"+lcd);
		
	}

	private void two() {
		boolean first=true;
		int no1=5;
	 for(int no=1; no<=5; no++) {
		 
		 System.out.println(no*no1);
		 
		 if(no==5 && first==true)
		 {
			 no1=4;
			 no=0;
			 first=false;
			 
		 }
		 
	 }
		
	}

	private void one() {
		
//		int no=1;
//		System.out.print(no+" ");
//		no=no+10;
//		System.out.print(no+" ");
//	    no=no+100;    
//	    System.out.print(no+" ");
//	    no=no+1000;
//	    System.out.print(no+" ");
	    
	    
	    int no=1,no2=1;
	    while(no<=1111)
	    {
	    	System.out.print(no+" ");
	    	no2=no2*10;
	    	no=no+no2;
	    }
	    	
	    }
		
	}


