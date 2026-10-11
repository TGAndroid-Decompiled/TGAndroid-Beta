package p2;
public abstract class j implements Comparable {
    public final String f45291a;
    public final i f45292b;
    public final long f45293c;
    public final int d;
    public final long f45294e;
    public final b2.o f45295f;
    public final String h;
    public final String f45296n;
    public final long f45297r;
    public final long f45298s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f45291a = str;
        this.f45292b = iVar;
        this.f45293c = j3;
        this.d = i10;
        this.f45294e = j10;
        this.f45295f = oVar;
        this.h = str2;
        this.f45296n = str3;
        this.f45297r = j11;
        this.f45298s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f45294e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
