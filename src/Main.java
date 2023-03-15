public class Main {
    public static void main(String[] args) {
        int balance = 130;
        int payment = 1800;
        int bonus = 0;
        int grade = 100;

        if (payment > 1000) {
            bonus = payment / grade;
        }

        balance = balance + payment + bonus;

        System.out.println("Payment: " + payment);
        System.out.println("Bonus: " + bonus);
        System.out.println("Balance: " + balance);
    }
}