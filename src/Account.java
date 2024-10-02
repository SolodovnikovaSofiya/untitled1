import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    /** Создает по умолчанию заданный банковский счет */
    public Account() {
        dateCreated = new Date();
    }
    /** Создает банковский счет с указанным id и балансом */
    public Account(int id, double balance){
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
        }
    }

    public int getID(){
    return id;
    }
    public double getBalance(){
    return balance;
    }

