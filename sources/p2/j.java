package p2;
public abstract class j implements Comparable {
    public final String f45223a;
    public final i f45224b;
    public final long f45225c;
    public final int d;
    public final long f45226e;
    public final b2.o f45227f;
    public final String h;
    public final String f45228n;
    public final long f45229r;
    public final long f45230s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f45223a = str;
        this.f45224b = iVar;
        this.f45225c = j3;
        this.d = i10;
        this.f45226e = j10;
        this.f45227f = oVar;
        this.h = str2;
        this.f45228n = str3;
        this.f45229r = j11;
        this.f45230s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f45226e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
