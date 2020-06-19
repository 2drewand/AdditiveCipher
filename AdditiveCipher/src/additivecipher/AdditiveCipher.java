/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additivecipher;

/**
 *
 * @author aand1
 */
public class AdditiveCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
	{
		System.out.println("**********************************************************************************************\n"
+"Andrew Cleary - CS455 Cryptography and Network Security\n"
+"Midterm Project - AdditiveCipher.java\n"
+"Simulates a brute force attack on an additive cipher.\n"
+"Displays every possible plaintext result by progressing through each key choice.\n"				  +"**********************************************************************************************\n");	

		String guess = "";
		String cipherText = "UOISCXEWLOBDOX";

		//array of characters we can use 
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
				'P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] text2Num = new int[cipherText.length()];		
		//try each key on the cipher text
		for(int key = 0; key < 26; key++)
		{
			for(int i = 0; i < cipherText.length(); i++)
			{
				for(int x = 0; x < 26; x++)
				{
					/*If(chiperText.charAt[location] == alphabet value
                                        Find index of x
                                        Step One: translate chipper 0 to number (u =20)
                                        Step two: p = (20-key)
                                                If key = 24 and p = (20-24) make sure key is > 0 by adding 26 to the negative number
                                        Step 3: p is a number so translate p into a letter again. Add p to guess string*/
                                    if(cipherText.charAt(i)  == alphabet[x])
                                    {
                                       text2Num[i] = x;
                                       text2Num[i] = text2Num[i] - key %26;
                                    }
                                    
                                    if(text2Num[i] < 0)
                                    {
                                        text2Num[i] = text2Num[i] + 26;
                                    }
                                    
				}
                                guess += alphabet[text2Num[i]];
			}
			System.out.print(guess + "\n"); //display each guess
			guess = "";
		}
	}//end main

    
}
