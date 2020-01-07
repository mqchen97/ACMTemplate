package template.algorithm.wp._2资料结构._2_1_BIT;

public class BIT {
    int[] vs;

    public BIT(int n) {
        vs = new int[n + 1];
    }

    void add(int k, int a) {
        for (int i = k + 1; i < vs.length; i += i & -i) {
            vs[i] += a;
        }
    }

    int sum(int s, int t) {
        if (s > 0) return sum(0, t) - sum(0, s);
        int res = 0;
        for (int i = t; i > 0; i -= i & -i) {
            res += vs[i];
        }
        return res;
    }

    int get(int k) {
        int p = Integer.highestOneBit(vs.length - 1);
        for (int q = p; q > 0; q >>= 1, p |= q) {
            if (p >= vs.length || k < vs[p]) p ^= q;
            else k -= vs[p];
        }
        return p;
    }
}
