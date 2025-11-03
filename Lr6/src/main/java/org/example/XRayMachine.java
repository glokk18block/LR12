package org.example;

class XRayMachine extends MedicalDevice {
    private int voltage;
    private String radiationType;

    public XRayMachine(String deviceName, String manufacturer, int voltage, String radiationType) {
        super(deviceName, manufacturer);
        this.voltage = voltage;
        this.radiationType = radiationType;
    }

    @Override
    public void operate() {
        System.out.println("Рентген аппарат включен");
        System.out.println("Напряжение: " + voltage + " кВ");
        System.out.println("Тип излучения: " + radiationType);
        System.out.println("Выполняется рентгеновский снимок...");
        System.out.println("Снимок готов!");
    }

    public void adjustVoltage(int newVoltage) {
        this.voltage = newVoltage;
        System.out.println("Напряжение установлено на: " + newVoltage + " кВ");
    }
}