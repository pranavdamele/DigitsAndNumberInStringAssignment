public class DigitsAndNumberInStringAssignment {

	public static void main(String[] args) {
		String s = "a12bcd98GGC1239K";		
		String [] sNums = s.split("\\D+");
		String [] sDigits = s.split("");
		int numSum = 0;
		int digSum = 0;
		System.out.println("String is : "+s);

		// Sum of the Digits in the string
		System.out.print("\nDigits are : ");
		for (String d : sDigits)
		{
			try
			{
				System.out.print(Integer.parseInt(d)+" ");
				digSum=digSum+Integer.parseInt(d);
			}catch(Exception ex){}
		}
		System.out.println("\nSum of Digits is "+digSum);
		
		// Sum of the Numbers in the string
		for (String k : sNums)
		{
			try
			{
				if(k.equals(""))
				{
					System.out.print("\nNumbers are : ");
				}else
				{
					System.out.print(Integer.parseInt(k)+" ");
					numSum=numSum+Integer.parseInt(k);
				}	
			} catch (Exception ex){}	
		}
		System.out.println("\nSum of Numbers is "+numSum);		
	}
}