import java.util.concurrent.ForkJoinPool;

public class App {
    public static void main(String[] args) throws Exception {
        final int[] data = new int[10000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        final ForkJoinPool pool = new ForkJoinPool(4);
        final MaximumFinder finder = new MaximumFinder(data);
        System.out.println(pool.invoke(finder));
    }
}
