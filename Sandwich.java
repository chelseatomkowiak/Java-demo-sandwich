public class Sandwich
{
    
    private String mainIngredient;
    private String breadType;
    private double price;
    
    public Sandwich()
        {
        mainIngredient = "XXX";
        breadType = "XXX";
        price = 0;
        }
    
    public void setMainIngredient(String ingredient)
        {
        mainIngredient = ingredient;
        }
    
    public void setBreadType(String bread)
        {
        breadType = bread;
        }
        
    public void setPrice(double amt)
        {
        price = amt;
        }
        
    public String getMainIngredient()
        {
        return mainIngredient;
        }
        
    public String getBreadType()
        {
        return breadType;
        }
    
    public double getPrice()
        {
        return price;
        }
    
}