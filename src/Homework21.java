import Helper.Drinks;

import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        DrinksMachine drinks = new DrinksMachine();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            drinks.menuDrinksMachine();
            String choice = scanner.nextLine().trim().toUpperCase();
            if (choice.equals("EXIT") || choice.equals("0"))
                break;
            drinks.orderDrink(choice);
        }
        Drinks[] drinks1 = Drinks.values();
        for (Drinks drink :
                drinks1) {
            if (drink.getCount() > 0) {
                System.out.printf("Напій %s був замовленний %d \n", drink.name(), drink.getCount());
            }

        }
        System.out.println("Загальна кількість замовлених напоїв: " + drinks.getTotalCount() +
                ", ціна загалом: " + drinks.getTotalPrice() + "грн.");
    }
}
