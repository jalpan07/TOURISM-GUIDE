 package pack1;
import java.util.Scanner;



public class Ladakh extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public  int price;

    public Ladakh() {

    }

    public Ladakh(int price) {
        this.price = price;
    }

    public  void show() {
        System.out.println("Ladakh");
    }

    public  void show1() {
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

    public  class Info {

        public void infor1() {
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