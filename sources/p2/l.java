package p2;
public abstract class l implements Comparable {
    public final String f44410a;
    public final k f44411b;
    public final long f44412c;
    public final int d;
    public final long e;
    public final b2.s f44413f;
    public final String h;
    public final String f44414n;
    public final long f44415r;
    public final long f44416s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f44410a = str;
        this.f44411b = kVar;
        this.f44412c = j10;
        this.d = i10;
        this.e = j11;
        this.f44413f = sVar;
        this.h = str2;
        this.f44414n = str3;
        this.f44415r = j12;
        this.f44416s = j13;
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
