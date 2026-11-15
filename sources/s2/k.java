package s2;
public abstract class k implements Comparable {
    public final String f56240a;
    public final j f56241b;
    public final long f56242c;
    public final int d;
    public final long f56243e;
    public final e2.r f56244f;
    public final String h;
    public final String f56245n;
    public final long f56246r;
    public final long f56247s;
    public final boolean f56248w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f56240a = str;
        this.f56241b = jVar;
        this.f56242c = j3;
        this.d = i7;
        this.f56243e = j10;
        this.f56244f = rVar;
        this.h = str2;
        this.f56245n = str3;
        this.f56246r = j11;
        this.f56247s = j12;
        this.f56248w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f56243e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
