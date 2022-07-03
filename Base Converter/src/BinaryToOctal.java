public class BinaryToOctal {
    public static String binaryToOctal(String binary) {
        String octal = "";
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
        if (len % 3 == 1)
            firstPart = "00" + firstPart;
        else if (len % 3 == 2)
            firstPart = "0" + firstPart;

        len = firstPart.length();
        for (int i = 0; i < len; i += 3) {
            octal += (long) BinaryToDecimal.binaryToDecimal(firstPart.substring(i, i + 3));
        }

        //Last Part.
        if (lastPart != "") {
            octal += ".";

            len = lastPart.length();
            if (len % 3 == 1)
                lastPart += "00";
            else if (len % 3 == 2)
                lastPart += "0";

            len = lastPart.length();
            for (int i = 0; i < len; i += 3) {
                octal += (long) BinaryToDecimal.binaryToDecimal(lastPart.substring(i, i + 3));
            }
        }

        return octal;
    }
}
