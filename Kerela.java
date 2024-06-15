package pack1;
import java.util.Scanner;

public class Kerela extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public   int price;

    public  Kerela() {

    }

    public   Kerela(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Kerela");
    }

    public void show1() {
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

    public class Info {

        public void infor1() {
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
