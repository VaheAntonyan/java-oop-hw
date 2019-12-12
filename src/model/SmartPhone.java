package model;

import java.text.DecimalFormat;

public class SmartPhone {
    private String brand;
    private String model;
    private String color;
    private float displaySize;
    private int ram;
    private int rom;
    private int batteryCapacity;
    private int weight;
    private int cameraResolution;
    private int price;

    public SmartPhone(String brand, String model, String color, float displaySize, int ram, int rom, int batteryCapacity, int weight, int cameraResolution, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.displaySize = displaySize;
        this.ram = ram;
        this.rom = rom;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.cameraResolution = cameraResolution;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public int getPrice() {
        return price;
    }


    public void printFullName() {
        System.out.printf("Full name - %s %s\n", this.getBrand(), this.getModel());
    }

    public void printRam() {
        System.out.printf("Ram - %d GB\n", this.getRam());
    }

    public void printRom() {
        System.out.printf("Rom - %d GB\n", this.getRom());
    }

    public void printColor() {
        System.out.printf("Color - %s\n", this.getColor());
    }

    public void printDisplaySize() {
        System.out.printf("Display size - %s\"\n", Float.toString(this.getDisplaySize()).replaceAll("\\.?0*$", ""));
    }

    public void printBatteryCapacity() {
        System.out.printf("Battery capacity - %d mAh\n", this.getBatteryCapacity());
    }

    public void printWeight() {
        System.out.printf("Weight - %d g\n", this.getWeight());
    }

    public void printCameraResolution() {
        System.out.printf("Camera resolution - %d MP\n", this.getCameraResolution());
    }

    public void printPrice() {
        System.out.printf("Price - About %s EUR", this.getPrice());
    }

    public void printCharacteristics() {
        this.printFullName();
        this.printRam();
        this.printRom();
        this.printColor();
        this.printDisplaySize();
        this.printBatteryCapacity();
        this.printWeight();
        this.printCameraResolution();
        this.printPrice();
        System.out.println("\n------------------------------------------------");
    }
}
