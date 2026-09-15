package p2;
public abstract class k implements Comparable {
    public final String f40455a;
    public final j f40456b;
    public final long f40457c;
    public final int d;
    public final long e;
    public final b2.o f40458f;
    public final String h;
    public final String f40459n;
    public final long f40460r;
    public final long f40461s;
    public final boolean v;

    public k(String str, j jVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40455a = str;
        this.f40456b = jVar;
        this.f40457c = j3;
        this.d = i10;
        this.e = j10;
        this.f40458f = oVar;
        this.h = str2;
        this.f40459n = str3;
        this.f40460r = j11;
        this.f40461s = j12;
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
