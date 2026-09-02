import java.util.stream.DoubleStream;

public class Variable {
    public static void main(String[] args) {
        // Opgave 1

     /*
        double[] items = {25.5, 15, 30};
        double sum = DoubleStream.of(items).sum();
        System.out.println(sum);

        double taxPercentage = 1.25;
        double sumWithTax = sum * taxPercentage;

        System.out.println(sumWithTax);
        */

        // Opgave 2
/*
        double foodPrice = 450;
        double drinkPrice = 120;
        double tips = 50;
        int people = 4;

        double totalPrice = foodPrice + drinkPrice + tips;
        double pricePerPerson = totalPrice / people;

        System.out.println(pricePerPerson);

*/


        // Opgave 3
/*

        double originalPrice = 300;
        double discountPercentage = 20;
        System.out.println(originalPrice);

        double priceAfterDiscount = originalPrice * (1 - (discountPercentage / 100));
        System.out.println(priceAfterDiscount);

        double tax = 25;
        double priceWithTax = priceAfterDiscount * (1 + tax / 100);

        System.out.println(priceWithTax);
*/

        // Opgave 4

        int guests = 15;
        int cupcakes = 40;

        int cupcakesPerPerson = cupcakes / guests;
        int leftOverCupcakes = cupcakes % guests;

        System.out.println("Each guest gets " + cupcakesPerPerson + " cupcakes");
        System.out.println(leftOverCupcakes + " cupcakes left over");

        // Opgave 5

        StringBuilder greeting = new StringBuilder();

        String name = "Anna";
        int age = 25;

        greeting.append("Hello, ");
        greeting.append(name);
        greeting.append("! ");
        greeting.append("You are ");
        greeting.append(age);
        greeting.append(" years old.");

        System.out.println(greeting);

        // Opgave 6

        int score = 100;
        System.out.println(score);

        score += 50;
        System.out.println(score);

        score += 25;

        System.out.println(score);

        // Opgave 7

        int health = 100;
        health -= 15;
        System.out.println(health);

        health -= 20;
        System.out.println(health);

        // Opgave 8
        double price = 50;
        System.out.println(price);

        price *= 2;
        System.out.println(price);

        // Opgave 9
        int counter = 10;
        System.out.println(counter);

        counter++;
        System.out.println(counter);

        counter--;
        System.out.println(counter);

        // Opgave 10
        int number = 10;
        number += 5;
        System.out.println(number);

        number -= 3;
        System.out.println(number);

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);

        // Opgave 11
        String itemForSale = "Laptop";
        double itemPrice = 7999.99;
        boolean inStock = true;
        int stockCount = 15;
        double discountPerItem = 10;
        String itemCategory = "Electronics";

        // Opgave 12
        String studentName = "Anna";
        int examScore = 85;
        int assigmentScore = 92;
        double gradeAverageFinal = 88.5;
        boolean hasPassed = true;

        // Opgave 13
        String guestName = "Peter Hansen";
        int guestRoom = 204;
        int nights = 3;
        double pricePerNight = 899.00;
        boolean isBreakfastIncluded = true;
        double totalPrice = 2697.00;

        // Opgave 14
        int stepCount = 8547;
        int stepsWanted = 10000;
        double distanceWalked = 6.2;
        int caloriesBurned = 420;
        boolean goalReached = false;

        // Opgave 15
        String bookTitle;
        String authorName;
        String isbn;
        int pageCount;
        boolean isAvailable;
        String currentUser;
        String returnDate;
        double finePrice;
        boolean isBestseller;
        double rating;


    }
}
