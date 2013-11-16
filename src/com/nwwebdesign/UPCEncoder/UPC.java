/**
 * 
 */
package com.nwwebdesign.UPCEncoder;

/**
 * @author Britney
 *
 */
public class UPC {

	/**
	 * @param args
	 */
	public static int getCheckDigit(String UPCNumber, int barcodeType) {
		
		int CheckDigit = 0;
		
		switch (barcodeType){
		
		case 12:
			
			char UPCNumberArray[] = UPCNumber.toCharArray();
			int UPCNumArray[] = new int[UPCNumberArray.length];
			
			for (int i = 0; i < UPCNumberArray.length; i++){
				
				UPCNumArray[i] = Integer.parseInt(String.valueOf((char) UPCNumberArray[i]));
				
			}
			
			float barcodeSUM = 0;
			
			for (int i = 0; i < 11; i++){
				
				if (i % 2 == 0){
					
					barcodeSUM = barcodeSUM + (UPCNumArray[i] * 3);
					
				}
				else{
					
					barcodeSUM = barcodeSUM + UPCNumArray[i];
					
				}
				
			}
				
			CheckDigit = (int) ((Math.ceil(barcodeSUM / 10) * 10) - barcodeSUM);
			break;
			
		case 6:
			
			char UPCENumberArray[] = UPCNumber.toCharArray();
			String UPCENumArray[] = new String[UPCENumberArray.length];
			
			for (int i = 0; i < UPCENumberArray.length; i++){
				
				UPCENumArray[i] = String.valueOf((char) UPCENumberArray[i]);
				
			}
			
			String manufacturerCode = null;
			String productCode = null;
			if (UPCENumArray[6].equals("0") || UPCENumArray[6].equals("1") || UPCENumArray[6].equals("2")){
				
				manufacturerCode = UPCENumArray[1] + UPCENumArray[2] + UPCENumArray[6] + "00";
				productCode = "00" + UPCENumArray[3] + UPCENumArray[4] + UPCENumArray[5];
				
			}
			else if (UPCENumArray[6].equals("3")){
				
				manufacturerCode = UPCENumArray[1] + UPCENumArray[2] + UPCENumArray[3] + "00";
				productCode = "000" + UPCENumArray[4] + UPCENumArray[5];
				
			}
			else if (UPCENumArray[6].equals("4")){
				
				manufacturerCode = UPCENumArray[1] + UPCENumArray[2] + UPCENumArray[3] + UPCENumArray[4] + "0";
				productCode = "0000" + UPCENumArray[5];
				
			}
			else if (UPCENumArray[6].equals("5") || UPCENumArray[6].equals("6") || UPCENumArray[6].equals("7") || UPCENumArray[6].equals("8") || UPCENumArray[6].equals("9")){
				
				manufacturerCode = UPCENumArray[1] + UPCENumArray[2] + UPCENumArray[3] + UPCENumArray[4] + UPCENumArray[5] + "";
				productCode = "0000" + UPCENumArray[6];
				
			}
			
			String fullUPCA = "0" + manufacturerCode + productCode;
			
			System.out.println("fullUPCA: " + fullUPCA);
			
			CheckDigit = getCheckDigit(fullUPCA, 12);
			
			break;
					
		}
		
		return CheckDigit;
		
	}

	/**
	 * @param args
	 */
	public static String getEncodedString(String UPCNumber) {
		
		int[] UPCN = new int[12];
		
		UPCN[0] = Integer.parseInt(UPCNumber.substring(0,1));
		UPCN[1] = Integer.parseInt(UPCNumber.substring(1,2));
		UPCN[2] = Integer.parseInt(UPCNumber.substring(2,3));
		UPCN[3] = Integer.parseInt(UPCNumber.substring(3,4));
		UPCN[4] = Integer.parseInt(UPCNumber.substring(4,5));
		UPCN[5] = Integer.parseInt(UPCNumber.substring(5,6));
		UPCN[6] = Integer.parseInt(UPCNumber.substring(6,7));
		UPCN[7] = Integer.parseInt(UPCNumber.substring(7,8));
		UPCN[8] = Integer.parseInt(UPCNumber.substring(8,9));
		UPCN[9] = Integer.parseInt(UPCNumber.substring(9,10));
		UPCN[10] = Integer.parseInt(UPCNumber.substring(10,11));
		UPCN[11] = Integer.parseInt(UPCNumber.substring(11,12));
		
		String[] DigitGroup1 = new String[10];
		String[] DigitGroup2 = new String[10];
		String[] DigitGroup3 = new String[10];
		String[] DigitGroup4 = new String[10];
		
		DigitGroup1[0] = "0";
		DigitGroup1[1] = "1";
		DigitGroup1[2] = "2";
		DigitGroup1[3] = "3";
		DigitGroup1[4] = "4";
		DigitGroup1[5] = "5";
		DigitGroup1[6] = "6";
		DigitGroup1[7] = "7";
		DigitGroup1[8] = "8";
		DigitGroup1[9] = "9";
		
		DigitGroup2[0] = "p";
		DigitGroup2[1] = "q";
		DigitGroup2[2] = "w";
		DigitGroup2[3] = "e";
		DigitGroup2[4] = "r";
		DigitGroup2[5] = "t";
		DigitGroup2[6] = "y";
		DigitGroup2[7] = "u";
		DigitGroup2[8] = "i";
		DigitGroup2[9] = "o";
		
		DigitGroup3[0] = ";";
		DigitGroup3[1] = "a";
		DigitGroup3[2] = "s";
		DigitGroup3[3] = "d";
		DigitGroup3[4] = "f";
		DigitGroup3[5] = "g";
		DigitGroup3[6] = "h";
		DigitGroup3[7] = "j";
		DigitGroup3[8] = "k";
		DigitGroup3[9] = "l";
		
		DigitGroup4[0] = "/";
		DigitGroup4[1] = "z";
		DigitGroup4[2] = "x";
		DigitGroup4[3] = "c";
		DigitGroup4[4] = "v";
		DigitGroup4[5] = "b";
		DigitGroup4[6] = "n";
		DigitGroup4[7] = "m";
		DigitGroup4[8] = ",";
		DigitGroup4[9] = ".";
		
		//System.out.println(UPCNums[0]);
		
		String UPCEncoded = DigitGroup1[UPCN[0]];
		
		for (int i = 1; i < 6; i++){
			int digit = UPCN[i];
			UPCEncoded = UPCEncoded + DigitGroup2[(int) digit];
		}
		
		UPCEncoded = UPCEncoded + "-";
		
		for (int i = 6; i < 11; i++){
			int digit = UPCN[i];
			UPCEncoded = UPCEncoded + DigitGroup3[(int) digit];
		}
		
		UPCEncoded = UPCEncoded + DigitGroup4[(int) UPCN[11]];
		
		return UPCEncoded;

	}

}