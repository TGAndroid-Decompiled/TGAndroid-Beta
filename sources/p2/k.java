package p2;
public abstract class k implements Comparable {
    public final String f42600a;
    public final j f42601b;
    public final long f42602c;
    public final int d;
    public final long e;
    public final b2.t f42603f;
    public final String h;
    public final String f42604n;
    public final long f42605r;
    public final long f42606s;
    public final boolean v;

    public k(String str, j jVar, long j10, int i10, long j11, b2.t tVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f42600a = str;
        this.f42601b = jVar;
        this.f42602c = j10;
        this.d = i10;
        this.e = j11;
        this.f42603f = tVar;
        this.h = str2;
        this.f42604n = str3;
        this.f42605r = j12;
        this.f42606s = j13;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j10 = this.e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
