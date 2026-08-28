package s4;
public final class g extends r4.j implements Comparable {
    public long f47424r;

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (isEndOfStream() != gVar.isEndOfStream()) {
            if (isEndOfStream()) {
                return 1;
            }
            return -1;
        }
        long j10 = this.d - gVar.d;
        if (j10 == 0) {
            j10 = this.f47424r - gVar.f47424r;
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
