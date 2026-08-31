package u4;
public abstract class g implements Comparable {
    public final String f48269a;
    public final f f48270b;
    public final long f48271c;
    public final int d;
    public final long f48272e;
    public final o3.g f48273f;
    public final String h;
    public final String f48274n;
    public final long f48275r;
    public final long f48276s;
    public final boolean v;

    public g(String str, f fVar, long j10, int i10, long j11, o3.g gVar, String str2, String str3, long j12, long j13, boolean z4) {
        this.f48269a = str;
        this.f48270b = fVar;
        this.f48271c = j10;
        this.d = i10;
        this.f48272e = j11;
        this.f48273f = gVar;
        this.h = str2;
        this.f48274n = str3;
        this.f48275r = j12;
        this.f48276s = j13;
        this.v = z4;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.f48272e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
