public class overloadmethod {
    public static void main(String[] args) {
        add();
        int a =0;
        int b=1;
        int c =3;
        System.out.println(add(a, b, c));
    }
    static void add(){
        System.out.println("Empty");
    }
    static int add(int a){
        return a;
    }
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b,int c){
        return a+b+c;
    }
}
