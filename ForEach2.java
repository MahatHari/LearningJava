public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 50, 6, 7, 8, 90, 10 };

        // use for to display and sum the values
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
            if (x == 50)
                break; // stop the loop when 5 is obtained
        }
        System.out.println("Summation of first 5 elements: " + sum);

        System.out.println("For-each loop is essentially read-only");
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums
        }
        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
