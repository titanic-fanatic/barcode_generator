/*
 * Copyright 2002-2004 Jeremias Maerki.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krysalis.barcode4j.impl.code93;

import org.krysalis.barcode4j.BarGroup;
import org.krysalis.barcode4j.ChecksumMode;
import org.krysalis.barcode4j.ClassicBarcodeLogicHandler;

/**
 * This class is an implementation of the Code93 barcode.
 *
 * @author Tyler Janzen
 * @todo Add ASCII-7bit encoding table
 * @version $Id: Code93LogicImpl.java,v 1.5 2012/03/03 23:51:43 tjanzen Exp $
 */
public class Code93LogicImpl {

    private static final char[] CHARACTERS =
                        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                         'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                         'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                         'U', 'V', 'W', 'X', 'Y', 'Z',
                         '-', '.', ' ', '$', '/', '+', '%',
                         '(' + '$' + ')', '(' + '%' + ')', '(' + '/' + ')', '(' + '+' + ')',
                         '*'};

    private static final char STARTSTOP = '*'; //Not used as normal character

    private static final byte[][] CHARSET =
                        {{1, 0, 0, 0, 1, 0, 1, 0, 0}, //0
                         {1, 0, 1, 0, 0, 1, 0, 0, 0}, //1
                         {1, 0, 1, 0, 0, 0, 1, 0, 0}, //2
                         {1, 0, 1, 0, 0, 0, 0, 1, 0}, //3
                         {1, 0, 0, 1, 0, 1, 0, 0, 0}, //4
                         {1, 0, 0, 1, 0, 0, 1, 0, 0}, //5
                         {1, 0, 0, 1, 0, 0, 0, 1, 0}, //6
                         {1, 0, 1, 0, 1, 0, 0, 0, 0}, //7
                         {1, 0, 0, 0, 1, 0, 0, 1, 0}, //8
                         {1, 0, 0, 0, 0, 1, 0, 1, 0}, //9
                         {1, 1, 0, 1, 0, 1, 0, 0, 0}, //A
                         {1, 1, 0, 1, 0, 0, 1, 0, 0}, //B
                         {1, 1, 0, 1, 0, 0, 0, 1, 0}, //C
                         {1, 1, 0, 0, 1, 0, 1, 0, 0}, //D
                         {1, 1, 0, 0, 1, 0, 0, 1, 0}, //E
                         {1, 1, 0, 0, 0, 1, 0, 1, 0}, //F
                         {1, 0, 1, 1, 0, 1, 0, 0, 0}, //G
                         {1, 0, 1, 1, 0, 0, 1, 0, 0}, //H
                         {1, 0, 1, 1, 0, 0, 0, 1, 0}, //I
                         {1, 0, 0, 1, 1, 0, 1, 0, 0}, //J
                         {1, 0, 0, 0, 1, 1, 0, 1, 0}, //K
                         {1, 0, 1, 0, 1, 1, 0, 0, 0}, //L
                         {1, 0, 1, 0, 0, 1, 1, 0, 0}, //M
                         {1, 0, 1, 0, 0, 0, 1, 1, 0}, //N
                         {1, 0, 0, 1, 0, 1, 1, 0, 0}, //O
                         {1, 0, 0, 0, 1, 0, 1, 1, 0}, //P
                         {1, 1, 0, 1, 1, 0, 1, 0, 0}, //Q
                         {1, 1, 0, 1, 1, 0, 0, 1, 0}, //R
                         {1, 1, 0, 1, 0, 1, 1, 0, 0}, //S
                         {1, 1, 0, 1, 0, 0, 1, 1, 0}, //T
                         {1, 1, 0, 0, 1, 0, 1, 1, 0}, //U
                         {1, 1, 0, 0, 1, 1, 0, 1, 0}, //V
                         {1, 0, 1, 1, 0, 1, 1, 0, 0}, //W
                         {1, 0, 1, 1, 0, 0, 1, 1, 0}, //X
                         {1, 0, 0, 1, 1, 0, 1, 1, 0}, //Y
                         {1, 0, 0, 1, 1, 1, 0, 1, 0}, //Z
                         {1, 0, 0, 1, 0, 1, 1, 1, 0}, //-
                         {1, 1, 1, 0, 1, 0, 1, 0, 0}, //.
                         {1, 1, 1, 0, 1, 0, 0, 1, 0}, //SP
                         {1, 1, 1, 0, 0, 1, 0, 1, 0}, //$
                         {1, 0, 1, 1, 0, 1, 1, 1, 0}, //"/"
                         {1, 0, 1, 1, 1, 0, 1, 1, 0}, //+
                         {1, 1, 0, 1, 0, 1, 1, 1, 0}, //%
                         {1, 0, 0, 1, 0, 0, 1, 1, 0}, //($)
                         {1, 1, 1, 0, 1, 1, 0, 1, 0}, //(%)
                         {1, 1, 1, 0, 1, 0, 1, 1, 0}, //(/)
                         {1, 0, 0, 1, 1, 0, 0, 1, 0}, //(+)
                         {1, 0, 1, 0, 1, 1, 1, 1, 0}}; //*

    private ChecksumMode checksumMode = ChecksumMode.CP_AUTO;
    private boolean displayStartStop = false;
    private boolean displayChecksum = false;
    private boolean extendedCharSet = false;

    /**
     * Main constructor
     * @param mode checksum mode
     * @param displayStartStop Controls whether to display start and stop
     *   characters in the human-readable message
     * @param displayChecksum Controls whether to display checksum
     *   in the human-readable message
     */
    public Code93LogicImpl(ChecksumMode mode, boolean displayStartStop,
                boolean displayChecksum, boolean extendedCharSet) {
        this.checksumMode = mode;
        this.displayStartStop = displayStartStop;
        this.displayChecksum = displayChecksum;
        this.extendedCharSet = extendedCharSet;
    }

    /**
     * Returns the currently active checksum mode.
     * @return the checksum mode
     */
    public ChecksumMode getChecksumMode() {
        return this.checksumMode;
    }

    private static void invalidCharacter(char c) {
//        if (c != STARTSTOP) {
//            throw new IllegalArgumentException("Invalid character: " + c);
//        } else {
//            throw new IllegalArgumentException("You may not include '*' as "
//                    + "part of the message. This start/stop character is "
//                    + "automatically added before and after the message.");
//        }
    }

    StringBuffer prepareMessage(String msg) {
        if (this.extendedCharSet) {
            return escapeExtended(msg, null);
        } else {
            //Remove start/stop in standard mode if present
            if (msg.startsWith("*") && msg.endsWith("*")) {
                return new StringBuffer(msg.substring(1, msg.length() - 1));
            } else {
                return new StringBuffer(msg);
            }
        }
    }

    /**
     * Escapes US-ASCII characters as required for the extended character set for Code 93.
     * @param msg the original message
     * @param sb the StringBuffer to write the escaped message to (or null)
     * @return a StringBuffer containing the escaped message
     */
    public static StringBuffer escapeExtended(String msg, StringBuffer sb) {
        if (sb == null) {
            sb = new StringBuffer(msg.length());
        }
        for (int i = 0, c = msg.length(); i < c; i++) {
            char ch = msg.charAt(i);
            if (ch == 0) {
                sb.append("%U");
            } else if (ch >= 1 && ch <= 26) {
                sb.append('$').append((char)('A' + ch - 1));
            } else if (ch >= 27 && ch <= 31) {
                sb.append('%').append((char)('A' + ch - 27));
            } else if (ch == 32) {
                sb.append(ch);
            } else if (ch >= 33 && ch <= 47) {
                sb.append('/').append((char)('A' + ch - 33));
            } else if (ch >= 48 && ch <= 57) {
                sb.append(ch);
            } else if (ch == 58) {
                sb.append("/Z");
            } else if (ch >= 59 && ch <= 63) {
                sb.append('%').append((char)('F' + ch - 59));
            } else if (ch == 64) {
                sb.append("%V");
            } else if (ch >= 65 && ch <= 90) {
                sb.append(ch);
            } else if (ch >= 91 && ch <= 95) {
                sb.append('%').append((char)('K' + ch - 91));
            } else if (ch == 96) {
                sb.append("%W");
            } else if (ch >= 97 && ch <= 122) {
                sb.append('+').append((char)('A' + ch - 97));
            } else if (ch >= 123 && ch <= 127) {
                sb.append('%').append((char)('P' + ch - 123));
            } else {
                throw new IllegalArgumentException("Character 0x" + Integer.toHexString(ch)
                        + " is not supported by Extended Code 93!");
            }
        }
        return sb;
    }

    /**
     * Calculates the checksum for a message to be encoded as an
     * Code93 barcode.
     * @param msg message to calculate the check digit for
     * @return char the check digit
     */
    public static char calcChecksum(String msg) {
        int checksum = 0;
        int posweight = 1;
        for (int i = msg.length() - 1; i >= 0; i--) {
            final int chidx = getCharIndex(msg.charAt(i));
            if (chidx >= 0) {
                checksum += chidx * posweight;
                if (posweight == 20){
                	posweight = 0;
                }
                else{
                	posweight++;
                }
            } else {
                invalidCharacter(msg.charAt(i));
            }
        }
        return CHARACTERS[checksum % 47];
    }


    /**
     * Verifies the checksum for a message.
     * @param msg message (check digit included)
     * @return boolean True, if the checksum is correct
     */
    public static boolean validateChecksum(String msg) {
        char actual1 = msg.charAt(msg.length() - 2);
        char expected1 = calcChecksum(msg.substring(0, msg.length() - 2));
        char actual2 = msg.charAt(msg.length() - 1);
        char expected2 = calcChecksum(msg.substring(0, msg.length() - 1));
        if (actual1 == expected1 && actual2 == expected2){
        	return true;
        }
        else{
        	return false;
        }
    }

    private static int getCharIndex(char ch) {
        final char effch;
        if ((ch >= 'a') && (ch <= 'z')) {
            effch = Character.toUpperCase(ch);
        } else {
            effch = ch;
        }
        for (int i = 0; i < CHARACTERS.length; i++) {
            if (effch == CHARACTERS[i]) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isValidChar(char ch) {
        if (ch == STARTSTOP) {
            return false;
        }
        return (getCharIndex(ch) >= 0);
    }

    private int widthAt(char ch, int index) {
        final int chidx = getCharIndex(ch);
        if (chidx >= 0) {
            int binary = CHARSET[chidx][index];
            //System.out.println("binary before: " + binary);
            //System.out.println("binary after: " + binary + 1);
            return binary;
        } else {
            invalidCharacter(ch);
            return 0; //this is unreachable code.
        }
    }

    /**
     * Encodes a single character.
     * @param logic the logic handler to receive generated events
     * @param c the character to encode
     */
    protected void encodeChar(ClassicBarcodeLogicHandler logic, char c) {
        logic.startBarGroup(BarGroup.MSG_CHARACTER, new Character(c).toString());
        for (byte i = 0; i < 9; i++) {
            int width = widthAt(c, i);
            boolean black = (i % 2 == 0);
            logic.addBar(black, width);
        }
        logic.endBarGroup();
    }

    private String handleChecksum(StringBuffer sb) {
        if (getChecksumMode() == ChecksumMode.CP_ADD) {
            if (displayChecksum) {
                sb.append(calcChecksum(sb.toString()));
                sb.append(calcChecksum(sb.toString()));
                return sb.toString();
            } else {
                String msg = sb.toString();
                sb.append(calcChecksum(msg));
                sb.append(calcChecksum(sb.toString()));
                return msg;
            }
        } else if (getChecksumMode() == ChecksumMode.CP_CHECK) {
            if (!validateChecksum(sb.toString())) {
            	char checksum1 = calcChecksum(sb.toString());
            	char checksum2 = calcChecksum(sb.toString() + checksum1);
                throw new IllegalArgumentException("Message '"
                    + sb.toString()
                    + "' has a bad checksum. Expected: "
                    + checksum1 + checksum2);
            }
            if (displayChecksum) {
                return sb.toString();
            } else {
                return sb.substring(0, sb.length() - 2);
            }
        } else if (getChecksumMode() == ChecksumMode.CP_IGNORE) {
            return sb.toString();
        } else if (getChecksumMode() == ChecksumMode.CP_AUTO) {
            return sb.toString(); //equals ignore
        } else {
            throw new IllegalStateException("Unknown checksum mode");
        }
    }

    /**
     * Generates the barcode logic
     * @param logic the logic handler to receive generated events
     * @param msg the message to encode
     */
    public void generateBarcodeLogic(ClassicBarcodeLogicHandler logic, String msg) {
        StringBuffer sb = prepareMessage(msg);

        //Checksum handling as requested
        String formattedMsg = handleChecksum(sb);
        String displayMsg;
        if (extendedCharSet) {
            displayMsg = msg;
        } else {
            displayMsg = formattedMsg;
            if (displayStartStop) {
                displayMsg = STARTSTOP + displayMsg + STARTSTOP;
            }
        }

        logic.startBarcode(sb.toString(), displayMsg);

        //Start character
        logic.startBarGroup(BarGroup.START_CHARACTER, new Character(STARTSTOP).toString());
        encodeChar(logic, STARTSTOP);
        logic.endBarGroup();

        for (int i = 0; i < sb.length(); i++) {

            final char ch = sb.charAt(i);
            if (!isValidChar(ch)) {
                throw new IllegalArgumentException("Invalid character: " + ch);
            }
            encodeChar(logic, ch);
        }

        //Start character
        logic.startBarGroup(BarGroup.STOP_CHARACTER, new Character(STARTSTOP).toString());
        encodeChar(logic, STARTSTOP);
        logic.endBarGroup();

        logic.endBarcode();
    }


}