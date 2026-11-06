package s2;
public abstract class k implements Comparable {
    public final String f54583a;
    public final j f54584b;
    public final long f54585c;
    public final int d;
    public final long f54586e;
    public final e2.r f54587f;
    public final String h;
    public final String f54588n;
    public final long f54589r;
    public final long f54590s;
    public final boolean f54591w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54583a = str;
        this.f54584b = jVar;
        this.f54585c = j3;
        this.d = i7;
        this.f54586e = j10;
        this.f54587f = rVar;
        this.h = str2;
        this.f54588n = str3;
        this.f54589r = j11;
        this.f54590s = j12;
        this.f54591w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54586e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
