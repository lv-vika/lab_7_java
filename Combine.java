package combine;

public class Combine {
    private int volume_hopper;
    private int fuel_consumption;
    private int engine_power;

    private String brand;
    private int size_of_harvester;
    private int speed_of_one_hectare;
    private boolean comfort_for_driver;
    private String color;

    private static int combine_count = 200;

    protected String country;
    protected int year_of_production;


    public Combine (){}

    public Combine (String brand, int size_of_harvester, int speed_of_one_hectare, boolean comfort_for_driver){
        this.brand = brand;
        this.size_of_harvester = size_of_harvester;
        this.speed_of_one_hectare = speed_of_one_hectare;
        this.comfort_for_driver = comfort_for_driver;
    }

    public Combine (int volume_hopper,int fuel_consumption, int engine_power, String brand, int size_of_harvester,
                    int speed_of_one_hectare, boolean comfort_for_driver, String color, String country, int year_of_production ){
        this (brand, size_of_harvester, speed_of_one_hectare, comfort_for_driver);
        this.volume_hopper = volume_hopper;
        this.fuel_consumption = fuel_consumption;
        this. engine_power = engine_power;
        this.color = color;
        this.country = country;
        this.year_of_production = year_of_production;
    }

    @Override
    public String toString() {
        return "Combine changed:\n"
                + "volume_hopper: " + volume_hopper
                + ", \nfuel_consumption: " + fuel_consumption
                + ", \nengine_power: " + engine_power
                + ", \nbrand: " + brand
                + ", \nsize_of_harvester: " + size_of_harvester
                + ", \nspeed_of_one_hectare: " + speed_of_one_hectare
                + ", \ncomfort_for_driver: " + comfort_for_driver
                + ", \ncolor: " + color
                + ", \ncountry: " + country
                + ", \nyear_of_production: " + year_of_production + "\n";
    }


    public static void printStaticCombineCount() {
        System.out.println("StaticCombineCount " + combine_count);
    }

    public void printCombineCount(){
        System.out.println("CombineCount " + combine_count);
    }

    public void resetValues (int volume_hopper,int fuel_consumption, int engine_power, String brand, int size_of_harvester,
                    int speed_of_one_hectare, boolean comfort_for_driver, String color, String country, int year_of_production ){
        this.volume_hopper = volume_hopper;
        this.fuel_consumption = fuel_consumption;
        this. engine_power = engine_power;
        this.brand = brand;
        this.size_of_harvester = size_of_harvester;
        this.speed_of_one_hectare = speed_of_one_hectare;
        this.comfort_for_driver = comfort_for_driver;
        this.color = color;
        this.country = country;
        this.year_of_production = year_of_production;
    }

    public int getVolume_hopper() {
        return volume_hopper;
    }

    public void setVolume_hopper(int volume_hopper) {
        this.volume_hopper = volume_hopper;
    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public int getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(int engine_power) {
        this.engine_power = engine_power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize_of_harvester() {
        return size_of_harvester;
    }

    public void setSize_of_harvester(int size_of_harvester) {
        this.size_of_harvester = size_of_harvester;
    }

    public int getSpeed_of_one_hectare() {
        return speed_of_one_hectare;
    }

    public void setSpeed_of_one_hectare(int speed_of_one_hectare) {
        this.speed_of_one_hectare = speed_of_one_hectare;
    }

    public boolean isComfort_for_driver() {
        return comfort_for_driver;
    }

    public void setComfort_for_driver(boolean comfort_for_driver) {
        this.comfort_for_driver = comfort_for_driver;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCombine_count() {
        return combine_count;
    }

    public static void setCombine_count(int combine_count) {
        Combine.combine_count = combine_count;
    }

}
