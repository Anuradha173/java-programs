package basicprograms;

public class Global_Var {
	    static int a;
	    static int b; 
	    static int c;

	    public static void main(String arg[]) {
	        c=multiply();
	        System.out.println(c); 
	    }

	    static int multiply() {
	       a=90;
	       b=30;
	       return a*b;   
	    }
	}