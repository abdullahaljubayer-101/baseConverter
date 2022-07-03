import java.util.function.DoubleToIntFunction;

public class HexadecimalToDecimal {
    public static double hexadecimalToDecimal (String hexadecimal) {
        double decimal = 0.0;
        String firstPart = "";
        String lastPart = "";
        int index;
        int len;

        index = hexadecimal.indexOf(".");
        if (index != -1) {
            firstPart = hexadecimal.substring(0, index);
            lastPart = hexadecimal.substring(index + 1);
        }
        else
            firstPart = hexadecimal;

        len = firstPart.length();
        for (int i = 0; i < len; ++i) {
            if (firstPart.charAt(i) >= '0' && firstPart.charAt(i) <= '9')
                decimal += (firstPart.charAt(i) - '0') * Math.pow(16, len - (i + 1));
            else
                decimal += chatToInt(firstPart.charAt(i)) * Math.pow(16, len - (i + 1));
        }

        if (lastPart != "") {
            len = lastPart.length();
            for (int i = 0; i < len; ++i) {
                if (lastPart.charAt(i) >= '0' && lastPart.charAt(i) <= '9')
                    decimal += (lastPart.charAt(i) - '0') * Math.pow(16, -(i + 1));
                else
                    decimal += chatToInt(lastPart.charAt(i)) * Math.pow(16, -(i + 1));
            }
        }

        return decimal;
    }

    public static int chatToInt (char hex) {
        switch (hex) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
        }

        return 0;
    }
}
