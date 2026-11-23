package s2;
public abstract class k implements Comparable {
    public final String f56824a;
    public final j f56825b;
    public final long f56826c;
    public final int d;
    public final long f56827e;
    public final e2.r f56828f;
    public final String h;
    public final String f56829n;
    public final long f56830r;
    public final long f56831s;
    public final boolean f56832w;

    public k(String str, j jVar, long j3, int i7, long j10, e2.r rVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f56824a = str;
        this.f56825b = jVar;
        this.f56826c = j3;
        this.d = i7;
        this.f56827e = j10;
        this.f56828f = rVar;
        this.h = str2;
        this.f56829n = str3;
        this.f56830r = j11;
        this.f56831s = j12;
        this.f56832w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j3 = this.f56827e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
