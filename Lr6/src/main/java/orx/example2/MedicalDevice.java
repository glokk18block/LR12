package orx.example2;


public interface MedicalDevice {

    void operate();

    default void polomka() {
        System.out.println("!!! ЭКСТРЕННАЯ ОСТАНОВКА МЕДИЦИНСКОГО УСТРОЙСТВА !!!");
    }


}