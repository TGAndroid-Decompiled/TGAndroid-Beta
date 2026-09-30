package p2;
public abstract class j implements Comparable {
    public final String f40724a;
    public final i f40725b;
    public final long f40726c;
    public final int d;
    public final long e;
    public final b2.o f40727f;
    public final String h;
    public final String f40728n;
    public final long f40729r;
    public final long f40730s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40724a = str;
        this.f40725b = iVar;
        this.f40726c = j3;
        this.d = i10;
        this.e = j10;
        this.f40727f = oVar;
        this.h = str2;
        this.f40728n = str3;
        this.f40729r = j11;
        this.f40730s = j12;
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
