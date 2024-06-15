package pack1;
import java.util.Scanner;


public class Uttrakhand extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public  int price;

    public Uttrakhand() {

    }

    public  Uttrakhand(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Uttrakhand");
    }

    public  void show1() {
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

    public  class Info {

        public  void infor1() {
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
