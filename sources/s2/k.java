package s2;
public abstract class k implements Comparable {
    public final String f56814a;
    public final j f56815b;
    public final long f56816c;
    public final int d;
    public final long f56817e;
    public final e2.r f56818f;
    public final String h;
    public final String f56819n;
    public final long f56820r;
    public final long f56821s;
    public final boolean f56822w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f56814a = str;
        this.f56815b = jVar;
        this.f56816c = j3;
        this.d = i7;
        this.f56817e = j10;
        this.f56818f = rVar;
        this.h = str2;
        this.f56819n = str3;
        this.f56820r = j11;
        this.f56821s = j12;
        this.f56822w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f56817e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
