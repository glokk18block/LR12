package LR10;

public class ShtatnySotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatnySotrudnik(String fio, String dolzhnost, double oklad, double premiya) {
        super(fio, dolzhnost, oklad);
        setPremiya(premiya);
    }

    public double getPremiya() { return premiya; }
    public void setPremiya(double premiya) {
        if (premiya < 0) {
            throw new IllegalArgumentException("Премия не может быть отрицательной");
        }
        this.premiya = premiya;
    }

    @Override
    public double rasschitatZarplatu() {
        try {

            if (premiya < 0) {
                throw new IllegalStateException("Премия не может быть отрицательной: " + premiya);
            }

            double osnovnayaZarplata = super.rasschitatZarplatu();
            return osnovnayaZarplata + premiya;

        } catch (IllegalStateException e) {
            System.out.println("Ошибка премии: " + e.getMessage());
            return super.rasschitatZarplatu();
        } catch (Exception e) {
            System.out.println("Общая ошибка при расчете зарплаты штатного сотрудника: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Штатный сотрудник: %s, Должность: %s, Оклад: %.2f, Премия: %.2f",
                getFio(), getDolzhnost(), getOklad(), premiya);
    }
}