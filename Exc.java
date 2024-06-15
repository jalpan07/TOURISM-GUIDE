package pack1;
import java.util.*;

public class Exc {
    public static void ex() {
        Choices obj1 = new Places();
        Choices obj2 = new Time();
        Choices obj3 = new Budget();
        boolean flg = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(color.green
                    + "\n===============================================================================================\n"
                    + color.reset);
            System.out.print(color.purple + "\n Search By: " + color.blue
                    + "\n 1: Places\n 2: Time of travel \n 3: Budget\n 4: Exit \n\n" + color.yellow + " Enter: "
                    + color.reset);
            int n = -1;
            flg = true;

            boolean r = false;

            boolean t = true;
            while (t) {
                if (!sc.hasNextLine()) {
                    sc.nextLine();
                }
                String str = sc.nextLine();
                if (str.length() == 0) {
                    str = sc.nextLine();
                }
                if (str.length() != 1) {
                    System.out.println("Entered value is not a valid input !!");
                    System.out.print("Please enter again: ");
                    continue;
                }
                if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                    n = str.charAt(0) - '0';
                    t = false;
                } else {
                    // throw new Exception ("Invalid Input");
                    System.out.println("Entered value is not an integer !!");
                    System.out.print("Please enter again: ");
                    continue;
                }

            }

            flg = false;

            if (true) {
                switch (n) {
                    case 1:
                        obj1.getinfo();
                        break;

                    case 2:
                        obj2.getinfo();
                        break;

                    case 3:
                        obj3.getinfo();
                        break;

                    case 4:
                        flg = true;
                        System.out.println(color.green + "\n Thank you.... :) " + color.reset);
                        System.out.println(color.cyan + "Do visit again !!" + color.reset + "\n\n");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid ! Enter Again !");
                }
            }
        } while (!flg);
        System.out.println("\n Thank you.... :) ");
        sc.close();
    }
}
