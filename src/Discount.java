public class Discount {
    public static void main(String[] args) {
        //Create a new class “Discount”. Express the following rules in code (use logical operators):
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one
        //fiction book.
        //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.
        //Think about what datatypes are appropriate for the variables you need to declare.
        //Write the results to the console

        boolean senior = true;
        boolean dog = true;
        boolean student = true;


        System.out.println("bus discount " + (senior || dog || student));

        int nonFiction = 3;
        int fiction = 1;



        System.out.println("Bookshop discount " + (nonFiction>2 || fiction>=1));

        int alcoDrink = 0;
                int antiAlco = 1;

        System.out.println("Grocery Shop Discount " + (alcoDrink == 0 && antiAlco >= 1));






    }
}
