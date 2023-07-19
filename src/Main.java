// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }

    public static Phone createObject(String Model) {
        switch (Model) {
            case ("IPhone"):
                IPhone iphone = new IPhone(2988, "S6+", "Phlagman");
                return iphone;
            case ("SAMSUNG"):
                Samsung samsung = new Samsung("a4", 3000, "CopyModel");
                return samsung;
            case ("BlackShark"):
                BlackSharke blackSharke = new BlackSharke(6000, "Shark");
                return blackSharke;

            System.out.println("MODEL: " + Model + "AKB: " + Phone.getAKB());


        }
    }
}