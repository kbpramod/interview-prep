import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicStack {
    public static int[] monotonic(int[] temps){
        int[] result = new int[temps.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<temps.length; i++){
            while(!stack.isEmpty() && temps[i]> temps[stack.peek()]){
                int j = stack.pop();
                result[j] = i-j;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args){
        int[] temps = new int[]{76, 85, 15, 48, 59, 25};

        int[] res = monotonic(temps);

        System.out.println(Arrays.toString(res));  

    }
}