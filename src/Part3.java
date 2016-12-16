import java.util.Scanner;

/**
 * 
 */

/**
 * @author t.marten
 *
 */
public class Part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		String userNum;
		int numToCheck = -1;
		boolean prime;
		
		do{
			System.out.println("Please insert a number.");
			userNum = userInput.next();
			if(userNum.contains(".") || Integer.parseInt(userNum) <= 0){
				System.out.println("Please insert a positive integer value.");
			}
			else{
				numToCheck = Integer.parseInt(userNum);
			}
		}while(userNum.contains(".") || Integer.parseInt(userNum) <= 0);
		
		prime = primeNum(numToCheck);
		
		if(prime == false){
			System.out.println("Your number not is prime");
		}
		if(prime == true){
			System.out.println("Your number is prime");
		}
		
		userInput.close();
		
	}
	public static boolean primeNum(int userNum){
	
		boolean isPrime = true;
		
		for(int i = 2; isPrime && i < Math.sqrt(userNum); i++){ 
			
			if(userNum % i == 0){
				isPrime = false;	
			}
			else{
				isPrime = true;
			}
		}
		return(isPrime);
	}

}
