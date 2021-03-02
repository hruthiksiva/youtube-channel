import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {
        //advanced for loop
        String[] animals = {"cat","dog","parrot"};

        for(String i : animals){
            System.out.println(i);
        }
        ArrayList<String> ani = new ArrayList<String>();
        ani.add("cat");
        ani.add("rat");
        ani.add("muddy");

        for(String i : ani){
            System.out.println(i);
        }
    }
    
}
