package pack1;

public class Time implements Choices {
    color c = new color();

    public void getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print(color.purple + " Enter the month you want to travel: " + color.reset);
        String s;
        s = sc.nextLine();

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

        while (true) {
            if (s.equalsIgnoreCase("January")) {
                s1.show();
                s2.show();
                s5.show();
                s7.show();
                s4.show();
                s8.show();
                s3.show();
            }

            else if (s.equalsIgnoreCase("Febuary")) {
                s1.show();
                s2.show();
                s5.show();
                s9.show();
                s8.show();
                s3.show();
                s4.show();
                s7.show();
            }

            else if (s.equalsIgnoreCase("March")) {
                s5.show();
                s7.show();
                s10.show();
                s4.show();
                s9.show();
                s8.show();
            }

            else if (s.equalsIgnoreCase("April")) {
                s6.show();
                s9.show();
                s8.show();
                s10.show();
            }

            else if (s.equalsIgnoreCase("May")) {
                s6.show();
                s9.show();
                s8.show();
                s10.show();
            }

            else if (s.equalsIgnoreCase("June")) {
                s6.show();
                s9.show();
            }

            else if (s.equalsIgnoreCase("July")) {
                s6.show();
            }

            else if (s.equalsIgnoreCase("August")) {
                System.out.println(c.red + "NO available options");
                System.out.println(c.green + "Rainy Season");
            }

            else if (s.equalsIgnoreCase("september")) {
                s4.show();
            }

            else if (s.equalsIgnoreCase("October")) {
                s5.show();
                s7.show();
                s4.show();
                s8.show();
            }

            else if (s.equalsIgnoreCase("November")) {
                s5.show();
                s1.show();
                s2.show();
                s3.show();
                s7.show();
                s4.show();
                s8.show();
            }

            else if (s.equalsIgnoreCase("December")) {
                s5.show();
                s1.show();
                s2.show();
                s3.show();
                s7.show();
                s4.show();
                s8.show();
            }

            else {
                System.out.println(c.red + "Invalid data" + color.reset);
                System.out.print(color.purple + " Enter the month you want to travel: " + color.reset);
                s = sc.nextLine();

                continue;
            }
            break;
        }

        System.out.println(c.blue + "Enter the name: " + c.white);
        // sc.nextLine();
        String q = sc.nextLine();
        // String nn= op.nextLine();
        Select.name = q;
        Booking b = new Booking();
        b.select();
        // PRINCE.prince(Select.name);
        Final.ff();

        sc.close();
    }

}