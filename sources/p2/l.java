package p2;
public abstract class l implements Comparable {
    public final String f43996a;
    public final k f43997b;
    public final long f43998c;
    public final int d;
    public final long e;
    public final b2.s f43999f;
    public final String h;
    public final String f44000n;
    public final long f44001r;
    public final long f44002s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f43996a = str;
        this.f43997b = kVar;
        this.f43998c = j10;
        this.d = i10;
        this.e = j11;
        this.f43999f = sVar;
        this.h = str2;
        this.f44000n = str3;
        this.f44001r = j12;
        this.f44002s = j13;
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
