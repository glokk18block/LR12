package orx.example2;


public class MRI implements MedicalDevice, DOPinterface {
    private String model;
    private double magneticFieldStrength;


    public MRI(String model, double magneticFieldStrength) {
        this.model = model;
        this.magneticFieldStrength = magneticFieldStrength;
    }

    @Override
    public void operate() {
        System.out.println("=== МРТ аппарат " + model + " ===");
        System.out.println("Запуск магнитного поля: " + magneticFieldStrength + " Тл");
        System.out.println("Сканирование пациента...");
        System.out.println("Создание 3D изображения тканей и органов");
        System.out.println("Сканирование завершено успешно!");
    }


    public void adjustMagneticField(double newStrength) {
        this.magneticFieldStrength = newStrength;
        System.out.println("Сила магнитного поля изменена на: " + newStrength + " Тл");
    }


    public String getModel() {
        return model;
    }

    public double getMagneticFieldStrength() {
        return magneticFieldStrength;
    }
}