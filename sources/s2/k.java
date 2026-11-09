package s2;
public abstract class k implements Comparable {
    public final String f54687a;
    public final j f54688b;
    public final long f54689c;
    public final int d;
    public final long f54690e;
    public final e2.r f54691f;
    public final String h;
    public final String f54692n;
    public final long f54693r;
    public final long f54694s;
    public final boolean f54695w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54687a = str;
        this.f54688b = jVar;
        this.f54689c = j3;
        this.d = i7;
        this.f54690e = j10;
        this.f54691f = rVar;
        this.h = str2;
        this.f54692n = str3;
        this.f54693r = j11;
        this.f54694s = j12;
        this.f54695w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54690e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
