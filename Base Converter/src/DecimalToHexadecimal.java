public class DecimalToHexadecimal {
    public static String decimalToHexadecimal (long decimal) {
        String hexadecimal = "";
        String result = "";
        int remainder;

        while (decimal != 0) {
            remainder = (int) decimal % 16;

            switch (remainder) {
                case 10:
                    result += "A";
                    break;
                case 11:
                    result += "B";
                    break;
                case 12:
                    result += "C";
                    break;
                case 13:
                    result += "D";
                    break;
                case 14:
                    result += "E";
                    break;
                case 15:
                    result += "F";
                    break;
                default:
                    result += remainder;
            }

            decimal /= 16;
        }

        for (int i = result.length() - 1; i >= 0; --i)
            hexadecimal += result.charAt(i);

        return hexadecimal;
    }

    public static String decimalToHexadecimal (double decimal) {
        String hexadecimal = "";
        int remainder;

        hexadecimal = decimalToHexadecimal((long) decimal);
        hexadecimal += ".";

        for (int i = 0; i < 10; ++i) {
            decimal = ((10 * decimal) - (10 * (long) decimal)) / 10;
            decimal *= 16;

            remainder = (int) Math.floor(decimal);

            switch (remainder) {
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
                    hexadecimal += remainder;
            }

            if (decimal == 14.00)
                break;
        }

        return hexadecimal;
    }
}
