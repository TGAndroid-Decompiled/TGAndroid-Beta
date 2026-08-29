package r4;
public abstract class h implements Comparable {
    public final String f46962a;
    public final g f46963b;
    public final long f46964c;
    public final int d;
    public final long f46965e;
    public final n3.c f46966f;
    public final String h;
    public final String f46967n;
    public final long f46968r;
    public final long f46969s;
    public final boolean v;

    public h(String str, g gVar, long j10, int i10, long j11, n3.c cVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f46962a = str;
        this.f46963b = gVar;
        this.f46964c = j10;
        this.d = i10;
        this.f46965e = j11;
        this.f46966f = cVar;
        this.h = str2;
        this.f46967n = str3;
        this.f46968r = j12;
        this.f46969s = j13;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.f46965e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
