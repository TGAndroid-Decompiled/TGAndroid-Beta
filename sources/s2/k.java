package s2;
public abstract class k implements Comparable {
    public final String f54675a;
    public final j f54676b;
    public final long f54677c;
    public final int d;
    public final long f54678e;
    public final e2.r f54679f;
    public final String h;
    public final String f54680n;
    public final long f54681r;
    public final long f54682s;
    public final boolean f54683w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f54675a = str;
        this.f54676b = jVar;
        this.f54677c = j3;
        this.d = i7;
        this.f54678e = j10;
        this.f54679f = rVar;
        this.h = str2;
        this.f54680n = str3;
        this.f54681r = j11;
        this.f54682s = j12;
        this.f54683w = z9;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f54678e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
