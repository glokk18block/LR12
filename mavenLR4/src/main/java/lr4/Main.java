package lr4;


class Main {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        Tester tester2 = new Tester("Иван", "Петров");
        Tester tester3 = new Tester("Мария", "Сидорова", 3, "B2", 75000.0);
        Tester tester4 = new Tester("Алексей", "Козлов", 6, "C1", 120000.0);


        System.out.println("=== Информация о тестировщиках ===");
        tester1.displayInfo();
        tester2.displayInfo();
        tester3.displayInfo();
        tester4.displayInfo();


        System.out.println("=== Повышение зарплаты ===");
        tester2.increaseSalary();
        tester3.increaseSalary(15.0);
        tester4.increaseSalary(20.0, "C2");


        System.out.println("=== Проверка senior уровня ===");
        System.out.println(tester3.getName() + " является senior: " + tester3.isSenior());
        System.out.println(tester4.getName() + " является senior: " + tester4.isSenior());


        System.out.println(tester3.getName() + " является senior (опыт 2+, уровень B2+): " +
                tester3.isSenior(2, "B2"));
        System.out.println(tester4.getName() + " является senior (опыт 7+, уровень C2): " +
                tester4.isSenior(7, "C2"));


        System.out.println("=== Статический метод ===");
        Tester[] testersArray = {tester1, tester2, tester3, tester4};


        double averageSalary = Tester.calculateAverageSalary(testersArray);
        System.out.println("Средняя зарплата всех тестировщиков: $" + averageSalary);
    }
}
