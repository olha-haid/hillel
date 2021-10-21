package hw_55;

class Task3 {
    public static void main(String[] args) {
        int count = (int) Math.round(Math.random() * 1000);

        System.out.println("A three-digit natural number is " + count);

        int max = 0;
        while (count > 0) {
            int reminder = count%10;
            if (reminder>max) {
                max = reminder;
            }
            count = count/10;
        }
        System.out.println("The largest digit is " +max);
    }
}