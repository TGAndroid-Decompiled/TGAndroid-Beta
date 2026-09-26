package p2;
public abstract class j implements Comparable {
    public final String f40721a;
    public final i f40722b;
    public final long f40723c;
    public final int d;
    public final long e;
    public final b2.o f40724f;
    public final String h;
    public final String f40725n;
    public final long f40726r;
    public final long f40727s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40721a = str;
        this.f40722b = iVar;
        this.f40723c = j3;
        this.d = i10;
        this.e = j10;
        this.f40724f = oVar;
        this.h = str2;
        this.f40725n = str3;
        this.f40726r = j11;
        this.f40727s = j12;
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
