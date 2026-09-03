package w4;

import v4.j;
public final class g extends j implements Comparable {
    public long v;

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (e(4) != gVar.e(4)) {
            if (e(4)) {
                return 1;
            }
            return -1;
        }
        long j10 = this.f15218f - gVar.f15218f;
        if (j10 == 0) {
            j10 = this.v - gVar.v;
            if (j10 == 0) {
                return 0;
            }
        }
        if (j10 > 0) {
            return 1;
        }
        return -1;
    }
}
