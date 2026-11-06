package s2;
public abstract class k implements Comparable {
    public final String f54558a;
    public final j f54559b;
    public final long f54560c;
    public final int d;
    public final long f54561e;
    public final e2.r f54562f;
    public final String h;
    public final String f54563n;
    public final long f54564r;
    public final long f54565s;
    public final boolean f54566w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54558a = str;
        this.f54559b = jVar;
        this.f54560c = j3;
        this.d = i7;
        this.f54561e = j10;
        this.f54562f = rVar;
        this.h = str2;
        this.f54563n = str3;
        this.f54564r = j11;
        this.f54565s = j12;
        this.f54566w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54561e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
