package p2;
public abstract class j implements Comparable {
    public final String f40770a;
    public final i f40771b;
    public final long f40772c;
    public final int d;
    public final long e;
    public final b2.o f40773f;
    public final String h;
    public final String f40774n;
    public final long f40775r;
    public final long f40776s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40770a = str;
        this.f40771b = iVar;
        this.f40772c = j3;
        this.d = i10;
        this.e = j10;
        this.f40773f = oVar;
        this.h = str2;
        this.f40774n = str3;
        this.f40775r = j11;
        this.f40776s = j12;
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
