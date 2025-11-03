package LR10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Создание фирмы
            System.out.print("Введите название фирмы: ");
            String nazvanieFirmy = scanner.nextLine();
            if (nazvanieFirmy.trim().isEmpty()) {
                throw new IllegalArgumentException("Название фирмы не может быть пустым");
            }
            Firma firma = new Firma(nazvanieFirmy);


            Otdel otdelIT = new Otdel("IT отдел");
            Otdel otdelProdazh = new Otdel("Отдел продаж");


            System.out.println("\n=== Тестирование обработки исключений ===");


            try {
                System.out.println("Попытка создать сотрудника с отрицательным окладом...");
                Sotrudnik sotrudnikSOtritsatelnymOkladom = new Sotrudnik(
                        "Иван Иванов", "Программист", -50000
                );
            } catch (IllegalArgumentException e) {
                System.out.println("Перехвачено IllegalArgumentException: " + e.getMessage());

                try {
                    throw new IllegalStateException("Повторное исключение: " + e.getMessage());
                } catch (IllegalStateException e2) {
                    System.out.println("Перехвачено повторное IllegalStateException: " + e2.getMessage());
                }
            }


            try {

                ShtatnySotrudnik sotrudnik1 = new ShtatnySotrudnik(
                        "Анна Петрова", "Senior Developer", 50000, 10000
                );
                otdelIT.dobavitSotrudnika(sotrudnik1);


                System.out.println("\nПопытка установить отрицательную премию...");
                ShtatnySotrudnik sotrudnikSNegativnoyPremiey = new ShtatnySotrudnik(
                        "Петр Сидоров", "Middle Developer", 40000, -5000
                );

            } catch (IllegalArgumentException e) {
                System.out.println("Перехвачено IllegalArgumentException при создании сотрудника: " + e.getMessage());
            }


            try {
                ShtatnySotrudnik sotrudnik2 = new ShtatnySotrudnik(
                        "Мария Иванова", "Junior Developer", 30000, 5000
                );
                otdelIT.dobavitSotrudnika(sotrudnik2);


                SotrudnikPoKontraktu sotrudnik3 = new SotrudnikPoKontraktu(
                        "Сергей Козлов", "Консультант", 160, 2000
                );
                otdelProdazh.dobavitSotrudnika(sotrudnik3);

                SotrudnikPoKontraktu sotrudnik4 = new SotrudnikPoKontraktu(
                        "Ольга Новикова", "Менеджер", 120, 1800
                );
                otdelProdazh.dobavitSotrudnika(sotrudnik4);

            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка при создании сотрудника: " + e.getMessage());
            }


            firma.dobavitOtdel(otdelIT);
            firma.dobavitOtdel(otdelProdazh);


            System.out.println("\n=== Структура предприятия ===");
            firma.vivestiStrukturu();


            System.out.println("\n=== Расчет зарплат ===");
            System.out.println("Общая зарплата по фирме: " + firma.rasschitatObshuyuZarplatu());


            testVvodDannyh(scanner);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nПрограмма завершена. Ресурсы освобождены.");
        }
    }

    private static void testVvodDannyh(Scanner scanner) {
        System.out.println("\n=== Тестирование ввода данных ===");

        try {
            System.out.print("Введите ФИО сотрудника: ");
            String fio = scanner.nextLine();
            if (fio.trim().isEmpty()) {
                throw new IllegalArgumentException("ФИО не может быть пустым");
            }

            System.out.print("Введите должность: ");
            String dolzhnost = scanner.nextLine();
            if (dolzhnost.trim().isEmpty()) {
                throw new IllegalArgumentException("Должность не может быть пустой");
            }

            System.out.print("Введите оклад: ");
            String okladInput = scanner.nextLine();
            double oklad;
            try {
                oklad = Double.parseDouble(okladInput);
                if (oklad < 0) {
                    throw new IllegalArgumentException("Оклад не может быть отрицательным");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Неверный формат оклада: " + okladInput);
            }

            System.out.println("Успешно создан сотрудник: " + fio + ", " + dolzhnost + ", оклад: " + oklad);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        }
    }
    }
