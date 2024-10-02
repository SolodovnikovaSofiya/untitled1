public class Main {
    public static void main(String[] args) {
        // Создание нового счета с id = 1 и начальным балансом 1000
        Account account = new Account(1, 1000);
//        Account account2 = new Account(2, 1000);
//        Account account3 = new Account(3, 1000);
//        Account account4 = new Account(4, 1000);
//        Account account5 = new Account(5, 1000);
//        Account account6 = new Account(6, 1000);
//        Account account7 = new Account(7, 1000);
//        Account account8 = new Account(8, 1000);
//        Account account9 = new Account(9, 1000);
//        Account account10 = new Account(10, 1000);


        // Установка годовой процентной ставки
        account.setAnnualInterestRate(4.5);

        // Вывод информации о счете
        System.out.println("ID счета: " + account.getId());
        System.out.println("Баланс: " + account.getBalance());
        System.out.println("Годовая процентная ставка: " + account.getAnnualInterestRate() + "%");
        System.out.println("Дата создания счета: " + account.getDateCreated());

        // Расчет и вывод ежемесячного процента
        System.out.println("Ежемесячный процент: " + account.getMonthlyInterest());

        // Снятие 200 со счета
        account.withdraw(200);
        System.out.println("Баланс после снятия: " + account.getBalance());

        // Пополнение счета на 500
        account.deposit(500);
        System.out.println("Баланс после пополнения: " + account.getBalance());
    }
}