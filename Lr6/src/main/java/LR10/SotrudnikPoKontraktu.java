package LR10;

public class SotrudnikPoKontraktu extends Sotrudnik {
    private int chasyRaboty;
    private double stavkaZaChas;

    public SotrudnikPoKontraktu(String fio, String dolzhnost, int chasyRaboty, double stavkaZaChas) {
        super(fio, dolzhnost, 0);
        setChasyRaboty(chasyRaboty);
        setStavkaZaChas(stavkaZaChas);
    }

    public int getChasyRaboty() { return chasyRaboty; }
    public void setChasyRaboty(int chasyRaboty) {
        if (chasyRaboty < 0) {
            throw new IllegalArgumentException("Часы работы не могут быть отрицательными");
        }
        this.chasyRaboty = chasyRaboty;
    }

    public double getStavkaZaChas() { return stavkaZaChas; }
    public void setStavkaZaChas(double stavkaZaChas) {
        if (stavkaZaChas < 0) {
            throw new IllegalArgumentException("Ставка за час не может быть отрицательной");
        }
        this.stavkaZaChas = stavkaZaChas;
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (chasyRaboty < 0) {
                throw new IllegalStateException("Часы работы не могут быть отрицательными");
            }
            if (stavkaZaChas < 0) {
                throw new IllegalStateException("Ставка за час не может быть отрицательной");
            }
            return chasyRaboty * stavkaZaChas;
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты сотрудника по контракту: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Сотрудник по контракту: %s, Должность: %s, Часы: %d, Ставка: %.2f",
                getFio(), getDolzhnost(), chasyRaboty, stavkaZaChas);
    }
}