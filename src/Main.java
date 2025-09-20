public class Main {
    public static void main(String[] args) {
        double balance = 5000.0;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double interestMonth1 = balance * monthlyInterestRate;
        double balanceMonth1 = balance + interestMonth1;

        double interestMonth2 = balanceMonth1 * monthlyInterestRate;
        double balanceMonth2 = balanceMonth1 + interestMonth2;

        System.out.println("Interest after 1 month: $" + Math.round(interestMonth1 * 100.0) / 100.0);
        System.out.println("Balance after 1 month: $" + Math.round(balanceMonth1 * 100.0) / 100.0);

        System.out.println("Interest after 2 months: $" + Math.round(interestMonth2 * 100.0) / 100.0);
        System.out.println("Balance after 2 months: $" + Math.round(balanceMonth2 * 100.0) / 100.0);
    }
}