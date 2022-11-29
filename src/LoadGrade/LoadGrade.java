package LoadGrade;

public class LoadGrade {

    public static void main(String[] args) { // 2, 0, 1, 1, 0, 0, 2 \3, 0, 1, 2, 5, 0, 2
        System.out.println(LoadGrade.calculateLoad(new int[] {2, 0, 1, 1, 0, 0, 2}));
    }

    /*
    * e.g for [3, 0, 1, 2, 5, 0, 2]
    * 1.
    *            []
    *            []
    *    []      []
    *    []    [][]  []
    *    []  [][][]  []
    * 2.
    *            []
    *            []
    *    []/\    []
    *    []/\  [][]  []
    *    []/\[][][]  []
    * 3.
    *            []
    *            []
    *    []      []
    *    []    [][]  []
    *    []/\[][][]  []
    * 4.
    *            []
    *            []
    *    []      []
    *    []/\/\[][]  []
    *    []/\[][][]  []
    * 5.
    *            []
    *            []
    *    []/\/\/\[]
    *    []/\/\[][]  []
    *    []/\[][][]  []
    * 6.
    *            []/\
    *            []/\
    *    []/\/\/\[]/\
    *    []/\/\[][]/\[]
    *    []/\[][][]/\[]
    * 7.
    *            []
    *            []
    *    []/\/\/\[]
    *    []/\/\[][]/\[]
    *    []/\[][][]/\[]
    *
    * Answer = 8
    *
    */
    public static int calculateLoad(final int[] levels) {
        int result = 0;

        if(levels.length < 3
            || (levels.length == 3 && levels[1] > levels[0])) {
            return result;
        }

        // init values
        int maxEdge = levels[0];
        int segmentEdge = levels[0];
        int lastCheckedLevel = levels[0];

        for(int levelIndex = 0, segmentCounter = 0; levelIndex < levels.length - 1; levelIndex++) {

            int checkedLevel = levels[levelIndex + 1];

            /*
            * If our checkedLevel more when our levels maxEdge -> means we are now in the new bucket(segment)
            *
            * 1. Flush our segment temporary result to result sum
            * 2. Reassign new edges to checked level value -> means this is our new
            * segment edge and max edge of all levels
            * 3. Zero segment result and segment counter
            * 4. Reassign last checked value to current for further calculation
            * 5. Skip else operations due to unavailability to fill bucket
            *
            */
            if(checkedLevel >= maxEdge) {
                result += (maxEdge - segmentEdge) * segmentCounter;

                maxEdge = checkedLevel;
                segmentEdge = checkedLevel;
                segmentCounter = 0;

                lastCheckedLevel = checkedLevel;
                continue;
            }

            /*
            * If our checked value more then last checked value but less then segment edge means ->
            * we have growing up progression with bigger last edge and we should cut last filled level to new segment level
            * If our checked value is more then last checked value and more then segment edge means ->
            * we have growing up progression but with lesser edge and we must fill up to our new segment edge
            * Else if we have only checked value more or equal to segment edge means -> this is new segment and we need
            * fill it to new segment level according to this segment edge
            *
            */
            if(checkedLevel > lastCheckedLevel && checkedLevel < segmentEdge) {
                result -= (segmentEdge - checkedLevel) * segmentCounter;
                segmentEdge = checkedLevel;
            } else if(checkedLevel > lastCheckedLevel && checkedLevel > segmentEdge) {
                result += (checkedLevel - segmentEdge) * segmentCounter;
                segmentEdge = checkedLevel;
            } else if(checkedLevel <= segmentEdge && levelIndex+1 != levels.length-1) {
                result += (segmentEdge - checkedLevel);
            }
            // increase segment counter(num of operations for this segment) for multiplying in further calculation
            segmentCounter++;
            lastCheckedLevel = checkedLevel;
        }

        return result;
    }
}
