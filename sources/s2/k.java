package s2;
public abstract class k implements Comparable {
    public final String f54582a;
    public final j f54583b;
    public final long f54584c;
    public final int d;
    public final long f54585e;
    public final e2.r f54586f;
    public final String h;
    public final String f54587n;
    public final long f54588r;
    public final long f54589s;
    public final boolean f54590w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54582a = str;
        this.f54583b = jVar;
        this.f54584c = j3;
        this.d = i7;
        this.f54585e = j10;
        this.f54586f = rVar;
        this.h = str2;
        this.f54587n = str3;
        this.f54588r = j11;
        this.f54589s = j12;
        this.f54590w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54585e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
