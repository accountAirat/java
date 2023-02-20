package Homework.hw6;

public class Laptop {
    Integer id;
    String brand;
    String model;
    Integer ram;
    Integer memory;
    Boolean ssd;
    Integer price;

    public Laptop(String idValue, String brandValue, String modelValue, String ramValue, String memoryValue,
            String ssdValue, String priceValue) {
        id = Integer.parseInt(idValue);
        brand = brandValue;
        model = modelValue;
        ram = Integer.parseInt(ramValue);
        memory = Integer.parseInt(memoryValue);
        ssd = "1".equals(ssdValue);
        price = Integer.parseInt(priceValue);
    }

    @Override
    public String toString() {
        return String.format("\nid:%s brand:%s model:%s ram:%s memory:%s ssd:%s price:%s",
                id, brand, model, ram, memory, ssd, price);
    }

}
