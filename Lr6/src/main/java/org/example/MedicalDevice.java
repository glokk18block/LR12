package org.example;

abstract class MedicalDevice {
    private String deviceName;
    private String manufacturer;

    public MedicalDevice(String deviceName, String manufacturer) {
        this.deviceName = deviceName;
        this.manufacturer = manufacturer;
    }

    public abstract void operate();

    public void displayInfo() {
        System.out.println("Устройство: " + deviceName);
        System.out.println("Производитель: " + manufacturer);
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}