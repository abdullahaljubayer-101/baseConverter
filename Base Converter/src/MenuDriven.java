import java.util.Scanner;

public class MenuDriven {
    public static String menuDriven() {
        Scanner input = new Scanner(System.in);

        int from, to;

        System.out.println("FROM:");
        System.out.println("1 for Decimal.");
        System.out.println("2 for Binary.");
        System.out.println("3 for Octal.");
        System.out.println("4 for Hexadecimal.");
        System.out.println();

        System.out.print("Enter Your Choice: ");
        from = input.nextInt();
        System.out.println();


        System.out.println("TO:");
        System.out.println("1 for Decimal.");
        System.out.println("2 for Binary.");
        System.out.println("3 for Octal.");
        System.out.println("4 for Hexadecimal.");
        System.out.println();

        System.out.print("Enter Your Choice: ");
        to = input.nextInt();
        System.out.println();

        if (from == 1 && to == 1)
            return "dTd";
        else if (from == 1 && to == 2)
            return "dTb";
        else if (from == 1 && to == 3)
            return "dTo";
        else if (from == 1 && to == 4)
            return "dTh";
        else if (from == 2 && to == 1)
            return "bTd";
        else if (from == 2 && to == 2)
            return "bTb";
        else if (from == 2 && to == 3)
            return "bTo";
        else if (from == 2 && to == 4)
            return "bTh";
        else if (from == 3 && to == 1)
            return "oTd";
        else if (from == 3 && to == 2)
            return "oTb";
        else if (from == 3 && to == 3)
            return "oTo";
        else if (from == 3 && to == 4)
            return "oTh";
        else if (from == 4 && to == 1)
            return "hTd";
        else if (from == 4 && to == 2)
            return "hTb";
        else if (from == 4 && to == 3)
            return "hTo";
        else if (from == 4 && to == 4)
            return "hTh";
        else
            return "Wrong Choice.";
    }
}
