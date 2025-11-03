package orx.example2;

public class XRayMachine implements MedicalDevice {
    private String model;
    private int voltage;
    private String radiationType;


    public XRayMachine(String model, int voltage, String radiationType) {
        this.model = model;
        this.voltage = voltage;
        this.radiationType = radiationType;
    }


    @Override
    public void operate() {
        System.out.println("=== Рентгеновский аппарат " + model + " ===");
        System.out.println("Установка напряжения: " + voltage + " кВ");
        System.out.println("Тип излучения: " + radiationType);
        System.out.println("Выполнение рентгеновского снимка...");
        System.out.println("Обработка изображения...");
        System.out.println("Рентгеновский снимок готов!");
    }


    public void adjustVoltage(int newVoltage) {
        this.voltage = newVoltage;
        System.out.println("Напряжение установлено на: " + newVoltage + " кВ");
    }


    public String getModel() {
        return model;
    }

    public int getVoltage() {
        return voltage;
    }

    public String getRadiationType() {
        return radiationType;
    }
}