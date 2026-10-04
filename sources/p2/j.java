package p2;
public abstract class j implements Comparable {
    public final String f44042a;
    public final i f44043b;
    public final long f44044c;
    public final int d;
    public final long f44045e;
    public final b2.o f44046f;
    public final String h;
    public final String f44047n;
    public final long f44048r;
    public final long f44049s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f44042a = str;
        this.f44043b = iVar;
        this.f44044c = j3;
        this.d = i10;
        this.f44045e = j10;
        this.f44046f = oVar;
        this.h = str2;
        this.f44047n = str3;
        this.f44048r = j11;
        this.f44049s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f44045e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
