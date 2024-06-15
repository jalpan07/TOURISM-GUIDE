package pack1;
import java.util.Scanner;

public class Delhi extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public int price;

    public   Delhi() {

    }

    public  Delhi(int price) {
        this.price = price;
    }

    public  void show() {
        System.out.println("Delhi");
    }

    public  void show1() {
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

    public  class Info {

        public  void infor1() {
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
