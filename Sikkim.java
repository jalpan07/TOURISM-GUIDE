package pack1;
import java.util.Scanner;



public class Sikkim extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public  int price;

    public Sikkim() {

    }

    public Sikkim(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Sikkim");
    }

    public void show1() {
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

    public class Info {

        public void infor1() {
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