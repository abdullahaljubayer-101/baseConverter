import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String choice = MenuDriven.menuDriven();

            if (choice.equals("dTd")) {
                double decimal;

                System.out.print("Enter a Decimal Number: ");
                decimal = input.nextDouble();

                System.out.println("Decimal: " + decimal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("dTb")) {
                double decimal;
                String binary = "";

                System.out.print("Enter a Decimal Number: ");
                decimal = input.nextDouble();

                if (Math.ceil(decimal) == Math.floor(decimal))
                    binary = DecimalToBinary.decimalToBinary((long) decimal);
                else
                    binary = DecimalToBinary.decimalToBinary(decimal);

                System.out.println("Binary: " + binary);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("dTo")) {
                double decimal;
                String octal = "";

                System.out.print("Enter a Decimal Number: ");
                decimal = input.nextDouble();

                if (Math.ceil(decimal) == Math.floor(decimal))
                    octal = DecimalToOctal.decimalToOctal((long) decimal);
                else
                    octal = DecimalToOctal.decimalToOctal(decimal);

                System.out.println("Octal: " + octal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("dTh")) {
                double decimal;
                String hexadecimal = "";

                System.out.print("Enter a Decimal Number: ");
                decimal = input.nextDouble();

                if (Math.ceil(decimal) == Math.floor(decimal))
                    hexadecimal = DecimalToHexadecimal.decimalToHexadecimal((long) decimal);
                else
                    hexadecimal = DecimalToHexadecimal.decimalToHexadecimal(decimal);

                System.out.println("Hexadecimal: " + hexadecimal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("bTd")) {
                String binary = "";
                double decimal;

                System.out.print("Enter a Binary Number: ");
                binary = input.nextLine();

                decimal = BinaryToDecimal.binaryToDecimal(binary);

                if (Math.ceil(decimal) == Math.floor(decimal))
                    System.out.printf("Decimal: %.0f\n", decimal);
                else
                    System.out.println("Decimal: " + decimal);

                System.out.println();
                System.out.println();
            }
            else if (choice.equals("bTb")) {
                String binary = "";

                System.out.print("Enter a Binary Number: ");
                binary = input.nextLine();

                System.out.println("Binary: " + binary);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("bTo")) {
                String binary = "";
                String octal = "";

                System.out.print("Enter a Binary Number: ");
                binary = input.nextLine();

                octal = BinaryToOctal.binaryToOctal(binary);

                System.out.println("Octal: " + octal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("bTh")) {
                String binary = "";
                String hexadecimal = "";

                System.out.print("Enter a Binary Number: ");
                binary = input.nextLine();

                hexadecimal = BinaryToHexadecimal.binaryToHexadecimal(binary);

                System.out.println("Hexadecimal: " + hexadecimal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("oTd")) {
                String octal = "";
                double decimal;

                System.out.print("Enter a Octal Number: ");
                octal = input.nextLine();

                decimal = OctalToDecimal.octalToDecimal(octal);

                if (Math.ceil(decimal) == Math.floor(decimal))
                    System.out.printf("Decimal: %.0f\n", decimal);
                else
                    System.out.println("Decimal: " + decimal);

                System.out.println();
                System.out.println();
            }
            else if (choice.equals("oTb")) {
                String octal = "";
                String binary = "";

                System.out.print("Enter a Octal Number: ");
                octal = input.nextLine();

                binary = OctalToBinary.octalToBinary(octal);

                System.out.println("Binary: " + binary);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("oTo")) {
                String octal = "";

                System.out.print("Enter a Octal Number: ");
                octal = input.nextLine();

                System.out.println("Octal: " + octal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("oTh")) {
                String octal = "";
                String hexadecimal = "";

                System.out.print("Enter a Octal Number: ");
                octal = input.nextLine();

                hexadecimal = OctalToHexadecimal.octalToHexadecimal(octal);

                System.out.println("Hexadecimal: " + hexadecimal);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("hTd")) {
                String hexadecimal = "";
                double decimal;

                System.out.print("Enter a Hexadecimal Number: ");
                hexadecimal = input.nextLine();

                decimal = HexadecimalToDecimal.hexadecimalToDecimal(hexadecimal);

                if (Math.ceil(decimal) == Math.floor(decimal))
                    System.out.printf("Decimal: %.0f\n", decimal);
                else
                    System.out.println("Decimal: " + decimal);

                System.out.println();
                System.out.println();
            }
            else if (choice.equals("hTb")) {
                String hexadecimal = "";
                String binary = "";

                System.out.print("Enter a Hexadecimal Number: ");
                hexadecimal = input.nextLine();

                binary = HexadecimalToBinary.hexadecimalToBinary(hexadecimal);

                System.out.println("Binary: " + binary);
                System.out.println();
                System.out.println();
            }
            else if (choice.equals("hTo")) {
                String hexadecimal = "";
                String octal = "";

                System.out.print("Enter a Hexadecimal Number: ");
                hexadecimal = input.nextLine();

                octal = HexadecimalToOctal.hexadecimalToOctal(hexadecimal);

                System.out.println("Octal: " + octal);
                System.out.println();
                System.out.println();

            }
            else if (choice.equals("hTh")) {
                String hexadecimal = "";

                System.out.print("Enter a Hexadecimal Number: ");
                hexadecimal = input.nextLine();

                System.out.println("Hexadecimal: " + hexadecimal);
                System.out.println();
                System.out.println();
            }
        }
    }
}
