public class Main {
    public static void main(String[] args) {

        int grandAmount;
        int initialAmount = 450;
        int paymentAmount = 1110;
        int bonus = (int) paymentAmount / 100;
        grandAmount = initialAmount + paymentAmount + bonus;

        if (paymentAmount >= 1000) {
            System.out.println("Итоговая сумма на счету: " + (grandAmount));
        } else {
            System.out.println("Итоговая сумма на счету: " + (initialAmount + paymentAmount));
        }

    }
}