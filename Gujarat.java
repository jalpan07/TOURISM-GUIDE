package pack1;
import java.util.Scanner;


public class Gujarat extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public int price;

    public Gujarat() {

    }

    public Gujarat(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Gujarat");
    }

    public void show1() {

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

    public class Info {

       public  void infor1() {
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