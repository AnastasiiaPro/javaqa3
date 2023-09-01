
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 20_610;
        int oneBonusMile = 20;

        int BonusMile = ticketPrice / oneBonusMile;

        System.out.println("Всего начислено бонусов: " + BonusMile + " руб.");
    }
}