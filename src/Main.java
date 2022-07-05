public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        if (refill > 1000) {
            balance = balance + refill + refill / 100;
        } else {
            balance = balance + refill;
        }
        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = bonus;
        }
        System.out.println(balance);
        System.out.println(bonus);
    }
}