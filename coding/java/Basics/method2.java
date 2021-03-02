public class method2 {
    static void addition(){
        System.out.println("Hello World");
    }
    static void name(String name){
        System.out.println(name);
    }
    static int age(int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        addition();
        name("Bro");
        System.out.println(age(3, 4));
    }
    
}
