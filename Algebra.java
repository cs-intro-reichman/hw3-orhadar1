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
	 if (x2 > 0) {
        while (x2 != 0) {
            x1++;   
            x2--;   
        }
    } else {
        while (x2 != 0) {
            x1--;  
            x2++;   
        }
    }
    return x1;

	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		 if (x2 > 0) {
        while (x2 != 0) {
            x1--;   
            x2--;   
        }
    } else {
        while (x2 != 0) {
            x1++;  
            x2++;   
        }
    }
    return x1;

	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int tempx1 = Math.abs(x1);
		int tempx2 = Math.abs(x2);
		if (x2 == 0 || x1 == 0) {
				return 0;
			}
			if(x1 < 0 && x2 < 0){
				tempx2++;
				while(tempx2 >= 1)
				{
					x1 = plus(x1, tempx1);
					tempx2--;
				}
			}
			else if(x2 < 0 && tempx2 > 0 && x1 > 0){
				while(tempx2 >= 0)
				{
					x1 = minus(x1,tempx1);
					tempx2--;
				}
			}
			else if(x1 < 0 && tempx2 > 0 && x2 > 0)
			{
				while(tempx2 > 1)
				{
					x1 = minus(x1, tempx1);
					tempx2--;
				}
			}
			else{
				while(tempx2 != 1){
					x1 = plus(x1, tempx1);
					tempx2--;
				}
			}
		return x1;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int tempx = x;
		if(n == 0){
			x = 1;
		}
		while(n != 1 && n != 0){
			x = times(tempx,x);
			n--;
		}
		
		return x;
	}

	
	public static int div(int x1, int x2) {
		boolean negative = false;

  
    if (x1 < 0) {
        negative = !negative;     
        x1 = minus(0, x1);        
    }

    if (x2 < 0) {
        negative = !negative;
        x2 = minus(0, x2);         
    }

    
    int result = 0;
    int remaining = x1;

    // כמה פעמים x2 נכנס בתוך x1?
    while (remaining >= x2) {
        remaining = minus(remaining, x2);  
        result   = plus(result, 1);        
    }


    if (negative && result != 0) {
        result = minus(0, result);        
    }

    return result;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		
		 while (x1 >= x2) {
        x1 = minus(x1, x2);  
    }
		return x1;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
	int i = 1;
	if(x == 0){
		i = 0;
	}
	while (times(i, i) != x) {
		i++;
	}
		return i;
	}	  	  
}

