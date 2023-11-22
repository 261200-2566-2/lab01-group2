// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    static void bubblesort(int arr[], int n)
    {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
    static int[] getInput(int n)
    {
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            Scanner d = new Scanner(System.in);
            System.out.print("Enter input "+ (i+1) +" : ");
            String x = d.nextLine();
            int input = Integer.parseInt(x);
            arr[i] = input;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n : ");
        String n = s.nextLine();
        int number = Integer.parseInt(n);

        int[] arr = getInput(number);

        bubblesort(arr,number);

        System.out.print("result : ");
        for (int i = 0; i < number; i++) {

            System.out.print(arr[i]+" ");
        }
    }
}