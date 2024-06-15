package pack1;



public class Places implements Choices {

    public void getinfo() {
        color c = new color();
        System.out.println();
        System.out.println(color.yellow + "       Our Services are active in  " + color.reset);
        String array[] = new String[10];
        String arr[] = new String[10];
        System.out.println();
        arr[0] = "---->          Gujarat           <----";
        arr[1] = "---->            Goa             <----";
        arr[2] = "---->      Himachal Pradesh      <----";
        arr[3] = "---->           Sikkim           <----";
        arr[4] = "---->          Rajasthan         <----";
        arr[5] = "---->           Kerela           <----";
        arr[6] = "---->           Ladakh           <----";
        arr[7] = "----> Andaman and Nicobar Island <----";
        arr[8] = "---->            Delhi           <----";
        arr[9] = "---->          Uttrakhand        <----";
        System.out.println();
        System.out.println();
        array[0] = "Gujarat";
        array[1] = "Goa";
        array[2] = "Himachal Pradesh";
        array[3] = "Sikkim";
        array[4] = "Rajasthan";
        array[5] = "Kerala";
        array[6] = "Ladakh";
        array[7] = "Andaman and Nicobar Island";
        array[8] = "Delhi";
        array[9] = "Uttrakhand";

        for (int i = 0; i < array.length; i++) {
            System.out.println(color.green + arr[i]);
        }
        System.out.print(color.purple + "\n\nEnter the place for your tour: " + color.reset);
        String pla = sc.nextLine();
        boolean chk = false;
        for (int i = 0; i < array.length; i++) {
            if (pla.equalsIgnoreCase(array[i])) {
                System.out.println();
                chk = true;
                break;
            }
        }

        if (!chk) {
            System.out.println(color.red + "Please Enter again!" + color.reset);
            getinfo();
        } else {
            Select.name = pla;
            Booking b = new Booking();
            b.select();

            Final.ff();
        }

    }

}