package p2;
public abstract class k implements Comparable {
    public final String f44601a;
    public final j f44602b;
    public final long f44603c;
    public final int d;
    public final long e;
    public final b2.t f44604f;
    public final String h;
    public final String f44605n;
    public final long f44606r;
    public final long f44607s;
    public final boolean f44608w;

    public k(String str, j jVar, long j10, int i10, long j11, b2.t tVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f44601a = str;
        this.f44602b = jVar;
        this.f44603c = j10;
        this.d = i10;
        this.e = j11;
        this.f44604f = tVar;
        this.h = str2;
        this.f44605n = str3;
        this.f44606r = j12;
        this.f44607s = j13;
        this.f44608w = z10;
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
