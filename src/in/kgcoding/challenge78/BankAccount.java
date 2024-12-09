package in.kgcoding.challenge78;

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public void depositMoney (double money) {
        if (money <= 0) {
            System.out.println("Insufficient balance");
        } else {
            accountBalance += money;
        }
    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double withdrawMoney (double money) {
        if (money <= 0){
            System.out.println("Invalid withdraw");
        } else if (accountBalance >= money) {
            accountBalance -= money;
        } else {
            money = accountBalance;
            accountBalance = 0;
        }
        return money;
    }

}
