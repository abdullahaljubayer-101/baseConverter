public class DecimalToOctal {
    public static String decimalToOctal (long decimal) {
        String octal = "";
        String result = "";
        int remainder;

        while (decimal != 0) {
            remainder = (int) decimal % 8;

            result += remainder;

            decimal /= 8;
        }

        for (int i = result.length() - 1; i >= 0; --i)
            octal += result.charAt(i);

        return octal;
    }

    public static String decimalToOctal (double decimal) {
        String octal = "";

        octal = decimalToOctal((long) decimal);
        octal += ".";

        for (int i = 0; i < 10; ++i) {
            decimal = ((10 * decimal) - (10 * (long) decimal)) / 10;
            decimal *= 8;

            octal += (int) Math.floor(decimal);

            if (decimal == 7.00)
                break;
        }

        return octal;
    }
}
