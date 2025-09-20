public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {
        double balance = 5000.0;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double interestMonth1 = balance * monthlyInterestRate;
        double balanceMonth1 = balance + interestMonth1;

        double interestMonth2 = balanceMonth1 * monthlyInterestRate;
        double balanceMonth2 = balanceMonth1 + interestMonth2;

        System.out.printf("Interest after 1 month: $%.2f%n", interestMonth1);
        System.out.printf("Balance after 1 month: $%.2f%n", balanceMonth1);

        System.out.printf("Interest after 2 months: $%.2f%n", interestMonth2);
        System.out.printf("Balance after 2 months: $%.2f%n", balanceMonth2);
    }
}