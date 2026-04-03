import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    String[] sort = {"enthusiasm", "milder","STENCILED","LIBELEES","ReFurbISHMENT","ComMANDEERs","spectroscopy","DiSeMbOdyING","pAnDErING","EXPLORATIONS"};
    RadixSort radixSort = new RadixSort(sort);
    @org.junit.jupiter.api.Test
    void sort() {
        assertEquals(Arrays.toString(new String[]{"ComMANDEERs", "DiSeMbOdyING", "enthusiasm", "EXPLORATIONS", "LIBELEES", "milder", "pAnDErING", "ReFurbISHMENT", "spectroscopy", "STENCILED"}), Arrays.toString(radixSort.sort()));
    }
}