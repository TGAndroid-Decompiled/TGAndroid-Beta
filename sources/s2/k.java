package s2;
public abstract class k implements Comparable {
    public final String f54686a;
    public final j f54687b;
    public final long f54688c;
    public final int d;
    public final long f54689e;
    public final e2.r f54690f;
    public final String h;
    public final String f54691n;
    public final long f54692r;
    public final long f54693s;
    public final boolean f54694w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54686a = str;
        this.f54687b = jVar;
        this.f54688c = j3;
        this.d = i7;
        this.f54689e = j10;
        this.f54690f = rVar;
        this.h = str2;
        this.f54691n = str3;
        this.f54692r = j11;
        this.f54693s = j12;
        this.f54694w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54689e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
