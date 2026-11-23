package s2;
public abstract class k implements Comparable {
    public final String f56859a;
    public final j f56860b;
    public final long f56861c;
    public final int d;
    public final long f56862e;
    public final e2.r f56863f;
    public final String h;
    public final String f56864n;
    public final long f56865r;
    public final long f56866s;
    public final boolean f56867w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f56859a = str;
        this.f56860b = jVar;
        this.f56861c = j3;
        this.d = i7;
        this.f56862e = j10;
        this.f56863f = rVar;
        this.h = str2;
        this.f56864n = str3;
        this.f56865r = j11;
        this.f56866s = j12;
        this.f56867w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f56862e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
