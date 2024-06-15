package pack1;
import java.util.*;
public class Final {
    color c = new color();

    public static void ekta(String pla) {
        State s1 = new Gujarat();
        State s2 = new Goa();
        State s3 = new Rajasthan();
        State s4 = new Kerela();
        State s5 = new Delhi();
        State s6 = new Ladakh();
        State s7 = new Uttrakhand();
        State s8 = new Andaman();
        State s9 = new Himachal();
        State s10 = new Sikkim();
        if (pla.equalsIgnoreCase("Gujarat")) {
            s1.show1();

        } else if (pla.equalsIgnoreCase("Goa")) {
            s2.show1();

        } else if (pla.equalsIgnoreCase("Rajasthan")) {
            s3.show1();

        } else if (pla.equalsIgnoreCase("Kerela")) {
            s4.show1();

        } else if (pla.equalsIgnoreCase("delhi")) {
            s5.show1();

        } else if (pla.equalsIgnoreCase("ladakh")) {
            s6.show1();

        } else if (pla.equalsIgnoreCase("Uttrakhand")) {
            s7.show1();
        } else if (pla.equalsIgnoreCase("andaman")) {
            s8.show1();

        } else if (pla.equalsIgnoreCase("himachal")) {
            s9.show1();

        } else if (pla.equalsIgnoreCase("Sikkim")) {
            s10.show1();
        } else {
            System.out.println("Enter valid!!!");
        }
    }

    public static void ff() {
        Scanner sc1 = new Scanner(System.in);
        boolean ff = true;
        Final.ekta(Select.name);
        System.out.println();
        while (ff) {
            System.out.println(color.purple + "Book Now [y/n]: " + color.reset);
            char r = ' ';
            try {
                r = sc1.nextLine().charAt(0);
                // System.out.println(r);
                String S = "" + r;
                throw new Manav(S);
            } catch (Manav e) {
                // System.out.println("Invalid !!");
                // r=sc1.nextLine().charAt(0);

            }
            if ((r == 'N' || r == 'n')) {
                // sc1.nextLine.char();
                Exc.ex();
                return;
            } else if (!(r == 'Y' || r == 'y')) {
                System.out.println(color.red + "Please Enter valid value!!" + color.reset);

            } else {
                ff = false;
            }
        }
        System.out.println(Select.name);
        Final.ekta(Select.name);
        color c = new color();
        System.out.println(c.red + "Enter your full name: " + c.white);
        // sc1.nextLine();
        String name = sc1.nextLine();
        label: for (int i = 0; i < name.length(); i++) {

            if (name.length() == 0) {
                i = -1;
                System.out.println(color.purple + "Please Enter valid name: " + color.reset);
                System.out.println(c.red + "Enter your full name: " + c.white);

                name = sc1.nextLine();
                continue label;
            }

            if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')
                    || name.charAt(i) == ' ') {
                continue;
            } else {
                i = -1;
                System.out.println(color.purple + "Please Enter valid name: " + color.reset);
                System.out.println(c.red + "Enter your full name: " + c.white);

                name = sc1.nextLine();
                continue label;
            }
        }

        System.out.println(c.red + "Enter your email id: " + c.white);
        String email = sc1.nextLine();

        label: for (int i = 0; i < email.length(); i++) {
            if (email.indexOf(".com") == -1 || email.indexOf('@') == -1) {
                i = -1;

                System.out.println(color.purple + "Please Enter valid Email-ID !" + color.reset);
                System.out.println(c.red + "Enter your email id: " + c.white);
                email = sc1.nextLine();
                continue label;
            }
            if ((email.charAt(i) >= 'a' && email.charAt(i) <= 'z') || (email.charAt(i) >= 'A' && email.charAt(i) <= 'Z')
                    || email.charAt(i) == '@' || email.charAt(i) == '.'
                    || (email.charAt(i) >= '0' && email.charAt(i) <= '9')) {
                continue;
            } else {
                i = -1;
                System.out.println(c.red + "Enter your Email-ID: " + c.white);
                email = sc1.nextLine();
                continue label;
            }
        }

        System.out.println(c.red + "Enter address: " + c.white);
        String address = sc1.nextLine();
        System.out.println(c.red + "Enter your phone number: " + c.white);
        String phone = sc1.nextLine();
        label: for (int i = 0; i < phone.length(); i++) {
            if (phone.length() != 10) {
                System.out.println(c.red + "Enter your phone number: " + c.white);
                phone = sc1.nextLine();
                i = -1;
                continue label;

            }
            if (phone.charAt(i) >= '0' && phone.charAt(i) <= '9') {
                continue;
            } else {
                i = -1;
                System.out.println(color.purple + "Please Enter valid phone number: " + color.reset);
                System.out.println(c.red + "Enter your phone number: " + c.white);
                phone = sc1.nextLine();
                continue label;
            }
        }

        Date d = new Date();
        System.out.println(color.yellow + "=============Your Invoice===========" + color.reset);
        System.out.println(d);
        System.out
                .println(color.green + "\nName :" + name + "\nE-mail :" + email + "\nAddress :" + address
                        + "\nPhone number: " + phone);
        System.out.println(color.purple + "\nYour plan: " + Select.name);
        System.out.println(color.red + "\nTour details: ");
        Final.ekta(Select.name);
        System.out.println(color.purple + "\nTour price = " + Select.price);
        double sgst = (0.09) * (Select.price);
        double cgst = (0.1) * (Select.price);
        double t = sgst + cgst + Select.price;
        System.out.println("SGST       = " + sgst);
        System.out.println("CGST       = " + cgst);
        System.out.println("\nTotal fair = " + t + color.reset);
        Exc.ex();
    }
}
