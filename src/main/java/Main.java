public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        // до изменения  - метод вычисляется,но не возвращает значение Бонуса
        // и Бонус далее в программе нигде не выводится и не используется
        // service.calculate(amount, registered);
        // присваиваем значения Бонуса в переменную bonus и выводим в консоль
        long bonus = service.calculate(amount, registered);
        System.out.println("bonus = " + bonus);
    }
}

