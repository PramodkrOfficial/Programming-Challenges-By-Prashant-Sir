class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr = ArrayUtility.inputArray();
        reversal(numArr);
        System.out.println("Your reversed Array is");
        ArrayUtility.displayArray(numArr);

    }

    public static void reversal(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
