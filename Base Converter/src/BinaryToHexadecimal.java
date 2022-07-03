public class BinaryToHexadecimal {
    public static String binaryToHexadecimal(String binary) {
        String hexadecimal = "";
        String firstPart = "";
        String lastPart = "";
        int index;
        int len;

        index = binary.indexOf(".");
        if (index != -1) {
            firstPart = binary.substring(0, index);
            lastPart = binary.substring(index + 1);
        }
        else
            firstPart = binary;

        //First Part.
        len = firstPart.length();
        if (len % 4 == 1)
            firstPart = "000" + firstPart;
        else if (len % 4 == 2)
            firstPart = "00" + firstPart;
        else if (len % 4 == 3)
            firstPart = "0" + firstPart;

        len = firstPart.length();
        for (int i = 0; i < len; i += 4) {
            int hex = (int) BinaryToDecimal.binaryToDecimal(firstPart.substring(i, i + 4));

            switch (hex) {
                case 10:
                    hexadecimal += "A";
                    break;
                case 11:
                    hexadecimal += "B";
                    break;
                case 12:
                    hexadecimal += "C";
                    break;
                case 13:
                    hexadecimal += "D";
                    break;
                case 14:
                    hexadecimal += "E";
                    break;
                case 15:
                    hexadecimal += "F";
                    break;
                default:
                    hexadecimal += hex;
            }
        }

        //Last Part.
        if (lastPart != "") {
            hexadecimal += ".";

            len = lastPart.length();
            if (len % 4 == 1)
                lastPart += "000";
            else if (len % 4 == 2)
                lastPart += "00";
            else if (len % 4 == 3)
                lastPart += "0";

            len = lastPart.length();
            for (int i = 0; i < len; i += 4) {
                int hex = (int) BinaryToDecimal.binaryToDecimal(lastPart.substring(i, i + 4));

                switch (hex) {
                    case 10:
                        hexadecimal += "A";
                        break;
                    case 11:
                        hexadecimal += "B";
                        break;
                    case 12:
                        hexadecimal += "C";
                        break;
                    case 13:
                        hexadecimal += "D";
                        break;
                    case 14:
                        hexadecimal += "E";
                        break;
                    case 15:
                        hexadecimal += "F";
                        break;
                    default:
                        hexadecimal += hex;
                }
            }
        }

        return hexadecimal;
    }
}
