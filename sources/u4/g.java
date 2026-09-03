package u4;
public abstract class g implements Comparable {
    public final String f48305a;
    public final f f48306b;
    public final long f48307c;
    public final int d;
    public final long f48308e;
    public final o3.g f48309f;
    public final String h;
    public final String f48310n;
    public final long f48311r;
    public final long f48312s;
    public final boolean v;

    public g(String str, f fVar, long j10, int i10, long j11, o3.g gVar, String str2, String str3, long j12, long j13, boolean z4) {
        this.f48305a = str;
        this.f48306b = fVar;
        this.f48307c = j10;
        this.d = i10;
        this.f48308e = j11;
        this.f48309f = gVar;
        this.h = str2;
        this.f48310n = str3;
        this.f48311r = j12;
        this.f48312s = j13;
        this.v = z4;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.f48308e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
