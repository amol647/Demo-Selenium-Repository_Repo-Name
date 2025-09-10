package testJavaTrainingPackage;

public class ReverseAString {

	//Reverse A String Using StringBuilder Methods

	public static void ReverseStringWithStringBuilderMethod()
	{
		String originalString = "Amol";

		String reversedString = new StringBuilder(originalString).reverse().toString();
		
		System.out.println(reversedString);		
	}
	
	
	public static void ReverseStringWithManualLoop()
	{
		
		String str = "Shardul";
		
		String reversed = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed = reversed + str.charAt(i);
		}
		
		System.out.println(reversed);
		
	}
	
	public static void main(String[] args) {
		
		ReverseStringWithManualLoop();
	}

}
