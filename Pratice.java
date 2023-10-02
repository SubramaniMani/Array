package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Pratice {


	public static void main(String[] args) 
	{
		Pratice object = new Pratice();
		
		//object.Array();
		//object.Array1();     //  legth find 
		object.Array2();     // find length
		//object.Array3();     // addition  and length checking 
		//object.Array4();     // small value and big value second high and low
		//object.Array5();     //duplicates no countt
		//object.Array6();     // repeat elements
		//object.Array7();     // repeat elements counts 
		//object.Array8();     // char repeat elemements counts
		//object.Array9();     // first elements repeated find
		//object.Array10();    //first elements not found
		//object.Array11();    // second letter not found
		//object.Array12();    //lenear search find target value
	    //object.Array13();    //Given array reverse 
		//object.Array14();    // odd or even find 
		//object.Array15();    // two letter repeated  program
		//object.Array16();    // addition two number
		//object.Array17();    // missing integer
		//object.Array_18();
		//object.Array_19();   //first letter non repeated 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private void Array_19()
	{
		char[] name= {'S','U','B','R','A','M','A','N','I'};
		for(int j=0;j<name.length;j++) 
		{
			boolean repeated=false;
			char ch=name[j];
			if(ch=='*') 
				continue;
			for(int i=j+1;i<name.length;i++) 
			{
				if(ch==name[i]) 
				{
					name[i]='*';
					repeated=true;
					
				}
			}
			if(repeated==false) 
			{
				System.out.println("non repeated char"+ch);
				break;	
		    }	
		}
	
		
		
	}

	private void Array_18() {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created: ");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++){
	         myArray[i] = sc.nextInt();
	      }
	      //Reading the number
	      System.out.println("Enter the number: ");
	      int num = sc.nextInt();
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	      System.out.println("indices of the elements whose sum is: "+num);
	      for(int i=0; i<myArray.length; i++){
	         for (int j=i; j<myArray.length; j++){
	            if((myArray[i]+myArray[j])== num && i!=j){
	               System.out.println(i+", "+j);
	            
	            
	            }
	         }
	      }
	}

	private void Array17() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value");
		
		int n = sc . nextInt();
		
		int [] Array = new int [n];
		
		System.out.println("Enter n-1 value ");
		
		for (int i = 1; i < n; i++)
		{
			Array[i] = sc . nextInt();
		}
		
		    int missing = 0;
		
			int sum_of_array = (n*(n+1)/2);
			
			int sum = 0;
			
			for (int j = 1; j < n; j++) 
			{
			 sum = sum + Array[j];
				
			 missing = sum_of_array - sum;
				
				
			}
			System.out.println(missing);
		}
		
	private void Array16()
	{
		int [] a = {10,20,30,40,50};
		
		//int [] b = {10};
		
		int c =0;
		
		for (int i = 0; i < a.length; i++) 
		{
				 c = c+a[i];
					
	    }
			
		System.out.println(c);
		
	}

	private void Array15()
			{
		char [] A = {'P','R','U','M','A','L','P','R'};
		
		for (int i = 0; i < A.length; i++) 
		{
			for (int j = i+1; j < A.length; j++) {
				
		  if(A[i] == A[j])
		  {
			 // int C = A[j];
			  
			  System.out.println(A[j]); 
		  }
		  
		}
		}
		
		}
		
	private void Array14() 
	{
		int a[]={10,20,30,40,50,60,43};     
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0) //element based  // i - index based
		{  
		System.out.println("odd Numbers ==> "+a[i]);  
		}
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)  // element based  // i - index based
			{
				System.out.println("Even Numbers ==> "+a[i]);
			}
		}
		
	}

	private void Array13()  
	{
		int [] a = {10,20,30,40,50};
		
		char [] c = {'S','U','B','B','H','U'};
		
		char [] d =c;
		
		
		int [] b =a;
		
		   for (int j = b.length-1; j >= 0; j--)
		{
			System.out.print(b[j]+" ");
		}
		   System.out.println();
		   
		   for (int j=d.length-1; j>=0; j--) 
		   {
			System.out.print(d[j]+" ");
		}
		
	}
		
	private void Array12()   // leaner search  find target value
	{
		int [] a = {10,20,30,40,50,60};
		
		int find = 70;
	
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] == find)
			{
				System.out.println("Element = "+i);
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}

	private void Array11() 
	{
		char [] A = {'P','R','U','M','A','L','E'};
		//char B = A[0];
		for (int i = 0; i < A.length; i++) 
		{
			for (int j = i+1; j < A.length; j++)
			{
				if(A[j] == A[i])
				{
					System.out.println(A[j]);
				}
			
				else
				
					System.out.println("Not presented");
				break;
				
			}
			
		}
		
		
	}

	private void Array10() 
	{
	    char [] A = {'P','E','R','U','M','A','L','E'};
	    char B = A[0];
	    boolean norepe = false;
	   // int count = 0;
	    for (int i =1; i < A.length; i++) 
	    {
	    	if(B == A[i])
	    	{
	    		norepe = true;
	    		//System.out.println("presented");
	    		break;
	    	}
	    }
	    if(norepe == false)
	    
			System.out.println("Not presented"+ "==>"+B);
	 
	}

	private void Array9() 
	{
		char [] a = {'S','U','B','R','A','M','A','N','I','S'};
		
		char  ch = a[0];
		//boolean repeat = false;
		//int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			//for (int j=i+1; j < a.length; j++) 
			//{
				if(ch == a[i])
					
					
			System.out.print(ch+" ");
				break;
			
		//}
		}
		
	}

	private void Array8()
	{
		char [] a = {'S','U','B','R','A','M','A','N','I','S'};
		int count = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j] == a[i])
				{
					System.out.println(a[j]);
					count = count+1;
				}
				
			}
			
		}
		System.out.println("Total count is == >"+count);
		
	}

	private void Array7() 
	{
		int [] a= {1,10,10,30,30,20,40,50,1};
		int count = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i]+" ");
					
					count = count+1;	
			}	
				else 
				{
					System.out.println("No repeated");
				}
		}		 
		}
		System.out.println();
		System.out.println("Total repeat elements"+count);
		
	}

	private void Array6() 
	{
		int [] a = {1,10,20,30,40,30,60,70,70,80,9,1};
		
		//int [] b = a;
		//int count=0;
		
	for(int i = 0; i < a.length; i++)
	  {  
	for(int j = i + 1; j < a.length; j++)
	  {  
	     if(a[i] == a[j])  
	      System.out.println(a[j]);  
	          }  
	  }       
			}

	private void Array5() 
	{
		int [] a = {10,20,30,40,30,60,70};
		int count =0;
		int [] a1  = a;
		for (int i = 0; i < a1.length; i++) 
		{
		System.out.print(a1[i]+" ");
		
		count = count+a1[i];
		
		}
		System.out.println();
		System.out.println("total count is ="+count);
	}

	private void Array4() 
	{
		int [] a = {10,20,30,2,40,50,100,5};
		int big = Integer.MIN_VALUE;
		int big1 = Integer.MIN_VALUE;
		int less = Integer.MAX_VALUE;
		int less1 =Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>big)
			{
				big1 = big;
				big = a[i];	
		    }
			else if (a[i] > big1 )				
			{
					big1 = a[i];
		        }
			
		      }
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<less)
			{
				less1 = less;
				less = a[i];
				
			}
			else if(a[i]<less1)
			{
				less1 = a[i];
				
			}
		}
		
		
		System.out.println("big is  = "+big);
		System.out.println("second big is  = "+big1);			
		
		System.out.println("less is = "+less);
		System.out.println("second less ="+ less1);
		
				
	}

	private void Array3()
	{
		int [] ar1 = {10,20,30,40};
		int sum = 0;
		
		System.out.println("Legth is===> "+ar1.length);
		System.out.println();
		for (int i = 0; i < ar1.length; i++) 
		{
			 sum = sum+ar1[i];
			
			 System.out.println("ar1 ==>"+ar1[i]+" ");
			
			
		}
		 System.out.println("total is  " +sum);
		 System.out.println();
		int [] ar2 = ar1;
		
		for (int i = 0; i < ar2.length; i++) 
		{
			System.out.println("ar2 == >"+ar2[i]);
		}
		
		System.out.println("ar2.length ===>"+ar2.length);
		
		int ar3 = ar2.length + ar1.length;
		System.out.println("total is ==>"+ar3);
					
		}
		
	private void Array2() {
		
		int [] ar1 = {10,20,30,40};
		int [] ar2 = {10,20,30,40};
		/*
		 * if (ar1.length == ar2.length) { System.out.println("equal"); } else {
		 * System.out.println("Not"); }
		 */
		for (int i = 0; i < ar1.length; i++) 
		{
			for (int j = 0; j < ar2.length; j++) 
			{
				if(ar1[i] == ar2[j]) 
				{
					System.out.println("Elements are equal");
				}
				else
				{
					System.out.println("Elements are not equal");
				}
			}
		}
		}
	
	
	private void Array1() 
	{
		int [] ar1 = {10,20,30,40};
		System.out.println(ar1.length);
		
		
	}

	private void Array() 
	{
		int [] ar1 = {10,20,30,40};
		for (int i = 0; i < ar1.length; i++)
		{
			System.out.print(ar1[i]+" ");
	    }	
    }
 }
