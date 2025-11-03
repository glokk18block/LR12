package lr4;

class Tester {

    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;




    public Tester() {
        this("Неизвестно", "Неизвестно", 0, "A1", 0.0);
    }


    public Tester(String name, String surname) {
        this(name, surname, 1, "B1", 50000.0);
    }


    public Tester(String name, String surname, int expirienceInYears,
                  String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }




    public void increaseSalary() {
        this.salary *= 1.1;
        System.out.println("Зарплата повышена на 10%. Новая зарплата: " + this.salary);
    }


    public void increaseSalary(double percentage) {
        this.salary *= (1 + percentage / 100);
        System.out.println("Зарплата повышена на " + percentage + "%. Новая зарплата: " + this.salary);
    }


    public void increaseSalary(double percentage, String newEnglishLevel) {
        this.salary *= (1 + percentage / 100);
        this.englishLevel = newEnglishLevel;
        System.out.println("Зарплата повышена на " + percentage + "%. Уровень английского изменен на: " +
                newEnglishLevel + ". Новая зарплата: " + this.salary);
    }


    public void displayInfo() {
        System.out.println("Тестировщик: " + name + " " + surname);
        System.out.println("Опыт: " + expirienceInYears + " лет");
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: $" + salary);
        System.out.println("------------------------");
    }


    public boolean isSenior() {
        return this.expirienceInYears >= 5 &&
                (this.englishLevel.equals("C1") || this.englishLevel.equals("C2"));
    }


    public boolean isSenior(int minExperience, String requiredLevel) {
        return this.expirienceInYears >= minExperience &&
                this.englishLevel.equals(requiredLevel);
    }


    public static double calculateAverageSalary(Tester[] testers) {
        if (testers == null || testers.length == 0) {
            return 0.0;
        }

        double total = 0;
        for (Tester tester : testers) {
            total += tester.salary;
        }

        return total / testers.length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

