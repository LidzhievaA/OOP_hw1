// Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена. 
// Проинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику продажи напитков.

public class Main{
    public static void main(String[] args) {
        
        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addDrinks(new Drinks("Latte", 0.2, 85, 150))
                .addDrinks(new Drinks("Cappuccino", 0.2, 80, 150))
                .addDrinks(new Drinks("Americano", 0.1, 95, 100));

                System.out.println(apparat);

                Drinks drinks = apparat.findDrinks("Americano");
                System.out.printf("Найдено %s", drinks);
                System.out.println();
        
                System.out.println("\n+++++++++++++++++++++");
                
                Drinks saledDrinks = apparat.saleDrinks("Latte");
                System.out.println(saledDrinks);
                
                Drinks saledDrinks2 = apparat.saleDrinks("Cappuccino");
                System.out.println(saledDrinks2);
                System.out.printf("Остаток - %s",apparat);
    }
}