package p2;
public abstract class l implements Comparable {
    public final String f43984a;
    public final k f43985b;
    public final long f43986c;
    public final int d;
    public final long e;
    public final b2.s f43987f;
    public final String h;
    public final String f43988n;
    public final long f43989r;
    public final long f43990s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f43984a = str;
        this.f43985b = kVar;
        this.f43986c = j10;
        this.d = i10;
        this.e = j11;
        this.f43987f = sVar;
        this.h = str2;
        this.f43988n = str3;
        this.f43989r = j12;
        this.f43990s = j13;
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
