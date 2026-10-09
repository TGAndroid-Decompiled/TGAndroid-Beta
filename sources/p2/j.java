package p2;
public abstract class j implements Comparable {
    public final String f45221a;
    public final i f45222b;
    public final long f45223c;
    public final int d;
    public final long f45224e;
    public final b2.o f45225f;
    public final String h;
    public final String f45226n;
    public final long f45227r;
    public final long f45228s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f45221a = str;
        this.f45222b = iVar;
        this.f45223c = j3;
        this.d = i10;
        this.f45224e = j10;
        this.f45225f = oVar;
        this.h = str2;
        this.f45226n = str3;
        this.f45227r = j11;
        this.f45228s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f45224e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
