package p2;
public abstract class k implements Comparable {
    public final String f40482a;
    public final j f40483b;
    public final long f40484c;
    public final int d;
    public final long e;
    public final b2.o f40485f;
    public final String h;
    public final String f40486n;
    public final long f40487r;
    public final long f40488s;
    public final boolean v;

    public k(String str, j jVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40482a = str;
        this.f40483b = jVar;
        this.f40484c = j3;
        this.d = i10;
        this.e = j10;
        this.f40485f = oVar;
        this.h = str2;
        this.f40486n = str3;
        this.f40487r = j11;
        this.f40488s = j12;
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
