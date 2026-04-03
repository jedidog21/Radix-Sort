import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
    private String[] sorting = null;

    /**
     * @param toSort is the list you want sorted
     */
    public RadixSort(String[] toSort){
        sorting = toSort;
    }

    /**
     * @return a list completely sorted by radix sort
     */
    public String[] sort(){
        HashMap<Character, Queue<String>> hashMap = new HashMap<>();
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int longest = 0;
        for (String s : sorting){
            if (longest < s.length()){
                longest = s.length();
            }
        }

        for (int i = longest-1; i >= 0; i--){
            for (char c : letters){
                hashMap.put(c, new LinkedList<>());
            }

            for (String s : sorting){
                if (s.length() > i){
                    hashMap.get(s.toLowerCase().charAt(i)).add(s);
                }
                else hashMap.get(s.toLowerCase().charAt(0)).add(s);
            }

            int count = 0;
            for (Queue<String> q : hashMap.values()){
                while (!q.isEmpty()){
                    sorting[count] = q.poll();
                    count++;
                }
            }
        }

        return sorting;
    }
}
