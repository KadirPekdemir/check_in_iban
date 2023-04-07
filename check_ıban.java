import java.util.Scanner;

//Kadir PEKDEMÝR 150121069
//This program checks whether the bank card number is valid or invalid.

public class HW4_Q2_150121069 {

	
	
	public static void main(String[] args) {
		   // Create Scanner
			Scanner input = new Scanner(System.in);
				
			String number = input.nextLine();
			
			//Find invalid inputs
			int x=0;
			for(int i=0;i<number.length();i++) {
				if(( !(number.charAt(i)==' '||(int)(number.charAt(i))>=48 && (int)(number.charAt(i))<=57))) {	
					x=1;
					break;
				}
				
			}		 
			
			if(x==1) {
				System.out.println("Invalid Input !");
			}
			else {
				
			   //Call method
				if(validateNumber(number)==true) 
						System.out.println("Number is Valid");
					
				else
					   System.out.println("Number is Invalid"); 
			
			}
			
			}
			public static boolean validateNumber (String number) {
				 
				
				//Delete the space between numbers
				String str ="";
				
				for(int i =0;i<number.length();i++) {
			    	if(number.charAt(i)!= ' ') {
			    		str=str+number.charAt(i);
			    	}
			    }
			    
			    //Creates the desired variables
				String DNumber="";
				String LNumber="";
					if(str.length()%2==1) {
						for(int k=0;k<str.length();k++) {
							
							if(k%2==1) {
								DNumber=DNumber+str.charAt(k);
								
							}
							else {
								DNumber=DNumber+"_";
							}
						}
						//Performs the required calculation.
						for(int i=0;i<str.length();i++) {
							if(i%2==1) {
								if((str.charAt(i)*2-96)>9) {
									LNumber=LNumber + ((str.charAt(i)*2-96)-9);
								}
								else
									LNumber=LNumber + (str.charAt(i)*2-96);
							}
							else
								LNumber=LNumber+str.charAt(i);
						}
						
					}
					if(str.length()%2==0) {
						for(int k=0;k<str.length();k++) {
							
							if(k%2==0) {
								DNumber=DNumber+str.charAt(k);
								
							}
							else {
								DNumber=DNumber+"_";
							}
						}
						
						for(int i=0;i<str.length();i++) {
							if(i%2==0) {
								if((str.charAt(i)*2-96)>9) {
									LNumber=LNumber + ((str.charAt(i)*2-96)-9);
								}
								else
									LNumber=LNumber + (str.charAt(i)*2-96);
							}
							else
								LNumber=LNumber+str.charAt(i);
						}
					}
				  //Prints the variables
			      System.out.println("DNumber:"+DNumber);
			      System.out.println("LNumber:"+LNumber);	
						
					//Add up newly formed numbers	
					int sum=0;
				   
					for(int i=0;i<str.length();i++) {
					   sum=sum+(LNumber.charAt(i)-48);
				    }
					
				    if(sum%10==0) {
					   return true;
				    }
				    else
				  	   return false;
				
				
			}

}
