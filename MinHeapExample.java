import java.util.List;
import java.util.PriorityQueue;

public class MinHeapExample {
    public static int minPower(List<Integer> cells){
        int total = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(cells);
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            total += sum;
            pq.add(sum);
        }
        return total;
    }

    public static void main(String... args){
        int x = minPower(List.of(20,30,40));
        System.out.println(x);
    }
}
