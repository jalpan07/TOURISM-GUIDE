import java.util.*;

class color {

    public static final String yellow = "\u001B[33m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String blue = "\u001B[34m";
    public static final String purple = "\u001B[35m";
    public static final String cyan = "\u001B[46m";
    public static final String white = "\u001B[37m";
    public static final String reset = "\u001B[0m";

    public static final String byellow = "\u001B[43m";
    public static final String bred = "\u001B[41m";
    public static final String bgreen = "\u001B[42m";
    public static final String bblue = "\u001B[44m";
    public static final String bpurple = "\u001B[45m";
    public static final String bcyan = "\u001B[46m";
    public static final String bwhite = " \u001B[47m";
    public static final String bblack = "\u001B[40m";

}

interface Choices {
    abstract void getinfo();

    Scanner sc = new Scanner(System.in);

}

class Select {
    static String name;
    static int price;
}

class PRINCE

{
    static void prince(String pla) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
                s1.show();
                Gujarat obb1 = new Gujarat();
                Gujarat.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Goa")) {
                s2.show();
                Goa obb1 = new Goa();
                Goa.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Rajasthan")) {
                s3.show();
                Rajasthan obb1 = new Rajasthan();
                Rajasthan.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Kerela")) {
                s4.show();
                Kerela obb1 = new Kerela();
                Kerela.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("delhi")) {
                s5.show();
                Delhi obb1 = new Delhi();
                Delhi.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("ladakh")) {
                s6.show();
                Ladakh obb1 = new Ladakh();
                Ladakh.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Uttrakhand")) {
                s7.show();
                Uttrakhand obb1 = new Uttrakhand();
                Uttrakhand.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("andaman")) {
                s8.show();
                Andaman obb1 = new Andaman();
                Andaman.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("himachal")) {
                s9.show();
                Himachal obb1 = new Himachal();
                Himachal.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Sikkim")) {
                s10.show();
                Sikkim obb1 = new Sikkim();
                Sikkim.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else {
                System.out.println("Enter valid!!!");
                System.out.println("Enter again!");
                pla = sc.nextLine();
                continue;
            }

            break;
        }
    }

}

class Places implements Choices {

    public void getinfo() {
        color c = new color();
        System.out.println();
        System.out.println(color.yellow + "       Our Services are active in  " + color.reset);
        String array[] = new String[10];
        String arr[] = new String[10];
        System.out.println();
        arr[0] = "---->          Gujarat           <----";
        arr[1] = "---->            Goa             <----";
        arr[2] = "---->      Himachal Pradesh      <----";
        arr[3] = "---->           Sikkim           <----";
        arr[4] = "---->          Rajasthan         <----";
        arr[5] = "---->           Kerela           <----";
        arr[6] = "---->           Ladakh           <----";
        arr[7] = "----> Andaman and Nicobar Island <----";
        arr[8] = "---->            Delhi           <----";
        arr[9] = "---->          Uttrakhand        <----";
        System.out.println();
        System.out.println();
        array[0] = "Gujarat";
        array[1] = "Goa";
        array[2] = "Himachal Pradesh";
        array[3] = "Sikkim";
        array[4] = "Rajasthan";
        array[5] = "Kerala";
        array[6] = "Ladakh";
        array[7] = "Andaman and Nicobar Island";
        array[8] = "Delhi";
        array[9] = "Uttrakhand";

        for (int i = 0; i < array.length; i++) {
            System.out.println(color.green + arr[i]);
        }
        System.out.print(color.purple + "\n\nEnter the place for your tour: " + color.reset);
        String pla = sc.nextLine();
        boolean chk = false;
        for (int i = 0; i < array.length; i++) {
            if (pla.equalsIgnoreCase(array[i])) {
                System.out.println();
                chk = true;
                break;
            }
        }

        if (!chk) {
            System.out.println(color.red + "Please Enter again!" + color.reset);
            getinfo();
        } else {
            Select.name = pla;
            Booking b = new Booking();
            b.select();

            Final.ff();
        }

    }

}

class Manav extends Exception {
    public Manav(String s) {
        super(s);

    }
}

class Mep {
    static void validate(String s) throws Manav {
        if (s.length() == 0) {
            // throw new Manav(" ");
        } else {
            System.out.println("Do enter again!");
        }
    }
}

class Time implements Choices {
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

abstract class State {
    abstract void show();

    abstract void show1();

    Scanner sc = new Scanner(System.in);
}

class Gujarat extends State {
    color c = new color();

    int price;

    Gujarat() {

    }

    Gujarat(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Gujarat");
    }

    void show1() {

        System.out.println();
        System.out.println(c.green + "***Gujarat***");
        System.out.println();
        System.out.println(c.blue + "Top Attractions and best tourist places");
        System.out.println(c.yellow + "Runn of kutch");
        System.out.println("palitana");
        System.out.println("saputara");
        System.out.println("Akshardham");
        System.out.println("Rani ki vav");
        System.out.println("statue of Unity");
        System.out.println("Gir National park");
        System.out.println();
        System.out.println("6N/7D");
        // System.out.println("Best time to visit: November to February");
        // System.out.println("Budget : INR 20000 to 25000");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 20000");
            System.out.println("Premium Plan: 25000");
            int y = 0;
            boolean bb = false;

            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 20000 || y == 25000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Gujarat ob = new Gujarat(y);
            Select.price = ob.price;

        }

    }
}

class Goa extends State {
    color c = new color();

    int price;

    Goa() {

    }

    Goa(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Goa");
    }

    void show1() {
        System.out.println();
        System.out.println(color.green + "***Goa***");
        System.out.println();
        System.out.println(color.blue + "Top Attractions and best tourist places");
        System.out.println(color.yellow + "Calangute beach");
        System.out.println("Fort Anguada");
        System.out.println("Dine at cruice");
        System.out.println("Dudhsagar waterfall");
        System.out.println("chapora beach");
        System.out.println("Basilica at bom jesus");
        System.out.println("Church of our lady of the immaculate conception");
        System.out.println("Party at cruice");
        System.out.println("Anjuna flea market");
        System.out.println("Party at tito's");
        System.out.println();
        System.out.println("9N/11D");
    }

    class Info {

        void infor1() {
            System.out.println(color.red + "*Select any plan: ");
            System.out.println(color.yellow + "Popular Plan: 45000");
            System.out.println("Premium Plan: 50000");

            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 45000 || y == 50000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Goa ob = new Goa(y);
            Select.price = ob.price;

        }

    }

}

class Delhi extends State {
    color c = new color();

    int price;

    Delhi() {

    }

    Delhi(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Delhi");
    }

    void show1() {
        System.out.println();
        System.out.println(color.green + "***Delhi***");
        System.out.println();
        System.out.println(color.blue + "Top Attractions and best tourist places");
        System.out.println(color.yellow + "Red fort");
        System.out.println("Qutub minar");
        System.out.println("Humayun's Tomb");
        System.out.println("India Gate");
        System.out.println("lotus temple");
        System.out.println("Jnatar Mantar");
        System.out.println("Akshardham");
        System.out.println();
        System.out.println("3N/4D");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "Select any plan: ");
            System.out.println(c.white + "Popular Plan: 10000");
            System.out.println("Premium Plan: 20000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 10000 || y == 20000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Delhi ob = new Delhi(y);
            Select.price = ob.price;

        }

    }

}

class Ladakh extends State {
    color c = new color();

    int price;

    Ladakh() {

    }

    Ladakh(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Ladakh");
    }

    void show1() {
        System.out.println();
        System.out.println(c.green + "**ladakh*");
        System.out.println();
        System.out.println(c.blue + "Top Attractions and best tourist places");
        System.out.println(c.yellow + "Nubra valley");
        System.out.println("Zanskar valley");
        System.out.println("Pangong lake");
        System.out.println("Drive up magnetic hill");
        System.out.println("Khardung La Pass");
        System.out.println("Sangam");
        System.out.println("Shanti Stupa");
        System.out.println("Thiksey Monastery");
        System.out.println("Leh palace");
        System.out.println("Hunder Village");
        System.out.println("Lachung temple");
        System.out.println();
        System.out.println("5N/6D");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 25000");
            System.out.println("Premium Plan: 35000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 25000 || y == 35000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Ladakh ob = new Ladakh(y);
            Select.price = ob.price;

        }

    }

}

class Rajasthan extends State {
    color c = new color();

    void show() {
        System.out.println("Rajasthan");
    }

    int price;

    Rajasthan() {

    }

    Rajasthan(int price) {
        this.price = price;
    }

    void show1() {
        System.out.println();

        System.out.println(c.green + "**rajasthan*");
        System.out.println();

        System.out.println(c.blue + "Top Attractions and best tourist places");
        System.out.println(c.yellow + "Jodhpur");
        System.out.println("Udaipur");
        System.out.println("Jaipur");
        System.out.println("Jaisalmer");
        System.out.println("Ranthambore Natioanl Park");
        System.out.println("Bikaner");
        System.out.println("Ajmer");
        System.out.println("Mount abu");
        System.out.println("Chittorgarh Fort");
        System.out.println("Nathdwara");
        System.out.println();

        System.out.println("19N/20D");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 90000");
            System.out.println("Premium Plan: 95000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 90000 || y == 95000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Rajasthan ob = new Rajasthan(y);
            Select.price = ob.price;

        }

    }

}

class Sikkim extends State {
    color c = new color();

    int price;

    Sikkim() {

    }

    Sikkim(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Sikkim");
    }

    void show1() {
        System.out.println();

        System.out.println(c.green + "*Sikkim**");
        System.out.println();

        System.out.println(c.blue + "Top Attractions and best tourist places");
        System.out.println(c.yellow + "Gangtok");
        System.out.println("Pelling");
        System.out.println("Lachung");
        System.out.println("Silliguri");
        System.out.println("Yumthang");
        System.out.println("Ravangla");
        System.out.println("Gorumara National Park");
        System.out.println("Namchi");
        System.out.println("Zuluk");
        System.out.println("Phuentsholing");
        System.out.println();

        System.out.println("12N/13D");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 85000");
            System.out.println("Premium Plan: 90000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 85000 || y == 90000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Sikkim ob = new Sikkim(y);
            Select.price = ob.price;

        }

    }

}

class Himachal extends State {
    color c = new color();

    int price;

    Himachal() {

    }

    Himachal(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Himachal");
    }

    void show1() {
        System.out.println();

        System.out.println(c.green + "**Himachal*");
        System.out.println(c.purple
                + "The dalai lam resides in this himalyan mountain state, home to many Buddhist, Hindu temple");
        System.out.println();

        System.out.println(c.blue + "top attractions and best tourist places");
        System.out.println(c.yellow + "Rohtang La");
        System.out.println("Hadimba devi temple");
        System.out.println("Chandra taal");
        System.out.println("mall road");
        System.out.println("Triund");
        System.out.println("Bhringu lake");
        System.out.println();

        System.out.println("3N/4D");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 23000 || y == 25000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Himachal ob = new Himachal(y);
            Select.price = ob.price;

        }

    }
}

class Andaman extends State {
    color c = new color();

    int price;

    Andaman() {

    }

    Andaman(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Andaman");
    }

    void show1() {
        System.out.println();

        System.out.println(c.green + "Andaman and Nikobar");
        System.out.println();
        System.out.println(c.blue + "top attractions and best tourist places");
        System.out.println(c.yellow + "Port Blair");
        System.out.println("Boarding island");
        System.out.println("Diglipur");
        System.out.println("Ross island");
        System.out.println("Cellular Jail");
        System.out.println("Jolly Buoy island");
        System.out.println("Mahatma Gandhi national park");
        System.out.println("Elephant beach");
        System.out.println("samudrika marine musuem");
        System.out.println();
        System.out.println("10D/9N");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 70000");
            System.out.println("Premium Plan: 75000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 70000 || y == 75000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Andaman ob = new Andaman(y);
            Select.price = ob.price;

        }

    }

}

class Uttrakhand extends State {
    color c = new color();

    int price;

    Uttrakhand() {

    }

    Uttrakhand(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Uttrakhand");
    }

    void show1() {
        System.out.println();
        System.out.println(c.green + "*Uttrakhand**");
        System.out.println();
        System.out.println(c.blue + "top attractions and best tourist places");
        System.out.println(c.yellow + "Rishikesh");
        System.out.println("Nainital");
        System.out.println("Massorie");
        System.out.println("Haridwar");
        System.out.println("Jim Corbett National park");
        System.out.println("Kedarnath");
        System.out.println("Dehradun");
        System.out.println("Kanatal");
        System.out.println();
        System.out.println("7D/6N");

    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 35000");
            System.out.println("Premium Plan: 40000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 35000 || y == 40000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Uttrakhand ob = new Uttrakhand(y);
            Select.price = ob.price;

        }

    }

}

class Kerela extends State {
    color c = new color();

    int price;

    Kerela() {

    }

    Kerela(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Kerela");
    }

    void show1() {
        System.out.println();
        System.out.println(c.green + "Kerela*");
        System.out.println();
        System.out.println(c.blue + "top attractions and best tourist places");
        System.out.println(c.yellow + "Eravikulam National park");
        System.out.println("varkala beach");
        System.out.println("silent vally national park");
        System.out.println("Mattancherry palace");
        System.out.println("Cherai Beach");
        System.out.println("Edakkal caves");
        System.out.println("Athirappilly waterfall");
        System.out.println("8D/7N");
    }

    class Info {

        void infor1() {
            System.out.println(c.red + "*Select any plan: ");
            System.out.println(c.white + "Popular Plan: 45000");
            System.out.println("Premium Plan: 50000");
            int y = 0;
            while (true) {
                try {
                    y = sc.nextInt();
                } catch (Exception e) {

                    System.out.println(e);
                    Exc.ex();

                }
                if (y == 45000 || y == 50000) {
                    break;
                } else {
                    System.out.print("Please enter valid price: ");
                }

            }
            Kerela ob = new Kerela(y);
            Select.price = ob.price;

        }

    }
}

class Budget implements Choices {
    color c = new color();
    Scanner op = new Scanner(System.in);

    public void getinfo() {
        int budget = 0;
        boolean f = true;
        System.out.print("\nEnter your budget: ");
        try {
            while (f) {
                budget = op.nextInt();
                f = false;
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

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
        boolean c1 = true;
        if (budget >= 10000 && budget <= 20000) {
            s5.show();
        } else if (budget > 20000 && budget <= 25000) {
            s1.show();
            s9.show();
        } else if (budget > 25000 && budget <= 40000) {
            s6.show();
            s7.show();
        } else if (budget > 35000 && budget <= 50000) {
            s4.show();
            s2.show();
        } else if (budget > 50000 && budget <= 75000) {
            s8.show();
        } else if (budget >= 75000) {
            s10.show();
            s3.show();
        } else {
            System.out.println(c.purple + "No options available");
            c1 = false;
        }

        if (c1) {
            System.out.println(color.blue + "Please select the place: " + color.white);
            op.nextLine();
            String nn = op.nextLine();
            Select.name = nn;
            Booking b = new Booking();
            b.select();
            Final.ff();
        }
    }
}

class Booking {
    void select() {

        PRINCE.prince(Select.name);

    }
}

class Final {
    color c = new color();

    static void ekta(String pla) {
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

    static void ff() {
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

class Exc {
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

public class Main {

    public static void main(String[] args) {
        Main.welcome();
        Exc.ex();

    }

    static void welcome() {
        System.out.println(color.yellow + "\n \n");
        System.out.println("  \t\t\t###############################################################################");
        System.out.println("\n\t\t\t############              DSA Project:        Made by :            ############");
        System.out.println("\n\t\t\t############              Ekta Kalavadiya     21BCE106             ############");
        System.out.println("\n\t\t\t############              Manav Pandya        21BCE143             ############");
        System.out.println("\n\t\t\t############              Prince Nasit        21BCE163             ############");
        System.out.println("\n\t\t\t###############################################################################"
                + color.reset);
        System.out.println("\n\t\t\t---------------------------------------------------------------------------\n");

        System.out.println(
                "\n*********************************************************************************************\n");

        System.out.println("\n\t\t\tWelcome to the Tour Booking System!!\n");
    }
}