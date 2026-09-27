package p2;
public abstract class j implements Comparable {
    public final String f40720a;
    public final i f40721b;
    public final long f40722c;
    public final int d;
    public final long e;
    public final b2.o f40723f;
    public final String h;
    public final String f40724n;
    public final long f40725r;
    public final long f40726s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40720a = str;
        this.f40721b = iVar;
        this.f40722c = j3;
        this.d = i10;
        this.e = j10;
        this.f40723f = oVar;
        this.h = str2;
        this.f40724n = str3;
        this.f40725r = j11;
        this.f40726s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
