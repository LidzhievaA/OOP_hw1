import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Drinks> vending = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addDrinks(Drinks drinks) {
        vending.add(drinks);
        return this;
    }

    public List<Drinks> getVending() {
        return vending;
    }

    public Drinks findDrinks(String name) {
        for (Drinks drinks : vending) {
            if (name.equals(drinks.getDrinksName())) {
                return drinks;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Drinks saleDrinks(String nameProd) {
        Drinks founded = findDrinks(nameProd);
        if (founded != null) {
            cash = cash + founded.getDrinksPrice();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Drinks drinks : vending) {
            builder.append(drinks).append("\n");
        }
        return builder.toString();
    }
}
