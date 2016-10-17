/**
 * This class demonstrates the function and behavior of the substring method.
 * The substring method is a method of the String class and has two forms that
 * will be demonstrated in main method
 */
public class SubstringMethod
{
	/** 
	 * Main method shows behavior of substring(int, int) and substring(int)
	 * @param args
	 */
	public static void main(String[] args)
	{
		String str = new String("abcdefg");
		//Substring(int) method
		String a = str.substring(2);
		System.out.println("The string began as 'abcdefg' and a new string was created with substring that should be 'cdefg'");
		System.out.println("The resulting string is: " + a);
		System.out.println("This illustrates the behavior of the method substring(2). The new string will include the third character to the end of the string");
		
		//Substring(int, int)
		String b = str.substring(1, 4);
		System.out.println("The string began as 'abcdefg' and a new string was created with substring that should be 'bcd'");
		System.out.println("The resulting string is: " + b);
		System.out.println("This illustrates the behavior of the method substring(1, 4). The new string will begin at the second character and up to but not including the fifth character. ");
	}
}

/*The following is documentation from Oracle's website on substring(int) method
	Returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.

		Examples:

			"unhappy".substring(2) returns "happy"
 			"Harbison".substring(3) returns "bison"
 			"emptiness".substring(9) returns "" (an empty string)
 
	Parameters:
		beginIndex - the beginning index, inclusive.
	Returns:
		the specified substring.
	Throws:
		IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.

The following is documentation from Oracle's website on substring(int, int) method
	Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.

		Examples:

 			"hamburger".substring(4, 8) returns "urge"
			"smiles".substring(1, 5) returns "mile"
 
	Parameters:
		beginIndex - the beginning index, inclusive.
		endIndex - the ending index, exclusive.
	Returns:
		the specified substring.
	Throws:
		IndexOutOfBoundsException - if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex. 
*/