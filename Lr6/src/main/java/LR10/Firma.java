package LR10;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String nazvanie;
    private List<Otdel> otdely;

    public Firma(String nazvanie) {
        setNazvanie(nazvanie);
        this.otdely = new ArrayList<>();
    }

    public String getNazvanie() { return nazvanie; }
    public void setNazvanie(String nazvanie) {
        if (nazvanie == null || nazvanie.trim().isEmpty()) {
            throw new IllegalArgumentException("Название фирмы не может быть пустым");
        }
        this.nazvanie = nazvanie;
    }

    public void dobavitOtdel(Otdel otdel) {
        if (otdel == null) {
            throw new NullPointerException("Отдел не может быть null");
        }
        otdely.add(otdel);
    }

    public void vivestiStrukturu() {
        System.out.println("Фирма: " + nazvanie);
        System.out.println("========================================");
        for (Otdel otdel : otdely) {
            otdel.vivestiSpisokSotrudnikov();
        }
    }

    public double rasschitatObshuyuZarplatu() {
        double obshayaZarplata = 0;
        for (Otdel otdel : otdely) {
            obshayaZarplata += otdel.rasschitatObshuyuZarplatu();
        }
        return obshayaZarplata;
    }
}