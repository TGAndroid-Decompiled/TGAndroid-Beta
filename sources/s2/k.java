package s2;
public abstract class k implements Comparable {
    public final String f56855a;
    public final j f56856b;
    public final long f56857c;
    public final int d;
    public final long f56858e;
    public final e2.r f56859f;
    public final String h;
    public final String f56860n;
    public final long f56861r;
    public final long f56862s;
    public final boolean f56863w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f56855a = str;
        this.f56856b = jVar;
        this.f56857c = j3;
        this.d = i7;
        this.f56858e = j10;
        this.f56859f = rVar;
        this.h = str2;
        this.f56860n = str3;
        this.f56861r = j11;
        this.f56862s = j12;
        this.f56863w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f56858e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
