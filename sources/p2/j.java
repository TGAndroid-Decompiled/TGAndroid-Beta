package p2;
public abstract class j implements Comparable {
    public final String f43701a;
    public final i f43702b;
    public final long f43703c;
    public final int d;
    public final long f43704e;
    public final b2.o f43705f;
    public final String h;
    public final String f43706n;
    public final long f43707r;
    public final long f43708s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f43701a = str;
        this.f43702b = iVar;
        this.f43703c = j3;
        this.d = i10;
        this.f43704e = j10;
        this.f43705f = oVar;
        this.h = str2;
        this.f43706n = str3;
        this.f43707r = j11;
        this.f43708s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f43704e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
