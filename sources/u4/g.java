package u4;
public abstract class g implements Comparable {
    public final String f45024a;
    public final f f45025b;
    public final long f45026c;
    public final int d;
    public final long e;
    public final o3.g f45027f;
    public final String h;
    public final String f45028n;
    public final long f45029r;
    public final long f45030s;
    public final boolean v;

    public g(String str, f fVar, long j10, int i10, long j11, o3.g gVar, String str2, String str3, long j12, long j13, boolean z4) {
        this.f45024a = str;
        this.f45025b = fVar;
        this.f45026c = j10;
        this.d = i10;
        this.e = j11;
        this.f45027f = gVar;
        this.h = str2;
        this.f45028n = str3;
        this.f45029r = j12;
        this.f45030s = j13;
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
