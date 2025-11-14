// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		int i = 0;
		int resultplus = 0;
		while(i < x1) {
			x2++;
			i++;
		}
		resultplus = x2;
		return resultplus;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int resultminus = 0;
		while(x2 != 0) {
			x2--;
			x1--;
		}
		resultminus = x2;
		return resultminus;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int resulttimes = 0;
		int tempx1 = x1;
		while(x2 != 1){
			x1 = plus(tempx1, x1);
			x2--;
		}
		x1 = resulttimes;
		return resulttimes;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int tempx = 0;
		int resultpow = 0;
		while(n != 1){
			x = times(tempx,x);
			n--;
		}
		resultpow = x;
		return resultpow;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int resultdiv = 0;
		while (x1 != 0) {
			x1 = minus(x1, x2);
			resultdiv++;
		}
		return resultdiv;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int timesofmod = 0;
		int resltmod = 0;
		int tempx2 = x2;
		int tempx1 = x1;
		while(x1 > x2 && x2 != 0){
			x1 = minus(x1, x2);
			x2--;
			timesofmod++;
		}
		int resulttimes = times(timesofmod, tempx2);
		resltmod = minus(tempx1, resulttimes);
		return resltmod;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
	int i = 1;
	int resultsqrt = 0;
	while (pow(i, i) != x) {
		i++;

	}
	i++;
	resultsqrt = pow(i, i);
		return resultsqrt;
	}	  	  
}

