import java.util.Date;

public class Account {
    // Скрытые поля данных
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Безаргументный конструктор
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Конструктор с параметрами
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Getter и setter для id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter и setter для balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter и setter для annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Getter для dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Метод для расчета ежемесячного процента
    public double getMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        return balance * monthlyInterestRate;
    }

    // Метод для снятия средств со счета
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }
}