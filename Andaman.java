package pack1;

import java.util.Scanner;

public class Andaman extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public  int price;

    public  Andaman() {

    }

    public  Andaman(int price) {
        this.price = price;
    }

    public   void show() {
        System.out.println("Andaman");
    }

    public void show1() {
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

    public class Info {

        public  void infor1() {
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
