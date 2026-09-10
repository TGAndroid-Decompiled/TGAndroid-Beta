package p2;
public abstract class j implements Comparable {
    public final String f39580a;
    public final i f39581b;
    public final long f39582c;
    public final int d;
    public final long e;
    public final b2.o f39583f;
    public final String h;
    public final String f39584n;
    public final long f39585r;
    public final long f39586s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f39580a = str;
        this.f39581b = iVar;
        this.f39582c = j3;
        this.d = i10;
        this.e = j10;
        this.f39583f = oVar;
        this.h = str2;
        this.f39584n = str3;
        this.f39585r = j11;
        this.f39586s = j12;
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
