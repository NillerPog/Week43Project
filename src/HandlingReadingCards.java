import java.util.Scanner;

public class HandlingReadingCards {

    public static int globalCount;
    public static void main(String[] args) {

        handlingReadingCardsSubMenu();

    }


    public static int readingCard(int countReadingCard) {
        Scanner in = new Scanner(System.in);
        boolean repeat = true;


        String[] intArray = new String[12];

        //Serial number input
        intArray[0] = "Serial 1";
        intArray[4] = "Serial 2";
        intArray[8] = "Serial 3";

        for (int i = 1; i <= 12; i = i + 4) {
            System.out.println("Insert reading number");
            String readingNo = in.next();
            intArray[i] = readingNo;
        }
        System.out.println(intArray[4]+" "+intArray[5]);
        return 0;
        /*
        do {
            System.out.println("Water consumption amount");
            double waterDrainage = in.nextDouble();
            System.out.println("Water used");
            double waterUsed = in.nextDouble();
            //System.out.println("Meter number");
            //String meterSerial = in.next();


            System.out.println(waterDrainage + " " + waterUsed + " "); //Goes to database


            System.out.println("Add additional data press 1,  any key to exit.");
            String con = in.next();
            if(!con.equals("1")){
                repeat = false;
            }

            countReadingCard++;

        } while (repeat);
        System.out.println("Done");
        globalCount = countReadingCard;
        return 0;

         */
    }


    public static void requestReadingCard(){
        Scanner in = new Scanner(System.in);
        System.out.println("Send out reading card press 1");
        String send = in.next();
        int test = 0;

        if (send.equals("1")){
            for (int i = 0; i < globalCount; i++) {
                test++;
            }
            System.out.println("Succefully sent to " + test + " people"); //Each card to unique user from database
        }
    }


    public static void handlingReadingCardsSubMenu(){

        //Test submenu
        Scanner in = new Scanner(System.in);

        int countMenu = 0;

        while(true) {
            System.out.println("Enter reading card 1, Send reading card 2");
            int menu = in.nextInt(); //Choose what manu option you want
            if(menu == 1) {
                readingCard(countMenu); //Add more reading card data to DB
                countMenu++;
            }
            if(menu == 2) {
                requestReadingCard(); //Send reading cards to amount of people in db
            }
        }
    }
}
