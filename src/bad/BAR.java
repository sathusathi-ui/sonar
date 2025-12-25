package bad;

public class BAR {
	

	    public static void main(String[] args) {

	        String name = null;
	        System.out.println(name.length());   // BUG: NullPointerException

	        int a = 10;
	        int b = 0;
	        int c = a / b;                        // BUG: Division by zero

	    }
	}

}
