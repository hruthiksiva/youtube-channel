import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("hruthik");
        food.add("cricket");
        System.out.println(food);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        food.set(0,"football");
        food.remove(1);
        //System.out.println(food);
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        food.clear();
}
    
}
