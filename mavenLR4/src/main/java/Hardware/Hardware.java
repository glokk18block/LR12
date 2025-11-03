package Hardware;


 class Hardware {
    public String name;
    public double price;
    public int warrantyMonths;

    public Hardware() {}


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) { this.warrantyMonths = warrantyMonths; }
}


class Processor extends Hardware {
    public double frequency;

    public Processor() {}

    public double getFrequency() { return frequency; }
    public void setFrequency(double frequency) { this.frequency = frequency; }
}


class RAM extends Hardware {
    public int capacity;

    public RAM() {}

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}


class HardDrive extends Hardware {
    public String type;

    public HardDrive() {}

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}


class VideoCard extends Hardware {
    public int memory;

    public VideoCard() {}

    public int getMemory() { return memory; }
    public void setMemory(int memory) { this.memory = memory; }
}


 class HardwareTest {
    public static void main(String[] args) {

        Processor cpu = new Processor();
        cpu.setName("Intel Core i7");
        cpu.setPrice(360);
        cpu.setWarrantyMonths(36);
        cpu.setFrequency(3.8);


        RAM memory = new RAM();
        memory.setName("DDR4 16GB");
        memory.setPrice(210);
        memory.setWarrantyMonths(24);
        memory.setCapacity(16);


        HardDrive hdd = new HardDrive();
        hdd.setName("Seagate Barracuda");
        hdd.setPrice(150);
        hdd.setWarrantyMonths(12);
        hdd.setType("HDD");


        VideoCard gpu = new VideoCard();
        gpu.setName("NVIDIA RTX 3060");
        gpu.setPrice(930);
        gpu.setWarrantyMonths(24);
        gpu.setMemory(12);


        System.out.println("=== ПРОЦЕССОР ===");
        System.out.println("Название: " + cpu.getName());
        System.out.println("Цена: " + cpu.getPrice() + " BYN.");
        System.out.println("Гарантия: " + cpu.getWarrantyMonths() + " месяцев");
        System.out.println("Частота: " + cpu.getFrequency() + " GHz");

        System.out.println("\n=== ОПЕРАТИВНАЯ ПАМЯТЬ ===");
        System.out.println("Название: " + memory.getName());
        System.out.println("Цена: " + memory.getPrice() + " BYN.");
        System.out.println("Гарантия: " + memory.getWarrantyMonths() + " месяцев");
        System.out.println("Объем: " + memory.getCapacity() + " GB");

        System.out.println("\n=== ЖЕСТКИЙ ДИСК ===");
        System.out.println("Название: " + hdd.getName());
        System.out.println("Цена: " + hdd.getPrice() + " BYN.");
        System.out.println("Гарантия: " + hdd.getWarrantyMonths() + " месяцев");
        System.out.println("Тип: " + hdd.getType());

        System.out.println("\n=== ВИДЕОКАРТА ===");
        System.out.println("Название: " + gpu.getName());
        System.out.println("Цена: " + gpu.getPrice() + " BYN.");
        System.out.println("Гарантия: " + gpu.getWarrantyMonths() + " месяцев");
        System.out.println("Память: " + gpu.getMemory() + " GB");
    }
}