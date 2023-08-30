package array_demo;

public class Frist_letter_repeated {

	public static void main(String[] args) {
		
		Frist_letter_repeated ff= new Frist_letter_repeated();
		
		//ff.frist_letter_repeated();
		
		//ff.name_letter_repeated();
		
		//ff.second_letter_repeated();
		
		//ff. repeated_no();
		
		//ff.no_repeaated_letter();
		
		//ff.two_No_letter_check();
		
		//ff.no_repeat();
		
		//ff.no_repeat_letter_coounts();
		
		//ff.most_repeated_letter();
		
		//ff.Addition_array();
		
		//ff.Addition_Array_Another();
		
		ff.Concatenation();
		
		//ff.Adjecent_program();
		
		//ff.Adjecent_program1();
		
		//ff.Adjecent_program2(); // small value asign frist position // big value asing asign second position
		
		//ff.removable_duplicate();
		
		//ff.sub_array();
		
		
	}
		
		
		private void sub_array() {
			int [] ar = {10,20,30,40,50,60};
			int [] ar1 = {10,20,30,80};
			
			int count=0;
			for(int j=0; j<ar1.length; j++)
			{
				int value =ar1[j];
				boolean present =false;
			for(int i=0; i<ar.length; i++)
			{
				if(ar1[j]==ar[i])
				{
					System.out.println(ar1[i]);
					count++;
				present = true;
				}
			}
				if(present == false)
				{
					System.out.println(ar1[j]);
					System.out.println("this not Sub_Array");
					break;
				}
				}
				if(count==ar1.length)
				{
					System.out.println("this sub_array");
					
					
				}
			}
			
			
		
		
	


		private void removable_duplicate() {
		
			int [] array = {10,10,10,20,20,30,30,40,50,60,70};
			int unique = 1;
			for(int i = 0; i<array.length-1; i++)
			{
				if(array[i]!= array[i+1])
				{
					array[unique] = array[i+1];
					//System.out.println(array[i]);
					unique++;
				}
			}
			
			  for(int i =0; i<unique; i++) 
			  { 
				  System.out.println(array[i]+"  ");
			  }
			 
				}
					
			
		
	


		private void Adjecent_program2() {
		
            int [] array = {10,5,15};
			
			for(int i = 0; i<array.length-1; i++)
			{
				
			    int big = array[i] > array[i+1] ? array[i]:array[i+1];
			    int small = array[i] < array[i+1] ? array[i]:array[i+1];
			    
				int no1 = small;
				
				int no2 = big;
				
				for(int j = no1 ; j<=no2; j++)
				{
					System.out.print(j +" ");
				}
				System.out.println();
			}
	}


		private void Adjecent_program1() {
int [] array = {5,10,15,20};
			
			for(int i = 0; i<array.length-1; i++)
			{
				int no1 = array[i];
				
				int no2 = array[i+1];
				
				for(int j =no1+1 ; j<no2; j++)
				{
					System.out.print(j +" ");
				}
				System.out.println();
			}
		
	}


		private void Adjecent_program() {
		
			int [] array = {5,10,15,20};
			
			for(int i = 0; i<array.length-1; i++)
			{
				int no1 = array[i];
				
				int no2 = array[i+1];
				
				for(int j =no1 ; j<=no2; j++)
				{
					System.out.print(j +" ");
				}
				System.out.println();
			}
		
	}


		private void Concatenation() {
		 
			int [] a = {5,10,15};
			int [] b = {20,25,30};
			int j =0;
			
			int  [] result = new int [a.length+b.length];
			
			for(int i=0 ; i<result.length; i++)
			{
				if(i<a.length)
				
					result [i] = a[i];
				
				else 
				{
				result [i] =  b[j];
				
				j++;
				}
				System.out.println(result[i]);
				
			}

		
	}


		private void Addition_Array_Another() {
		
			int [] a = {5,10,15,20};
			int [] b = { 15,10,5};
			int big = a.length>b.length? a.length:b.length;
			int small = b.length<b.length? a.length:b.length;
			
			int [] result = new int[big];
			
			for(int i=0; i<big; i++)
			{
				if(i<small)
				{
					result [i] = a[i] + b[i];
				
				System.out.println(result[i]);
			}
				else
				{
					result[i] = a[i];
				
				}
				System.out.println(result[i]+" ");
		
	}
		}
		


		private void Addition_array() {
			
			int [ ]  a = {5,10,15};
			int [] b = {15,10,5};
			
			int [] c= new int[a.length];
			
			for(int i =0 ; i<a.length; i++)
			{
				c [i] = a[i]+b[i];
				System.out.println(c[i]);
				
			}
			
		
	
			
			
			
		
	}


		private void most_repeated_letter() {
			
            char [] name = { 'S','U','V','E','T','H','A','S','S'};
			
			
            int big = 0;
			
			char ch1 = ' ';
			for(int j=0; j<name.length; j++)
			{
				int count = 1; 
				char ch = name [j];
				if(ch == '*')
				continue;
				for(int i=j+1; i<name.length;i++)
				{
					if(ch==name[i])
					{
						name[i]='*';
						count++;
					}
				}
				if(count>big)
				{
					big = count;
					ch1 = ch;	
				}
			}
				System.out.println("Most Repeat letter " +ch1 +"  count is " +"   "+ big);	
	}


		private void no_repeat_letter_coounts() {
			
        char [] name = { 'S','U','V','E','T','H','A','S','S'};
			
			
			for(int j=0; j<name.length; j++)
			{
				int count = 1; 
				char ch = name [j];
				if(ch == '*')
				continue;
				for(int i=j+1; i<name.length;i++)
				{
					if(ch==name[i])
					{
						name[i]='*';
						count++;
					}
				}
				
				System.out.println("Count is == >"+  "  " +ch + "   " + count);
			}
	}


		private void no_repeat() {
		
			char [] name = { 'S','U','V','E','T','H','A','S','S'};
			
			int count = 1; 
			
			for(int j=0; j<name.length; j++)
			{
				boolean repeated = false;
				char ch = name [j];
				if(ch == '*')
					continue;
				for(int i=j+1; i<name.length;i++)
				{
					if(ch==name[i])
					{
						name[i]='*';
						repeated = true;
						count++;
					}
				}
				if(repeated == false)
				{
					System.out.println("No letter repeat==>"+ch);
				//break;
					}
			}
			System.out.println(count);
				}
		
			
	


		private void two_No_letter_check() {
			
			char []  name = { 'S','A','R','A','V','A','N','A'};
		    for(int j= 0; j<name.length; j++)
		    {
		    boolean repeated = false;
		    char ch = name[0];
		    for(int i=j+1; i<name.length; i++ )
		    {
		    	if(ch == name[i])
		    	{
		    		repeated = true;
		    	}
		    }
		    if(repeated == false)
		    {
		    	System.out.println("Frist no repeated letter ===> "+ch);
		    	break;
		    }
		    repeated =false;
		    ch = name[1];
		    for(int i=1; i<name.length; i++ )
		    {
		    	if(ch == name[1])
		    	{
		    		repeated = true;
		    	}
		    }
		    	 if(repeated == false)
				    {
		    		
				    	System.out.println(" no repeated letter ===> "+ch);
				    	break;
				    	
				    
		
		    
		    }
		    }
		    
		    }
	


		private void no_repeaated_letter() {
			
			boolean repeated = false;
		
			 char [] name = { 'M' , 'N' , 'N' ,'I'}; // frist letter not repeated
			 
			 char ch =name[0];
			 for(int i =1  ; i<name.length ; i++)
					 {
				 if(ch == name[i])
				 {
					repeated = true;
					break;
					
				 }
					 }
			 if(repeated == false)
				 System.out.println("No repeated === >"+ ch);
		}
		 
				
		
	


		private void repeated_no() {
			
		//   boolean repeated = false;
		  int  count = 0;
		   
			 char [] name = {'B' , 'S' , 'S' , 'R' ,'A' , 'A' , 'N' , 'N' ,'I','I'};
				// repeated letters print 
			 // index postion
			
			for(int j=0; j<name.length-1; j++)
				
			{
				char ch = name[j]; 
				
				for(int i=j+1; i<name.length; i++)
				{
				if(ch==name[i])
				{
					System.out.println("fourth letter repeated is === >"+ch);
				//repeated = true;
				count++;
				break;	
				}
				  if(count==4) 
					  // if(count==mark.length)
			 break;	 
				}
			}
				}
			/*
			 * if(repeated == false) System.out.println("No repeated letters"); // break;
			 */		
			
	
		private void second_letter_repeated() {
			
    char [] name = {'B' , 'S' , 'S' , 'R' ,'A' , 'M' , 'A' , 'R' ,'I'};
			
			 // index postion
			
			for(int j=0; j<name.length-1; j++)
				
			{
				char ch = name[j]; 
				
				for(int i=j+1; i<name.length; i++)
				{
				if(ch==name[i])
				{
					System.out.println("fourth letter repeated is === >"+ch);
				
					//break;
				}
				
				
				 /* else System.out.println("No repeated Letters");
				}*/
				   
				 
				}
				
				
				break;	
			}
			
	
		}

 
		private void name_letter_repeated() {
		
			char [] name = {'S' , 'U' , 'B' , 'R' ,'A' , 'M' , 'A' , 'N' ,'I'};
			
			char ch = name[0];
			
			for(int i=1; i<name.length; i++)
			{
				if(ch==name[i])
				{
					System.out.println("frist letter repeated is === >"+ch);
				
					break;
				}
				else 
					System.out.println("No repeated Letters");
			}
				
	}


		public void frist_letter_repeated()
		{
			
		
		char [] name = {'A' , 'N' , 'A' , 'N' ,'D' , 'A'};
		
		char ch = name[0];
		
		for(int i=1; i<name.length; i++)
		{
			if(ch==name[i])
			{
				System.out.println("frist letter repeated is === >"+ch);
				break;
			}
			
		}
		

	}

}
