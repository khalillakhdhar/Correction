package palindrome;

public class Testpalindrome {
	public  boolean teste(int[] arr1)
	{
		
	  
		int i;
		 for ( i= 0;i<=(arr1.length)/2; i++) {  
	      
			 if(arr1[i]!=arr1[arr1.length-1-i])
				 break;
			 
	     }
		 return i>=arr1.length/2;
		
		
		
		
		
	}
}
