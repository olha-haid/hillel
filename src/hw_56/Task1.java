package hw_56;

class Task1 {
    public static int randomNumberGenerator(int min, int max) {
        double r = Math.random();
        return (int) (r * (max - min)) + min;
    }

    public static void main(String[] args) {
        int maxNum = 0;
        int[][] nums = new int[5][8];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int randomNum = randomNumberGenerator(-99, 99);
                nums[i][j] = randomNum;
                if (randomNum > maxNum) {
                    maxNum = randomNum;
                }
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max number: " + maxNum);
    }
}