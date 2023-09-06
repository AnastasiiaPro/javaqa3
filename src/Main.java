public class Main {
    public static void main(String[] args) {

        int ticketPrice = 20_610;
        int oneBonusMile = 20;

        int bonusMile = ticketPrice / oneBonusMile;

        System.out.println("Итого начислено : " + bonusMile + " бонусов ");
    }
}