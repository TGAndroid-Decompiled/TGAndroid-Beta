package p2;
public abstract class l implements Comparable {
    public final String f43992a;
    public final k f43993b;
    public final long f43994c;
    public final int d;
    public final long e;
    public final b2.s f43995f;
    public final String h;
    public final String f43996n;
    public final long f43997r;
    public final long f43998s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f43992a = str;
        this.f43993b = kVar;
        this.f43994c = j10;
        this.d = i10;
        this.e = j11;
        this.f43995f = sVar;
        this.h = str2;
        this.f43996n = str3;
        this.f43997r = j12;
        this.f43998s = j13;
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
