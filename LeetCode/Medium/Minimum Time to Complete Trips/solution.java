class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // long t= 1;

        // while (true) {
        //     long actualTrips = 0;

        //     for(int busTime : time) {
        //         actualTrips += t / busTime;
        //     }
        //     if(actualTrips >= totalTrips) {
        //         return t;
        //     }
        //     t++;
        // }

        long min = time[0];
        for(int t : time) {
            if(t < min) min = t;
        }
        long l =1;
        long h = min * totalTrips;

        while (l < h) {
            long mid = l + ( h - l) / 2;
            long trips = 0;

            for( int t : time) {
                trips += mid /  t;
            }

            if(trips >= totalTrips) {
                h = mid;
            } else  {
                l = mid + 1;
            }
        }
        return l;
    }
}