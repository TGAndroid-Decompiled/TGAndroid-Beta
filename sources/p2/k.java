package p2;
public abstract class k implements Comparable {
    public final String f44612a;
    public final j f44613b;
    public final long f44614c;
    public final int d;
    public final long e;
    public final b2.t f44615f;
    public final String h;
    public final String f44616n;
    public final long f44617r;
    public final long f44618s;
    public final boolean f44619w;

    public k(String str, j jVar, long j10, int i10, long j11, b2.t tVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f44612a = str;
        this.f44613b = jVar;
        this.f44614c = j10;
        this.d = i10;
        this.e = j11;
        this.f44615f = tVar;
        this.h = str2;
        this.f44616n = str3;
        this.f44617r = j12;
        this.f44618s = j13;
        this.f44619w = z10;
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
