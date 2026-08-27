package s4;

import r4.k;

public final class g extends k implements Comparable {

    public long f47788r;

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (isEndOfStream() != gVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j10 = this.d - gVar.d;
        if (j10 == 0) {
            j10 = this.f47788r - gVar.f47788r;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
