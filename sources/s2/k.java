package s2;
public abstract class k implements Comparable {
    public final String f54674a;
    public final j f54675b;
    public final long f54676c;
    public final int d;
    public final long f54677e;
    public final e2.r f54678f;
    public final String h;
    public final String f54679n;
    public final long f54680r;
    public final long f54681s;
    public final boolean f54682w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54674a = str;
        this.f54675b = jVar;
        this.f54676c = j3;
        this.d = i7;
        this.f54677e = j10;
        this.f54678f = rVar;
        this.h = str2;
        this.f54679n = str3;
        this.f54680r = j11;
        this.f54681s = j12;
        this.f54682w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54677e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
