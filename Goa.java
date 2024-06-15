package pack1;
import java.util.Scanner;

public class Goa extends State {
    Scanner sc=new Scanner(System.in);
    color c = new color();

    public  int price;

    public Goa() {

    }

    public Goa(int price) {
        this.price = price;
    }

   public  void show() {
        System.out.println("Goa");
    }

    public void show1() {
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

    public class Info {

       public  void infor1() {
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
