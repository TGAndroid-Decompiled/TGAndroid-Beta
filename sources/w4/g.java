package w4;

import v4.j;
public final class g extends j implements Comparable {
    public long v;

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (d(4) != gVar.d(4)) {
            if (d(4)) {
                return 1;
            }
            return -1;
        }
        long j10 = this.f14227f - gVar.f14227f;
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
