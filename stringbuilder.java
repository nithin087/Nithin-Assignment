package general;

public class stringbuilder {

	public static void main(String[] args) {
		// StringBuilder Example. StringBuilder is Mutable. Strings are immutable.
		
		StringBuilder str = new StringBuilder("Welcome to UST");
		
		System.out.println(str);
		
		str.append(" Global");
		
		System.out.println(str);
		
		//str.delete(2,5);
		//System.out.println(str);
		
		str.insert(8, " Hyderabad ");
		System.out.println(str);
		
		str.replace(7, 19, " Hyd ");
		System.out.println(str);
		
		
		System.out.println(str.substring(0,7));
		
		
		System.out.println(str.reverse());		
	}

}