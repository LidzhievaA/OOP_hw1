

public class Drinks {
    private String drinkName;
    private double drinkValue;
    private double drinkTemperature;
    private double drinkPrice;

    public Drinks(String drinkName, double drinkValue, double drinkTemperature, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkValue = drinkValue;
        this.drinkTemperature = drinkTemperature;
        this.drinkPrice = drinkPrice;   
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Объем: %s, Температура напитка:%s, Цена: %f", drinkName, drinkValue, drinkTemperature, drinkPrice);
    }

    public String getDrinksName() {
        return drinkName;
    }

    public double getDrinksValue() {
        return drinkValue;
    }

    public double getDrinksTemperature() {
        return drinkTemperature;
    }
    public double getDrinksPrice() {
        return drinkPrice;
    }
}
