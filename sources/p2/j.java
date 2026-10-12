package p2;
public abstract class j implements Comparable {
    public final String f45111a;
    public final i f45112b;
    public final long f45113c;
    public final int d;
    public final long f45114e;
    public final b2.o f45115f;
    public final String h;
    public final String f45116n;
    public final long f45117r;
    public final long f45118s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f45111a = str;
        this.f45112b = iVar;
        this.f45113c = j3;
        this.d = i10;
        this.f45114e = j10;
        this.f45115f = oVar;
        this.h = str2;
        this.f45116n = str3;
        this.f45117r = j11;
        this.f45118s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f45114e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
