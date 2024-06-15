package pack1;
import java.util.Scanner;



public class Himachal extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public int price;

    public  Himachal() {

    }

    public Himachal(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Himachal");
    }

    public  void show1() {
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

    public class Info {

        public void infor1() {
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
