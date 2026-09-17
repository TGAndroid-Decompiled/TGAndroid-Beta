package p2;
public abstract class k implements Comparable {
    public final String f40477a;
    public final j f40478b;
    public final long f40479c;
    public final int d;
    public final long e;
    public final b2.o f40480f;
    public final String h;
    public final String f40481n;
    public final long f40482r;
    public final long f40483s;
    public final boolean v;

    public k(String str, j jVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40477a = str;
        this.f40478b = jVar;
        this.f40479c = j3;
        this.d = i10;
        this.e = j10;
        this.f40480f = oVar;
        this.h = str2;
        this.f40481n = str3;
        this.f40482r = j11;
        this.f40483s = j12;
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
