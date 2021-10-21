package hw_55;

class Task2
{
    public static void main (String[] args)
    {
        double n = 8.5;
        double m = 11.45;
        int a = 10;

        if (Math.abs(n - a) > Math.abs(m - a)) {
            System.out.printf("%f closer to %d", m, a);
        } else {
            System.out.printf("%f closer to %d", n, a);
        }
    }
}