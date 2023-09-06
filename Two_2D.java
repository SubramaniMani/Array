package two_dimentional_Array;

import java.util.Scanner;

public class Two_2D {

	public static void main(String[] args) {
		
		Two_2D  A = new Two_2D ();
		
		//A.two_Array();
		//A.Array();
		//A.player();
		//A.matrix();
		//A.marks_of_lenth();
		A.sprial();
		
	}
		
		private void sprial() {
			int [] [] a= new int [4] [4];
			        int n = 4; // Size of the spiral (change this value to change the size)

			        int[][] spiral = new int[n][n];

			        int num = 1;
			        int rowStart = 0, rowEnd = n - 1;
			        int colStart = 0, colEnd = n - 1;

			        while (num <= n * n) {
			            // Traverse right
			            for (int i = colStart; i <= colEnd; i++) {
			                spiral[rowStart][i] = num++;
			            }
			            rowStart++;

			            // Traverse down
			            for (int i = rowStart; i <= rowEnd; i++) {
			                spiral[i][colEnd] = num++;
			            }
			            colEnd--;

			            // Traverse left
			            for (int i = colEnd; i >= colStart; i--) {
			                spiral[rowEnd][i] = num++;
			            }
			            rowEnd--;

			            // Traverse up
			            for (int i = rowEnd; i >= rowStart; i--) {
			                spiral[i][colStart] = num++;
			            }
			            colStart++;
			        }

			        // Print the spiral pattern
			        for (int i = 0; i < n; i++) {
			            for (int j = 0; j < n; j++) {
			                System.out.print(spiral[i][j] + "\t");
			            }
			            System.out.println();
			        }
			    }
			

		private void marks_of_lenth() {
		int [][] marks = {{23,45,65,35},{55,44,77,77}};
		int row =0;
		int total = 0;
		while (row <marks.length) 
		{
		for ( int col=0;col<marks[row].length;col++)
		{
        total = total + marks [row][col];
		}
        System.out.println("total== > "+total);
			total=0;
			row++;
		}	
		}
		
		
		
	

	

		private void matrix() {
			int [][] a= {{10,20},{30,40}};
			int [][] b= {{40,30},{20,10}};
			int [][] c = new int [2][2];
		for (int row =0;row<c.length;row++) {
		for ( int col=0;col<c[row].length;col++) {
			
		
			c[row][col]=a[row][col]+b[row][col];
			System.out.print(c[row][col]+" ");
			
		}
		System.out.println();
		}
		
	}

		private void player() 
		{
			int [][] play = new int[2][];
			  System.out.println(play.length);
			  play[0] = new int [4];
			  int total=0;
			  Scanner sc = new Scanner(System.in);
			  for(int match = 0;match < 4;match++)
			  {
			   System.out.println("enter score: ");
			   play[0][match] = sc.nextInt();
			   total+=play[0][match];
			  }
			  System.out.println(total);
			  System.out.println("percentage"+"  "+total/play[0].length);
			  
			  // second array 
			  play[1] = new int [3];
			  for(int match = 0;match < 3;match++)
			  {
			   System.out.println("enter score: ");
			   play[0][match] = sc.nextInt();
			   total+=play[1][match];
			  }
			  System.out.println(total);
			  System.out.println("percentage"+"  "+total/play[1].length);
			 }


		
			
	

		private void Array() {
			
			int [] [] score = {{10,20,30,40,50},{60,70,80,90}};
			int player = 0;
			
			while(player< 2) 
			{
				
			for (int i = 0; i < 5; i++) 
			{
				
				System.out.println(score[player][i]);
				
			}
			System.out.println();
			player++;
			
			
		}

		
		
	}

		private void two_Array() {
			// TODO Auto-generated method stub
			
		
		int [] [] score = {
				
				{10,20,30,40,50},{60,70,80,90}};
		int player = 0;
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(score[player][i]);
			
		}
		System.out.println();
		player++;
		
		
	}

	
	}


