package com;

public class ForLoopStudy {
	
	
	public static void main(String[] args) {
		
		//Solution
		System.out.println("Before loop");
		
		for (int i = 0; i < 11; i=i+1) 
		{
			
			System.out.print(i);
			
		}
		//Solution 2
		
		for(int j=0;j<10;j++)
		{
			for (int i = 0; i < 11; i=i+1) 
			{
			
				System.out.print(i);
			
			}
			
			System.out.println();
			
		}
	
		
		
		//solution 3
		
		int total=0;
		
		for(int i=0;i<1001;i++)
		{
			total= total+i;
		}
		System.out.println(total);
		
		
	
		
		//solution 4
		
		for(int j=0;j<10;j++)
		{
			for (int i = 0; i < j; i=i+1) 
			{
			
				System.out.print(i);
			
			}
			
			System.out.println();
			
		}
	
		
		String name="Anurag";
		              
		for(int i=0;i<=name.length();i++)
		{
			System.out.println(name.substring(0, i));
		}
		
		
		
		
		
		
	}

}
