import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите целое, положительное число");
        int kol = scan.nextInt()+1; //кастыль
        int[] x = new int[kol];

        ranFull(kol,x);
        print(x);
    }
    public static int[] ranFull (int kol, int[]x){
        for (int i = 0; i < kol; i++) {
            x[i] = (int)((Math.random() * (5 + 5 + 1)) -5);
        }
        return x;
    }
    public static void print (int[] x){
        for (int i = 0; i < x.length-1; i++) {
            System.out.printf("%d ",x[i]);
        }
    }
}
