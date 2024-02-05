// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("How Many Days ?");
        int numdays = obj.nextInt();
        int[] temp = new int[numdays];
        int sum =0;
        for(int i=0;i<numdays;i++){
            System.out.println("Days"+(i+1)+"high temp");
            temp[i] = obj.nextInt();
            sum+=temp[i];
        }
        double avg = sum/numdays;
        int above =0;
        for(int i=0;i<temp[i];i++){
            if(temp[i]>avg){
                System.out.println("Average temp" + avg);
            }
        }
        System.out.println();
        System.out.println("Average Temp" + avg);
        System.out.println(above+"days above avg");
    }
}