package p2;
public abstract class j implements Comparable {
    public final String f40821a;
    public final i f40822b;
    public final long f40823c;
    public final int d;
    public final long e;
    public final b2.o f40824f;
    public final String h;
    public final String f40825n;
    public final long f40826r;
    public final long f40827s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f40821a = str;
        this.f40822b = iVar;
        this.f40823c = j3;
        this.d = i10;
        this.e = j10;
        this.f40824f = oVar;
        this.h = str2;
        this.f40825n = str3;
        this.f40826r = j11;
        this.f40827s = j12;
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
