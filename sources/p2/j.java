package p2;
public abstract class j implements Comparable {
    public final String f44050a;
    public final i f44051b;
    public final long f44052c;
    public final int d;
    public final long f44053e;
    public final b2.o f44054f;
    public final String h;
    public final String f44055n;
    public final long f44056r;
    public final long f44057s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f44050a = str;
        this.f44051b = iVar;
        this.f44052c = j3;
        this.d = i10;
        this.f44053e = j10;
        this.f44054f = oVar;
        this.h = str2;
        this.f44055n = str3;
        this.f44056r = j11;
        this.f44057s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f44053e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
