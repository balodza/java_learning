package bob.st.example;

public class AllArrayElementsSumCalculator {
    public int calculate(int [] input) {
        int sum = 0;

        for (int i : input) {
            sum += i;
        }

        return sum;
    }
}
