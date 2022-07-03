public class OctalToBinary {
    public static String octalToBinary (String octal) {
        String binary = "";

        for (int i = 0; i < octal.length(); ++i) {
            if (octal.charAt(i) == '.')
                binary += ".";
            else {
                switch (octal.charAt(i)) {
                    case '0':
                        binary += "000";
                        break;
                    case '1':
                        binary += "001";
                        break;
                    case '2':
                        binary += "010";
                        break;
                    case '3':
                        binary += "011";
                        break;
                    case '4':
                        binary += "100";
                        break;
                    case '5':
                        binary += "101";
                        break;
                    case '6':
                        binary += "110";
                        break;
                    case '7':
                        binary += "111";
                        break;
                }
            }
        }

        return binary;
    }
}
