package p2;
public abstract class k implements Comparable {
    public final String f42900a;
    public final j f42901b;
    public final long f42902c;
    public final int d;
    public final long e;
    public final b2.t f42903f;
    public final String h;
    public final String f42904n;
    public final long f42905r;
    public final long f42906s;
    public final boolean v;

    public k(String str, j jVar, long j10, int i10, long j11, b2.t tVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f42900a = str;
        this.f42901b = jVar;
        this.f42902c = j10;
        this.d = i10;
        this.e = j11;
        this.f42903f = tVar;
        this.h = str2;
        this.f42904n = str3;
        this.f42905r = j12;
        this.f42906s = j13;
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
