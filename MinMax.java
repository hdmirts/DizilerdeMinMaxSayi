import java.util.Arrays;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, 4, 7};
        //min = list[0] max = list[0], min<list[i] ? min = list[i], max > list[i] : 
        int min = list[0];
        int max = list[0];

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int n = input.nextInt();

        Arrays.sort(list);
        for(int i : list) {
            if(i<n){
                min = i;
            }
            if(i>n){
                max = i;
                break;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        
        
    }
    
}
