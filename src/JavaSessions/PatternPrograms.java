package JavaSessions;

import java.util.Scanner;

public class PatternPrograms {

	public static void main(String[] args) {
		/*
		 1
		 12
		 123
		 1234
		 */
		
		int i,j,n;
		   System.out.print("Input number of rows : ");
		   Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    //for rows
		    for(i=1;i<=n;i++)
		    {
		    	//for columns
		    	for(j=1;j<=i;j++)
		    	{
		    		  System.out.print(j);
		    		  
		    	}
		        System.out.println("");
		    }
		
	}



	}


