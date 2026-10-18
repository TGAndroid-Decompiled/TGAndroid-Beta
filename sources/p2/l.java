package p2;
public abstract class l implements Comparable {
    public final String f44030a;
    public final k f44031b;
    public final long f44032c;
    public final int d;
    public final long e;
    public final b2.s f44033f;
    public final String h;
    public final String f44034n;
    public final long f44035r;
    public final long f44036s;
    public final boolean v;

    public l(String str, k kVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f44030a = str;
        this.f44031b = kVar;
        this.f44032c = j10;
        this.d = i10;
        this.e = j11;
        this.f44033f = sVar;
        this.h = str2;
        this.f44034n = str3;
        this.f44035r = j12;
        this.f44036s = j13;
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
