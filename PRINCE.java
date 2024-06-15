package pack1;

public class PRINCE

{
    public static void prince(String pla) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
            if (pla.equalsIgnoreCase("Gujarat")) {
                s1.show();
                Gujarat obb1 = new Gujarat();
                Gujarat.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Goa")) {
                s2.show();
                Goa obb1 = new Goa();
                Goa.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Rajasthan")) {
                s3.show();
                Rajasthan obb1 = new Rajasthan();
                Rajasthan.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Kerela")) {
                s4.show();
                Kerela obb1 = new Kerela();
                Kerela.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("delhi")) {
                s5.show();
                Delhi obb1 = new Delhi();
                Delhi.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("ladakh")) {
                s6.show();
                Ladakh obb1 = new Ladakh();
                Ladakh.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Uttrakhand")) {
                s7.show();
                Uttrakhand obb1 = new Uttrakhand();
                Uttrakhand.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("andaman")) {
                s8.show();
                Andaman obb1 = new Andaman();
                Andaman.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("himachal")) {
                s9.show();
                Himachal obb1 = new Himachal();
                Himachal.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else if (pla.equalsIgnoreCase("Sikkim")) {
                s10.show();
                Sikkim obb1 = new Sikkim();
                Sikkim.Info obb = obb1.new Info();
                obb.infor1();
                // Select.price=obb1.price;
            } else {
                System.out.println("Enter valid!!!");
                System.out.println("Enter again!");
                pla = sc.nextLine();
                continue;
            }

            break;
        }
    }

}