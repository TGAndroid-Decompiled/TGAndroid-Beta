package p2;
public abstract class l implements Comparable {
    public final String f43995a;
    public final k f43996b;
    public final long f43997c;
    public final int d;
    public final long e;
    public final b2.s f43998f;
    public final String h;
    public final String f43999n;
    public final long f44000r;
    public final long f44001s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f43995a = str;
        this.f43996b = kVar;
        this.f43997c = j10;
        this.d = i10;
        this.e = j11;
        this.f43998f = sVar;
        this.h = str2;
        this.f43999n = str3;
        this.f44000r = j12;
        this.f44001s = j13;
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
