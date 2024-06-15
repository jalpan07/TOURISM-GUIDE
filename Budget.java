package pack1;
import java.util.*;

public class Budget implements Choices {
    color c = new color();
    Scanner op = new Scanner(System.in);

    public void getinfo() {
        int budget = 0;
        boolean f = true;
        System.out.print("\nEnter your budget: ");
        try {
            while (f) {
                budget = op.nextInt();
                f = false;
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

        State s1 = new Gujarat();
        State s2 = new Goa();
        State s3 = new Rajasthan();
        State s4 = new Kerela();
        State s5 = new Delhi();
        State s6 = new Ladakh();
        State s7 = new Uttrakhand();
        State s8 = new Andaman();
        State s9 = new Himachal();
        State s10 = new Sikkim();
        boolean c1 = true;
        if (budget >= 10000 && budget <= 20000) {
            s5.show();
        } else if (budget > 20000 && budget <= 25000) {
            s1.show();
            s9.show();
        } else if (budget > 25000 && budget <= 40000) {
            s6.show();
            s7.show();
        } else if (budget > 35000 && budget <= 50000) {
            s4.show();
            s2.show();
        } else if (budget > 50000 && budget <= 75000) {
            s8.show();
        } else if (budget >= 75000) {
            s10.show();
            s3.show();
        } else {
            System.out.println(c.purple + "No options available");
            c1 = false;
        }

        if (c1) {
            System.out.println(color.blue + "Please select the place: " + color.white);
            op.nextLine();
            String nn = op.nextLine();
            Select.name = nn;
            Booking b = new Booking();
            b.select();
            Final.ff();
        }
    }
}