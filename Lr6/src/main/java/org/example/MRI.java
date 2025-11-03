package org.example;

class MRI extends MedicalDevice {
    private double magneticFieldStrength;

    public MRI(String deviceName, String manufacturer, double magneticFieldStrength) {
        super(deviceName, manufacturer);
        this.magneticFieldStrength = magneticFieldStrength;
    }

    @Override
    public void operate() {
        System.out.println("МРТ сканирование запущено");
        System.out.println("Сила магнитного поля: " + magneticFieldStrength + " Тл");
        System.out.println("Создание 3D изображения внутренних органов...");
        System.out.println("Сканирование завершено!");
    }

    public void setMagneticField(double strength) {
        this.magneticFieldStrength = strength;
        System.out.println("Сила магнитного поля изменена на: " + strength + " Тл");
    }
}