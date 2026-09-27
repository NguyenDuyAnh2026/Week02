package bai2_1;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance < 0) {
            System.out.println("Error!");
            this.balance = 0.0;
        }
        else {
            this.balance = initialBalance;
        }
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        System.out.println("Error.");
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        System.out.println("Error!");
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("\n--- Tạo tài khoản 1 (số dư âm) ---");
        BankAccount acc1 = new BankAccount("ACC001", "Nguyen Van A", -500.0);
        System.out.println("Chủ tài khoản: " + acc1.getOwnerName() + " | Số dư hiện tại: " + acc1.getBalance());
        System.out.println("\n--- Kiểm thử Nạp tiền ---");

        BankAccount acc2 = new BankAccount("ACC002", "Tran Thi B");
        acc2.deposit(1500.0); // Nạp hợp lệ
        acc2.deposit(-200.0); // Nạp không hợp lệ
        System.out.println("Số dư của " + acc2.getOwnerName() + " sau khi nạp: " + acc2.getBalance());

        System.out.println("\n--- Kiểm thử Rút tiền ---");
        boolean success1 = acc2.withdraw(500.0); // Rút hợp lệ
        System.out.println("Rút 500.0: " + (success1 ? "Thành công" : "Thất bại"));

        boolean success2 = acc2.withdraw(2000.0); // Rút vượt quá số dư
        System.out.println("Rút 2000.0: " + (success2 ? "Thành công" : "Thất bại"));

        System.out.println("Số dư cuối cùng của " + acc2.getOwnerName() + ": " + acc2.getBalance());
    }
}