package p4;
public abstract class h implements Comparable {
    public final String f45381a;
    public final g f45382b;
    public final long f45383c;
    public final int d;
    public final long f45384e;
    public final l3.c f45385f;
    public final String h;
    public final String f45386n;
    public final long f45387r;
    public final long f45388s;
    public final boolean v;

    public h(String str, g gVar, long j10, int i9, long j11, l3.c cVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f45381a = str;
        this.f45382b = gVar;
        this.f45383c = j10;
        this.d = i9;
        this.f45384e = j11;
        this.f45385f = cVar;
        this.h = str2;
        this.f45386n = str3;
        this.f45387r = j12;
        this.f45388s = j13;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j10 = this.f45384e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
