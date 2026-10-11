package p2;
public abstract class j implements Comparable {
    public final String f45257a;
    public final i f45258b;
    public final long f45259c;
    public final int d;
    public final long f45260e;
    public final b2.o f45261f;
    public final String h;
    public final String f45262n;
    public final long f45263r;
    public final long f45264s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f45257a = str;
        this.f45258b = iVar;
        this.f45259c = j3;
        this.d = i10;
        this.f45260e = j10;
        this.f45261f = oVar;
        this.h = str2;
        this.f45262n = str3;
        this.f45263r = j11;
        this.f45264s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f45260e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
