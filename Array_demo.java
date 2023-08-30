package array_demo;

import java.util.Iterator;
import java.util.Scanner;

public class Array_demo {

	public static void main(String[] args) 
	{
		//System.out.println(args.length);
		
		Array_demo ad = new Array_demo ();
		
		//ad.learning();
		//ad.learning_1();
		//ad.learning2();
		//ad.learning3();
		//ad.learning4();
		//ad.learning5();
		
		

	}
	private void learning5() {
		
		int [] Array = { 5, -10,-22,30,-40,50,-60};
		
		int count = 0;
		
		for(int i =0 ; i<Array.length; i++)
		{
			
			if(Array[i]<0 ) // find count 
			{
				count++;
				
				
			}
			//if(Array[i]<0)    // 20 div
			if(Array[i]<0 && Array[i]%20 == 0)
			{
				//System.out.println("Negative Value === >"+Array[i]);
				System.out.println("Negative number %20 === >"+Array[i]);
				
				
			} //postion 
			if(Array[i]<0 && (i % 2 == 0))
			{
				
				System.out.println("Negative  position === >"+i);
				
			}
			
			
		}
		System.out.println("Negative  counts === >"+count);
		
	}
	private void learning4() {
		
			//System.out.println(Integer.MAX_VALUE);
			//System.out.println(Integer.MIN_VALUE);
			
			int [] Score = { 96 ,45,99,98,100};
			int total = 0;
			
			int lowest = Integer.MAX_VALUE ,Lowest_second = Integer.MAX_VALUE;
			
			//int lowest = 
			for(int  i = 0; i<Score.length ; i++)
			{
				if(Score [ i]<lowest)
				{
				//Lowest_second = lowest;
				lowest = Score[i];
				
			
				}
				else if (Score[i]<Lowest_second)
				{
					Lowest_second = Score [i];
					
				}
				total+=Score[i];
				
			}
			System.out.println(total);
			System.out.println(total/Score.length);
			
		System.out.println("Lowest ===>"+lowest);
		System.out.println(" Second Lowest ===>"+Lowest_second);
		
			
			
		
	}
	private void learning3() {
		System.out.println(Integer.MAX_VALUE);
		
		int [] Score = { 96 ,45,99,98,100};
		
		int high = Score[0] ,second = Score[0];
		for(int  i = 1; i<Score.length ; i++)
		{
			if(Score [ i]>high)
			{
			//second = high;
			high = Score[i];
			}
			else if (Score[i]>second)
			{
				second = Score [i];
				
			}
		}
		
	System.out.println("highest score ===>"+high);
	System.out.println(" Second highest score ===>"+second);
	
		
		
	}
	private void learning2() {
	int [] marks = { 96 ,96,100,98,100};
		
		int high=0;
	    int low=marks[0];
	   int  count = 0;
	   int count1 =0;
		
		
		for (int i = 0; i < marks.length; i++)
		{
			
			
			
			if(marks[i] ==100 )
			{
				count +=1;
				System.out.println("Index position === >"+i);
			}
			
			if(marks[i]>=96)
			{
				count1+=1;
			}
				
				/*
				 * if(marks[i]>high) { high= marks[i]; } if(marks[i]<low) { low= marks[i];
				 */
		}
		System.out.println(" full mark === >"+count);
		
		
		System.out.println("counts 96 === >"+count1);
			
		
		}
		//System.out.println("Highest_Mark : "+high);
		//System.out.println("Highest_Mark : "+low);
		
			

		
		
	
		
	
	private void learning_1() {
		
		int [] marks = { 98 ,98,100,88,100};
		
		int high=0;
	    int low=marks[0];
		
		
		for (int i = 0; i < marks.length; i++)
		{
			if(marks[i]>high)
			{
				high= marks[i];	
		}
			if(marks[i]<low)
			{
				low= marks[i];	
				
		}
		
		}
		System.out.println("Highest_Mark : "+high);
		//System.out.println("Highest_Mark : "+low);
			
		}
		
		
	
	private void learning() {
		
		int [] marks = new int[5];
		
Scanner sc = new Scanner (System.in);
		
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter Marks : ");
			marks[i] = sc.nextInt();
		}
		sc.close();
					
		/*
		 * marks[0] = 95; marks[1] = 96; marks[2] = 98; marks[3] = 99; marks[4] = 100;
		 * 
		 * 
		 * System.out.println(marks[0] = 95); System.out.println(marks[1] = 96);
		 * System.out.println(marks[2] = 98); System.out.println(marks[0] = 99);
		 * System.out.println(marks[0] = 100);
		 * 
		 * 
		 * 
		 * for(int i=0; i<marks.length; i++) { System.out.println(marks[i]); //
		 * total=total+marks[i]; total+=marks[i];
		 * 
		 * } System.out.println("Total is ==> " +total);
		 * System.out.println("NO of subject ==> "+marks.length );
		 * System.out.println("Percentage ==> "+total/marks.length);
		 */
		 
		

		
	}

}
