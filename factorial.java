/*--------------------------------------------------------------------------------------*/
/*  factorial.java  -  Factorials 101                                                   */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:  Kshitij Shah                                                               */
/*  Date:    March 7 2017                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:   #                                                                          */
/*  Output:  factorial of #                                                             */
/*--------------------------------------------------------------------------------------*/

import java.io.*;

public class factorial {
    //recursive integer function returns factorial of a number
    static int f(int num) { //integer input number
	if (num <= 1) { //Base Case
	    return 1;
	} else {  //General Case
	    return num * f(num - 1);
	}
    }

    public static void main (String str[]) throws IOException {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	
	System.out.println("Factorial: Input a number (0 <= n <= 16) and I will return the factorial of it!\n\n");
	System.out.print("What number do you want to find the factorial for?: ");
	int a = Integer.parseInt(stdin.readLine());
	int num = f(a);
	System.out.println ("The factorial is " + num);
    }
}

