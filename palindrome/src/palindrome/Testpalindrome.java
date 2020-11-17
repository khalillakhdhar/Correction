package palindrome;

public class Testpalindrome {
	  static int [] arr = new int [] {3, 2,3,4};  

public static boolean teste(int[] arr1)
{
	
  
	int i;
	 for ( i= 0;i<=(arr.length)/2; i++) {  
  
		 if(arr[i]!=arr[arr.length-1-i])
			 break;
		 
     }
	 return i>=arr.length/2;
	
	
	
	
	
}
public static void main(String[] args) {  
    //Initialize array  
System.out.println(teste(arr)); 
   
}  

}
