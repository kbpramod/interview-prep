public class KokoBanana {

    public static int hoursToEat(int[] piles, int k) {

        int hours = 0;

        for(int pile : piles) {
            hours += (pile + k - 1) / k;
        }

        return hours;
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;
        int ans = high;

        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int hours = hoursToEat(piles, mid);

            if(hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] piles = {30,11,23,4,20};

        int result = minEatingSpeed(piles, 8);

        System.out.println(result);
    }
}