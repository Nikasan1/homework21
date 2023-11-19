import Helper.Drinks;

public class DrinksMachine {
    private int totalPrice;
    private int totalCount;

    public void menuDrinksMachine() {
        System.out.println("Машина для напоїв, оберіть число або тип напою.");
        Drinks[] drinks = Drinks.values();
        for (Drinks drink :
                drinks) {
            System.out.printf("\t%d. Ціна %s: %d\n", drink.ordinal() + 1, drink, drink.getPrice());
        }
        System.out.println("\t0. Вихід");
    }

    public void orderDrink(String choice) {
        switch (choice) {
            case "1":
            case "COFFEE":
                totalCount++;
                totalPrice += Drinks.COFFEE.getPrice();
                prepareDrink(Drinks.COFFEE);
                Drinks.COFFEE.setCount(Drinks.COFFEE.getCount() + 1);
                break;
            case "2":
            case "TEA":
                totalCount++;
                totalPrice += Drinks.TEA.getPrice();
                prepareDrink(Drinks.TEA);
                Drinks.TEA.setCount(Drinks.TEA.getCount() + 1);
                break;
            case "3":
            case "LEMONADE":
                totalCount++;
                totalPrice += Drinks.LEMONADE.getPrice();
                prepareDrink(Drinks.LEMONADE);
                Drinks.LEMONADE.setCount(Drinks.LEMONADE.getCount() + 1);
                break;
            case "4":
            case "MOJITO":
                totalCount++;
                totalPrice += Drinks.MOJITO.getPrice();
                prepareDrink(Drinks.MOJITO);
                Drinks.MOJITO.setCount(Drinks.MOJITO.getCount() + 1);
                break;
            case "5":
            case "WATER":
                totalCount++;
                totalPrice += Drinks.WATER.getPrice();
                prepareDrink(Drinks.WATER);
                Drinks.WATER.setCount(Drinks.WATER.getCount() + 1);
                break;
            case "6":
            case "COLA":
                totalCount++;
                totalPrice += Drinks.COLA.getPrice();
                prepareDrink(Drinks.COLA);
                Drinks.COLA.setCount(Drinks.COLA.getCount() + 1);
                break;
            default:
                System.out.println("Невідомий напій, виберіть інший.");
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void prepareDrink(Drinks drink) {
        System.out.printf("Виготовлення напою %s. ", drink);
    }
}
