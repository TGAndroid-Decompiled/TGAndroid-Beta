package p2;
public abstract class j implements Comparable {
    public final String f44043a;
    public final i f44044b;
    public final long f44045c;
    public final int d;
    public final long f44046e;
    public final b2.o f44047f;
    public final String h;
    public final String f44048n;
    public final long f44049r;
    public final long f44050s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f44043a = str;
        this.f44044b = iVar;
        this.f44045c = j3;
        this.d = i10;
        this.f44046e = j10;
        this.f44047f = oVar;
        this.h = str2;
        this.f44048n = str3;
        this.f44049r = j11;
        this.f44050s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f44046e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
