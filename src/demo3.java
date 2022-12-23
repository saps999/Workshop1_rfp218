public class demo3 {
    public static void main(String[] args) {
        int num[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int smallest = num[0];
        int largest = num[0];

        for (int i = 1; i < num.length; i++) {

            if (num[i] > largest) {
                largest = num[i];
            }
            else if (num[i] < smallest) {
                smallest = num[i];
            }
        }

        System.out.println("Largest Number is: " + largest);
        System.out.println("Smallest Number is: " + smallest);
    }
}
