public class DecimalToBinary {
    public static String decimalToBinary (long decimal) {
        String binary = "";
        String result = "";
        int remainder;

        while (decimal != 0) {
            remainder = (int) decimal % 2;

            result += remainder;

            decimal /= 2;
        }

        for (int i = result.length() - 1; i >= 0; --i)
            binary += result.charAt(i);

        return binary;
    }

    public static String decimalToBinary (double decimal) {
        String binary = "";

        binary = decimalToBinary((long) decimal);
        binary += ".";

        for (int i = 0; i < 20; ++i) {
            decimal = ((10 * decimal) - (10 * (long) decimal)) / 10;
            decimal *= 2;

            binary += (int) Math.floor(decimal);

            if (decimal == 1.00)
                break;
        }

        return binary;
    }
}
