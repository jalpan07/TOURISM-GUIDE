package pack1;

import java.util.Scanner;


public class Rajasthan extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public void show() {
        System.out.println("Rajasthan");
    }

    public  int price;

    public Rajasthan() {

    }

    public Rajasthan(int price) {
        this.price = price;
    }

    public void show1() {
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

    public class Info {

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