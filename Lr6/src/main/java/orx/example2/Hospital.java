package orx.example2;


public class Hospital {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №8 ===");
        System.out.println("Медицинские устройства\n");


        MedicalDevice mri = new MRI("МРТ-3000", 1.5);
        MedicalDevice xray = new XRayMachine("X-Ray Pro", 120, "Диагностическое");


        System.out.println("ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА:");
        System.out.println("Один интерфейс - разные реализации:\n");


        System.out.println("1. РАБОТА МРТ АППАРАТА:");
        mri.operate();
        mri.polomka();

        System.out.println("\nМетод charge() из DOPinterface:");
        if (mri instanceof DOPinterface) {

            DOPinterface chargeableMRI = (DOPinterface) mri;
            chargeableMRI.charge();
        }

        System.out.println("\n2. РАБОТА РЕНТГЕНОВСКОГО АППАРАТА:");
        xray.operate();



        System.out.println("\n3. ДЕМОНСТРАЦИЯ ЧЕРЕЗ МАССИВ:");
        MedicalDevice[] devices = {mri, xray};

        for (int i = 0; i < devices.length; i++) {
            System.out.println("\nУстройство " + (i + 1) + ":");
            devices[i].operate();
        }


        System.out.println("\n4. СПЕЦИФИЧНЫЕ МЕТОДЫ КЛАССОВ:");


        if (mri instanceof MRI) {
            MRI mriDevice = (MRI) mri;
            mriDevice.adjustMagneticField(2.0);
        }

        if (xray instanceof XRayMachine) {
            XRayMachine xrayDevice = (XRayMachine) xray;
            xrayDevice.adjustVoltage(150);
        }

        System.out.println("\n=== Все медицинские устройства отработали успешно! ===");
    }
}