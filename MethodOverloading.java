package basicprograms;

 class MethodOverloading {
	
		    //  This is method Overloading to print a integer
		    void print(int number) {
		        System.out.println(number);
		    }

		    // This is method Overloading to print a double
		    void print(double number) {
		        System.out.println(number);
		    }

		    //  This is method Overloading to print a string
		    void print(String text) {
		        System.out.println(text);
		    }
		

		
		    public static void main(String[] args) {
		    	MethodOverloading  printer = new MethodOverloading ();

		        // Calling the overloaded methods
		        printer.print(10);           
		        printer.print(5.5);          
		        printer.print("I am greateful ");
		    }
 }
		    
		

	
	
