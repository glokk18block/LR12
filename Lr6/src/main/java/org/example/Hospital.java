package org.example;

class Hospital {
    public static void main(String[] args) {

        MRI mri = new MRI("МРТ-2000", "MedTech Corp", 1.5);
        XRayMachine xray = new XRayMachine("X-Ray Pro", "HealthSystems", 120, "Диагностическое");

        System.out.println("=== Демонстрация работы медицинских устройств ===");


        System.out.println("\n--- МРТ аппарат ---");
        mri.displayInfo();
        mri.operate();
        mri.setMagneticField(2.0);


        System.out.println("\n--- Рентген аппарат ---");
        xray.displayInfo();
        xray.operate();
        xray.adjustVoltage(150);

        System.out.println("\nВсе медицинские устройства отработали успешно!");
    }
}