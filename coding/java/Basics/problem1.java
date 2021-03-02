import java.util.ArrayList;

public class problem1 {
    static int sockMerchant(int n, int[] ar) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            array.add(ar[i]);
        }
        System.out.println(array);
        return 0;
    }
    public static void main(String[] args) {
        int n=9;
        int[] ar = new int[n];
        sockMerchant(n, ar);
        
    }
    
}
