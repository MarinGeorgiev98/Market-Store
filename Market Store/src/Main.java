import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Card bronzeCard = new BronzeCard(0, 150);
        Card silverCard = new SilverCard(600, 850);
        Card goldCard = new GoldCard(1500, 1300);

        System.out.println(bronzeCard);
        System.out.println(silverCard);
        System.out.println(goldCard);
    }
}