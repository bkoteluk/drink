public class DrinkMenu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        Drink drink2 = new Drink();

        drink1.prize = 12.5;
        drink1.isAlcohol = true;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.name = "Alcohol";
        drink1.ingredient1.quantity = 100;

        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.name = "Orange Juice";
        drink1.ingredient2.quantity = 150;

        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.name = "Ice";
        drink1.ingredient3.quantity = 50;

        drink2.prize = 15.5;
        drink2.isAlcohol = false;
        drink2.ingredient1 = new Ingredient();
        drink2.ingredient1.name = "Sparkling water";
        drink2.ingredient1.quantity = 200;

        drink2.ingredient2 = new Ingredient();
        drink2.ingredient2.name = "Red Bull";
        drink2.ingredient2.quantity = 150;

        drink2.ingredient3 = new Ingredient();
        drink2.ingredient3.name = "Ice";
        drink2.ingredient3.quantity = 50;

    }
}
