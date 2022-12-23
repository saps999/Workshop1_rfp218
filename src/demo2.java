import java.util.Arrays;
import java.util.Random;

public class demo2 {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Random numbers= " + Arrays.toString(array));

        sortArray(array, 20);

    }

    static void sortArray(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of the array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int evenSize = 0;
        int oddSize = 0;

        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                evenSize++;
            }else oddSize++;
        }

        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        int j=0,k=0;
        for (int i =0;i<n;i++){
            if (arr[i]%2==0){
                even[j++]=arr[i];
            }else odd[k++]=arr[i];
        }
        System.out.println();
        System.out.println("Even array contains: ");
        printArray(even);

        System.out.println("Odd array contains: ");
        printArray(odd);
    }
}
