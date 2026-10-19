package p2;
public abstract class l implements Comparable {
    public final String f43982a;
    public final k f43983b;
    public final long f43984c;
    public final int d;
    public final long e;
    public final b2.s f43985f;
    public final String h;
    public final String f43986n;
    public final long f43987r;
    public final long f43988s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f43982a = str;
        this.f43983b = kVar;
        this.f43984c = j10;
        this.d = i10;
        this.e = j11;
        this.f43985f = sVar;
        this.h = str2;
        this.f43986n = str3;
        this.f43987r = j12;
        this.f43988s = j13;
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
