package p2;
public abstract class j implements Comparable {
    public final String f43728a;
    public final i f43729b;
    public final long f43730c;
    public final int d;
    public final long f43731e;
    public final b2.o f43732f;
    public final String h;
    public final String f43733n;
    public final long f43734r;
    public final long f43735s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f43728a = str;
        this.f43729b = iVar;
        this.f43730c = j3;
        this.d = i10;
        this.f43731e = j10;
        this.f43732f = oVar;
        this.h = str2;
        this.f43733n = str3;
        this.f43734r = j11;
        this.f43735s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f43731e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
