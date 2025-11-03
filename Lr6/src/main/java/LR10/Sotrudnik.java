package LR10;

public class Sotrudnik {
    private String fio;
    private String dolzhnost;
    private double oklad;

    public Sotrudnik(String fio, String dolzhnost, double oklad) {
        setFio(fio);
        setDolzhnost(dolzhnost);
        setOklad(oklad);
    }

    public String getFio() { return fio; }
    public void setFio(String fio) {
        if (fio == null || fio.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        this.fio = fio;
    }

    public String getDolzhnost() { return dolzhnost; }
    public void setDolzhnost(String dolzhnost) {
        if (dolzhnost == null || dolzhnost.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        this.dolzhnost = dolzhnost;
    }

    public double getOklad() { return oklad; }
    public void setOklad(double oklad) {
        if (oklad < 0) {
            throw new IllegalArgumentException("Невозможно создать сотрудника -- указан отрицательный оклад: " + oklad);
        }
        this.oklad = oklad;
    }

    public double rasschitatZarplatu() {
        try {
            if (oklad <= 0) {
                throw new IllegalStateException("Оклад должен быть положительным числом");
            }
            return oklad;
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s, Должность: %s, Оклад: %.2f", fio, dolzhnost, oklad);
    }
}