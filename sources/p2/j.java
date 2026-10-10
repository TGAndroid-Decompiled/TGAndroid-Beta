package p2;
public abstract class j implements Comparable {
    public final String f45267a;
    public final i f45268b;
    public final long f45269c;
    public final int d;
    public final long f45270e;
    public final b2.o f45271f;
    public final String h;
    public final String f45272n;
    public final long f45273r;
    public final long f45274s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f45267a = str;
        this.f45268b = iVar;
        this.f45269c = j3;
        this.d = i10;
        this.f45270e = j10;
        this.f45271f = oVar;
        this.h = str2;
        this.f45272n = str3;
        this.f45273r = j11;
        this.f45274s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f45270e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
