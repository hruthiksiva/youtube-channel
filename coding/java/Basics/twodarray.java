import java.util.ArrayList;

public class twodarray {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("pasta");
        bakery.add("garlic bread");
        bakery.add("pepper roast");

        ArrayList<String> cakeshop = new ArrayList<String>();
        cakeshop.add("caramel");
        cakeshop.add("balck forest");
        cakeshop.add("red velvet");
        
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("mountain dew");
        drinks.add("pepsi");
        drinks.add("coca cola");

        System.out.println(drinks.get(0));

        grocery.add(bakery);
        grocery.add(drinks);
        grocery.add(cakeshop);

        System.out.println(grocery);

        System.out.println(grocery.get(0).get(0));


    }
    
}
