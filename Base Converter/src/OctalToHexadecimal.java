public class OctalToHexadecimal {
    public static String octalToHexadecimal (String octal) {
        String hexadecimal = "";
        String binary = "";

        binary = OctalToBinary.octalToBinary(octal);

        hexadecimal = BinaryToHexadecimal.binaryToHexadecimal(binary);

        return hexadecimal;
    }
}
