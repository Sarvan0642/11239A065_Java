class Account {
    private String accountNumber;
    private String accountHolder;

    void setDetails(String number, String holder) {
        this.accountNumber = number;
        this.accountHolder = holder;
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

class SavingsAccount extends Account {
    private double balance;

    void setBalance(double bal) {
        this.balance = bal;
    }

    void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}

public class AccountDetails {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setDetails("123456789", "Alice");
        sa.setBalance(1500.75);

        sa.showDetails();
        sa.showBalance();
    }
}
