package template.algorithm.wp._2资料结构._2_3_范围的更新;

import java.util.TreeMap;

public class Intervals {
    TreeMap<Integer, Integer> map = new TreeMap<>();

    Intervals() {
        map.put(Integer.MIN_VALUE, -1);
        map.put(Integer.MAX_VALUE, -1);
    }

    void paint(int s, int t, int c) {
        int p = get(t);
        map.subMap(s, t).clear();
        map.put(s, c);
        map.put(t, p);
    }

    private int get(int k) {
        return map.floorEntry(k).getValue();
    }
}
