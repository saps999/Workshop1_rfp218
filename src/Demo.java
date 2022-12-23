public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println("Elements present on even position: ");

        for (int i =1; i<arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
