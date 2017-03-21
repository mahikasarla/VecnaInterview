package mahi;
public class PrimesImprovement {

	public static void main(String[] args) {
	 
	    //This code should print out the prime numbers.
	    //task: Fix and improve the algorithm
		// To fix this code:
		//Here to print prime numbers we need two modifications those are i=2 & j=2 here numbers are being checked 4851 times for prime numbers by considering even numbers. You can check this by commenting lines ( 25, 37, 38,39).
		  //To improve complexity:
		// All the prime numbers are odd except 2 so avoid even numbers.
		// This logic is given in lines (25, 37, 38,39).
		  //This logic avoids all the even numbers from being checked but 2 is a prime number so we need to write an extra condition to count 2 as prime number. Check the code in lines (37,38,39).
		// Below code gives you prime numbers along with how many times numbers are being checked(loops). The number is 2402 here. 
		// by writing this code it works almost 50% more efficient.
	
	    System.out.println("Printing primes from 1 to 100");
	    int i;
	    int j;
	    int loops=0;
	    boolean prime;	
	    
	    for(i = 2; i <= 100; i++) // Here we need modification to fix the code.
	    { 
	    	prime = true;
	    	if ((i)%2!=0){ // To avoid even numbers
	    	
	    		for(j = 2; j < i; j++) // Here we need modification to fix the code. It starts from number 3 
	    		{
	    			if(i % j == 0) prime = false;
	    			loops++;
	    		} 
	    	  if(prime)
	    	  	{
	    		  System.out.print(i + " ");
	    	  	}
	    	} else if (i==2){
		    		 System.out.print( i + " "); // Printing 2 as prime number because it wasn't counted in above logic.
		    		 loops++;}
	    }
	    System.out.println();
	    System.out.println("loops : " + loops);// To compare how complexity changed. 
	  }
	}


