/**
 * 
 */
package com.nwwebdesign.UPCEncoder;

/**
 * @author Britney
 *
 */
public class EAN {

	/**
	 * @param args
	 */
	public static int getCheckDigit(String UPCNumber, int barcodeType) {
		
		char UPCNumberArray[] = UPCNumber.toCharArray();
		int UPCNumArray[] = new int[UPCNumberArray.length];
		
		
		for (int i = 0; i < UPCNumberArray.length; i++){
			
			UPCNumArray[i] = Integer.parseInt(String.valueOf((char) UPCNumberArray[i]));
			
		}
		
		float barcodeSUM = 0;
		
		int CheckDigit = 0;
		
		switch (barcodeType){
		
		case 8: 
			for (int i = 0; i < 7; i++){
				
				if (i % 2 == 0){
					
					barcodeSUM = barcodeSUM + (UPCNumArray[i] * 3);
					
				}
				else{
					
					barcodeSUM = barcodeSUM + UPCNumArray[i];
					
				}
				
				CheckDigit = (int) ((Math.ceil(barcodeSUM / 10) * 10) - barcodeSUM);
				
			}
			break;
			
		case 13: 
			for (int i = 0; i < 12; i++){
				
				if (i % 2 > 0){
					
					barcodeSUM = barcodeSUM + (UPCNumArray[i] * 3);
					
				}
				else{
					
					barcodeSUM = barcodeSUM + UPCNumArray[i];
					
				}
				
			}
				
			CheckDigit = (int) ((Math.ceil(barcodeSUM / 10) * 10) - barcodeSUM);
			break;
					
		}
		
		return CheckDigit;
		
	}

	/**
	 * @param args
	 */
	public static String getEncodedStringEAN8(String UPCNumber) {
		
		String EncodedEAN8 = null;
		String[] firstDigitArray = new String[10];
		String[][] digitsMap = new String[10][4];
		int firstNumber;
		int[] digitSet1 = new int[6];
		int[] digitSet2 = new int[6];
		
		firstDigitArray[0] = "000000";
		firstDigitArray[1] = "001011";
		firstDigitArray[2] = "001101";
		firstDigitArray[3] = "001110";
		firstDigitArray[4] = "010011";
		firstDigitArray[5] = "011001";
		firstDigitArray[6] = "011100";
		firstDigitArray[7] = "010101";
		firstDigitArray[8] = "010110";
		firstDigitArray[9] = "011010";
		
		firstNumber = Integer.parseInt(UPCNumber.substring(0, 1));
		digitSet1[0] = Integer.parseInt(UPCNumber.substring(1, 2));
		digitSet1[1] = Integer.parseInt(UPCNumber.substring(2, 3));
		digitSet1[2] = Integer.parseInt(UPCNumber.substring(3, 4));
		
		digitSet2[0] = Integer.parseInt(UPCNumber.substring(4, 5));
		digitSet2[1] = Integer.parseInt(UPCNumber.substring(5, 6));
		digitSet2[2] = Integer.parseInt(UPCNumber.substring(6,7));
		digitSet2[3] = Integer.parseInt(UPCNumber.substring(7, 8));
		
		String digitKey = "0000";
		char[] digitKeyArray = digitKey.toCharArray();
		//System.out.println("digitKey: " + digitKey);
		
		digitsMap[0][0] = "A";
		digitsMap[0][1] = "K";
		digitsMap[0][2] = "a";
		digitsMap[0][3] = "0";
		
		digitsMap[1][0] = "B";
		digitsMap[1][1] = "L";
		digitsMap[1][2] = "b";
		digitsMap[1][3] = "1";
		
		digitsMap[2][0] = "C";
		digitsMap[2][1] = "M";
		digitsMap[2][2] = "c";
		digitsMap[2][3] = "2";
		
		digitsMap[3][0] = "D";
		digitsMap[3][1] = "N";
		digitsMap[3][2] = "d";
		digitsMap[3][3] = "3";
		
		digitsMap[4][0] = "E";
		digitsMap[4][1] = "O";
		digitsMap[4][2] = "e";
		digitsMap[4][3] = "4";
		
		digitsMap[5][0] = "F";
		digitsMap[5][1] = "P";
		digitsMap[5][2] = "f";
		digitsMap[5][3] = "5";
		
		digitsMap[6][0] = "G";
		digitsMap[6][1] = "Q";
		digitsMap[6][2] = "g";
		digitsMap[6][3] = "6";
		
		digitsMap[7][0] = "H";
		digitsMap[7][1] = "R";
		digitsMap[7][2] = "h";
		digitsMap[7][3] = "7";
		
		digitsMap[8][0] = "I";
		digitsMap[8][1] = "S";
		digitsMap[8][2] = "i";
		digitsMap[8][3] = "8";
		
		digitsMap[9][0] = "J";
		digitsMap[9][1] = "T";
		digitsMap[9][2] = "j";
		digitsMap[9][3] = "9";
		
		// Add first encoded digit
		EncodedEAN8 = ":" + digitsMap[firstNumber][0];
		
		//Encode first digit group
		//System.out.println("digitKey1: " + digitKey);
		for (int i = 0; i < 3; i++){
			
			int currentKey = Integer.parseInt(String.valueOf((char) digitKeyArray[i]));
			//for (int ii = 0; ii < digitKeyArray.length; ii++){
				//System.out.println("Char " + ii + ": " + digitKeyArray[ii]);
			//}
			//System.out.println("i: " + i + " | " + "currentKey: " + Integer.parseInt(String.valueOf((char) currentKey)) + " | " + "digitSet1: " + digitSet1[i] + " | digitKeyArray: " + digitKeyArray.toString());
			String newEncodedDigit = digitsMap[(int) digitSet1[i]][currentKey];
			
			EncodedEAN8 = EncodedEAN8 + newEncodedDigit;
			
		}
		
		// Add middle delimiter
		EncodedEAN8 = EncodedEAN8 + "*";
		
		// Encode second digit group
		for (int i = 0; i < 4; i++){
			
			int currentKey = 2;
			String newEncodedDigit = digitsMap[digitSet2[i]][currentKey];
			
			EncodedEAN8 = EncodedEAN8 + newEncodedDigit;
			
		}
		
		// Add end delimiter
		EncodedEAN8 = EncodedEAN8 + "+";
		
		return EncodedEAN8;

	}

	/**
	 * @param args
	 */
	public static String getEncodedStringEAN13(String UPCNumber) {
		
		String EncodedEAN13 = null;
		String[] firstDigitArray = new String[10];
		String[][] digitsMap = new String[10][4];
		int firstNumber;
		int[] digitSet1 = new int[6];
		int[] digitSet2 = new int[6];
		
		firstDigitArray[0] = "000000";
		firstDigitArray[1] = "001011";
		firstDigitArray[2] = "001101";
		firstDigitArray[3] = "001110";
		firstDigitArray[4] = "010011";
		firstDigitArray[5] = "011001";
		firstDigitArray[6] = "011100";
		firstDigitArray[7] = "010101";
		firstDigitArray[8] = "010110";
		firstDigitArray[9] = "011010";
		
		firstNumber = Integer.parseInt(UPCNumber.substring(0, 1));
		
		digitSet1[0] = Integer.parseInt(UPCNumber.substring(1, 2));
		digitSet1[1] = Integer.parseInt(UPCNumber.substring(2, 3));
		digitSet1[2] = Integer.parseInt(UPCNumber.substring(3, 4));
		digitSet1[3] = Integer.parseInt(UPCNumber.substring(4, 5));
		digitSet1[4] = Integer.parseInt(UPCNumber.substring(5, 6));
		digitSet1[5] = Integer.parseInt(UPCNumber.substring(6, 7));
		
		digitSet2[0] = Integer.parseInt(UPCNumber.substring(7, 8));
		digitSet2[1] = Integer.parseInt(UPCNumber.substring(8, 9));
		digitSet2[2] = Integer.parseInt(UPCNumber.substring(9,10));
		digitSet2[3] = Integer.parseInt(UPCNumber.substring(10, 11));
		digitSet2[4] = Integer.parseInt(UPCNumber.substring(11, 12));
		digitSet2[5] = Integer.parseInt(UPCNumber.substring(12, 13));
		
		String digitKey = firstDigitArray[firstNumber];
		char[] digitKeyArray = digitKey.toCharArray();
		//System.out.println("digitKey: " + digitKey);
		
		digitsMap[0][0] = "A";
		digitsMap[0][1] = "K";
		digitsMap[0][2] = "a";
		digitsMap[0][3] = "0";
		
		digitsMap[1][0] = "B";
		digitsMap[1][1] = "L";
		digitsMap[1][2] = "b";
		digitsMap[1][3] = "1";
		
		digitsMap[2][0] = "C";
		digitsMap[2][1] = "M";
		digitsMap[2][2] = "c";
		digitsMap[2][3] = "2";
		
		digitsMap[3][0] = "D";
		digitsMap[3][1] = "N";
		digitsMap[3][2] = "d";
		digitsMap[3][3] = "3";
		
		digitsMap[4][0] = "E";
		digitsMap[4][1] = "O";
		digitsMap[4][2] = "e";
		digitsMap[4][3] = "4";
		
		digitsMap[5][0] = "F";
		digitsMap[5][1] = "P";
		digitsMap[5][2] = "f";
		digitsMap[5][3] = "5";
		
		digitsMap[6][0] = "G";
		digitsMap[6][1] = "Q";
		digitsMap[6][2] = "g";
		digitsMap[6][3] = "6";
		
		digitsMap[7][0] = "H";
		digitsMap[7][1] = "R";
		digitsMap[7][2] = "h";
		digitsMap[7][3] = "7";
		
		digitsMap[8][0] = "I";
		digitsMap[8][1] = "S";
		digitsMap[8][2] = "i";
		digitsMap[8][3] = "8";
		
		digitsMap[9][0] = "J";
		digitsMap[9][1] = "T";
		digitsMap[9][2] = "j";
		digitsMap[9][3] = "9";
		
		// Add first encoded digit
		EncodedEAN13 = digitsMap[firstNumber][3];
		
		//Encode first digit group
		//System.out.println("digitKey1: " + digitKey);
		for (int i = 0; i < 6; i++){
			
			int currentKey = Integer.parseInt(String.valueOf((char) digitKeyArray[i]));
			//for (int ii = 0; ii < digitKeyArray.length; ii++){
				//System.out.println("Char " + ii + ": " + digitKeyArray[ii]);
			//}
			//System.out.println("i: " + i + " | " + "currentKey: " + Integer.parseInt(String.valueOf((char) currentKey)) + " | " + "digitSet1: " + digitSet1[i] + " | digitKeyArray: " + digitKeyArray.toString());
			String newEncodedDigit = digitsMap[(int) digitSet1[i]][currentKey];
			
			EncodedEAN13 = EncodedEAN13 + newEncodedDigit;
			
		}
		
		// Add middle delimiter
		EncodedEAN13 = EncodedEAN13 + "*";
		
		// Encode second digit group
		for (int i = 0; i < 6; i++){
			
			int currentKey = 2;
			String newEncodedDigit = digitsMap[digitSet2[i]][currentKey];
			
			EncodedEAN13 = EncodedEAN13 + newEncodedDigit;
			
		}
		
		// Add end delimiter
		EncodedEAN13 = EncodedEAN13 + "+";
		
		return EncodedEAN13;

	}

}
