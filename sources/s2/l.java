package s2;
public abstract class l implements Comparable {
    public final String f56940a;
    public final k f56941b;
    public final long f56942c;
    public final int d;
    public final long f56943e;
    public final e2.r f56944f;
    public final String h;
    public final String f56945n;
    public final long f56946r;
    public final long f56947s;
    public final boolean f56948w;

    public l(String str, k kVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f56940a = str;
        this.f56941b = kVar;
        this.f56942c = j3;
        this.d = i7;
        this.f56943e = j10;
        this.f56944f = rVar;
        this.h = str2;
        this.f56945n = str3;
        this.f56946r = j11;
        this.f56947s = j12;
        this.f56948w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f56943e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
