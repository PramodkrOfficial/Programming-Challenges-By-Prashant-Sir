class DiagonalSum2DArarr {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum\n");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("Sum of Diagonals are: " + sum);

    }
    public static long sumOfDiagonals(int[][] numArr) {
        long leftsum = sumOfLeftDiagonal(numArr);
        long rightsum = sumOfRightDiagonal(numArr);
        long sum = leftsum + rightsum;
        if (numArr.length % 2 != 0) {
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }
}
