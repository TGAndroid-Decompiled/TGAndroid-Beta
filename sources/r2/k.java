package r2;
public abstract class k implements Comparable {
    public final String f54140a;
    public final j f54141b;
    public final long f54142c;
    public final int d;
    public final long f54143e;
    public final d2.s f54144f;
    public final String h;
    public final String f54145n;
    public final long f54146r;
    public final long f54147s;
    public final boolean f54148w;

    public k(String str, j jVar, long j10, int i3, long j11, d2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f54140a = str;
        this.f54141b = jVar;
        this.f54142c = j10;
        this.d = i3;
        this.f54143e = j11;
        this.f54144f = sVar;
        this.h = str2;
        this.f54145n = str3;
        this.f54146r = j12;
        this.f54147s = j13;
        this.f54148w = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.f54143e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
