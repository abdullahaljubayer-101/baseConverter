public class OctalToDecimal {
    public static double octalToDecimal (String octal) {
        double decimal = 0.0;
        String firstPart = "";
        String lastPart = "";
        int index;
        int len;

        index = octal.indexOf(".");
        if (index != -1) {
            firstPart = octal.substring(0, index);
            lastPart = octal.substring(index + 1);
        }
        else
            firstPart = octal;

        len = firstPart.length();
        for (int i = 0; i < len; ++i)
            decimal += (firstPart.charAt(i) - '0') * Math.pow(8, len - (i + 1));

        if (lastPart != "") {
            len = lastPart.length();
            for (int i = 0; i < len; ++i)
                decimal += (lastPart.charAt(i) - '0') * Math.pow(8, -(i + 1));
        }

        return decimal;
    }
}
