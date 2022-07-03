public class HexadecimalToOctal {
    public static String hexadecimalToOctal (String hexadecimal) {
        String octal = "";
        String binary = "";

        binary = HexadecimalToBinary.hexadecimalToBinary(hexadecimal);

        octal = BinaryToOctal.binaryToOctal(binary);

        return octal;
    }
}
