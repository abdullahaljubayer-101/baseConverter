public class BinaryToDecimal {
    public static double binaryToDecimal (String binary) {
        double decimal = 0.0;
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

        len = firstPart.length();
        for (int i = 0; i < len; ++i)
            decimal += (firstPart.charAt(i) - '0') * Math.pow(2, len - (i + 1));

        if (lastPart != "") {
            len = lastPart.length();
            for (int i = 0; i < len; ++i)
                decimal += (lastPart.charAt(i) - '0') * Math.pow(2, -(i + 1));
        }

        return decimal;
    }
}
