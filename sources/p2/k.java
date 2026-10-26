package p2;
public abstract class k implements Comparable {
    public final String f46553a;
    public final j f46554b;
    public final long f46555c;
    public final int d;
    public final long e;
    public final b2.t f46556f;
    public final String h;
    public final String f46557n;
    public final long f46558r;
    public final long f46559s;
    public final boolean v;

    public k(String str, j jVar, long j10, int i10, long j11, b2.t tVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f46553a = str;
        this.f46554b = jVar;
        this.f46555c = j10;
        this.d = i10;
        this.e = j11;
        this.f46556f = tVar;
        this.h = str2;
        this.f46557n = str3;
        this.f46558r = j12;
        this.f46559s = j13;
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
