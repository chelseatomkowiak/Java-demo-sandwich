import java.util.Scanner;
public class TestSandwich
{

    public static void main(String[] args)
        {
        
        Sandwich firstSandwich = new Sandwich();
        firstSandwich = getData(firstSandwich);
        
        System.out.println("First Sandwich:");
        System.out.println("The main ingredient is " +
        firstSandwich.getMainIngredient() + " with a bread type of " +
        firstSandwich.getBreadType() + " and costs $" +
        firstSandwich.getPrice() + ".");
        
        }
        
    public static Sandwich getData(Sandwich s)
        {
        
        String mainIngredient;
        String breadType;
        double price;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter main ingredient >>");
        mainIngredient = keyboard.nextLine();
        System.out.print("Enter bread type >>");
        breadType = keyboard.nextLine();
        System.out.print("Enter the price >>");
        price = keyboard.nextDouble();
        
        s.setMainIngredient(mainIngredient);
        s.setBreadType(breadType);
        s.setPrice(price);
        return s;
        
        }

}