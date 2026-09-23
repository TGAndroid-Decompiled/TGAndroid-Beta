package p2;
public abstract class k implements Comparable {
    public final String f40406a;
    public final j f40407b;
    public final long f40408c;
    public final int d;
    public final long e;
    public final b2.o f40409f;
    public final String h;
    public final String f40410n;
    public final long f40411r;
    public final long f40412s;
    public final boolean v;

    public k(String str, j jVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40406a = str;
        this.f40407b = jVar;
        this.f40408c = j3;
        this.d = i10;
        this.e = j10;
        this.f40409f = oVar;
        this.h = str2;
        this.f40410n = str3;
        this.f40411r = j11;
        this.f40412s = j12;
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
