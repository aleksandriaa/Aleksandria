package counter;

public class Counter {
        private static long counter = 0;

    public static long get() {
        return ++counter;
    }
}