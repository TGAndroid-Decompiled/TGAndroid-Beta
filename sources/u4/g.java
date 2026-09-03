package u4;
public abstract class g implements Comparable {
    public final String f45086a;
    public final f f45087b;
    public final long f45088c;
    public final int d;
    public final long e;
    public final o3.h f45089f;
    public final String h;
    public final String f45090n;
    public final long f45091r;
    public final long f45092s;
    public final boolean v;

    public g(String str, f fVar, long j10, int i10, long j11, o3.h hVar, String str2, String str3, long j12, long j13, boolean z4) {
        this.f45086a = str;
        this.f45087b = fVar;
        this.f45088c = j10;
        this.d = i10;
        this.e = j11;
        this.f45089f = hVar;
        this.h = str2;
        this.f45090n = str3;
        this.f45091r = j12;
        this.f45092s = j13;
        this.v = z4;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
