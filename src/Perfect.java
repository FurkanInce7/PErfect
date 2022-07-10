import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        int perfectNumber, total=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please put a number: ");
        perfectNumber = input.nextInt();
         for (int i = 1 ; i <= perfectNumber/2; i++){
             if (perfectNumber % i == 0){
                 total +=i;
             }
         }if (total == perfectNumber){
            System.out.println(total);
            System.out.println("This is a perfect number.");
        }else {
            System.out.println("This is not a perfect number.");
        }

    }
}
