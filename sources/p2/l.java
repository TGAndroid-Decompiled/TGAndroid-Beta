package p2;
public abstract class l implements Comparable {
    public final String f44010a;
    public final k f44011b;
    public final long f44012c;
    public final int d;
    public final long e;
    public final b2.s f44013f;
    public final String h;
    public final String f44014n;
    public final long f44015r;
    public final long f44016s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f44010a = str;
        this.f44011b = kVar;
        this.f44012c = j10;
        this.d = i10;
        this.e = j11;
        this.f44013f = sVar;
        this.h = str2;
        this.f44014n = str3;
        this.f44015r = j12;
        this.f44016s = j13;
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
