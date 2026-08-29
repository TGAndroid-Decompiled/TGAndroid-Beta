package u4;
public final class g extends t4.j implements Comparable {
    public long f49088r;

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
            j10 = this.f49088r - gVar.f49088r;
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
