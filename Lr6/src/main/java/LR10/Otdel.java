package LR10;

import java.util.ArrayList;
import java.util.List;

public class Otdel {
    private String nazvanie;
    private List<Sotrudnik> sotrudniki;

    public Otdel(String nazvanie) {
        setNazvanie(nazvanie);
        this.sotrudniki = new ArrayList<>();
    }

    public String getNazvanie() { return nazvanie; }
    public void setNazvanie(String nazvanie) {
        if (nazvanie == null || nazvanie.trim().isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        this.nazvanie = nazvanie;
    }

    public int getKolichestvoSotrudnikov() {
        return sotrudniki.size();
    }

    public void dobavitSotrudnika(Sotrudnik sotrudnik) {
        if (sotrudnik == null) {
            throw new NullPointerException("Сотрудник не может быть null");
        }
        sotrudniki.add(sotrudnik);
    }

    public double rasschitatObshuyuZarplatu() {
        double obshayaZarplata = 0;
        for (Sotrudnik sotrudnik : sotrudniki) {
            obshayaZarplata += sotrudnik.rasschitatZarplatu();
        }
        return obshayaZarplata;
    }

    public void vivestiSpisokSotrudnikov() {
        System.out.println("Отдел: " + nazvanie);
        System.out.println("Количество сотрудников: " + getKolichestvoSotrudnikov());
        System.out.println("Список сотрудников:");
        for (Sotrudnik sotrudnik : sotrudniki) {
            System.out.println("  - " + sotrudnik);
        }
        System.out.println("Общая зарплата отдела: " + rasschitatObshuyuZarplatu());
        System.out.println("----------------------------------------");
    }
}