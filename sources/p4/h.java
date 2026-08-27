package p4;

public abstract class h implements Comparable {

    public final String f45387a;

    public final g f45388b;

    public final long f45389c;
    public final int d;

    public final long f45390e;

    public final l3.d f45391f;
    public final String h;

    public final String f45392n;

    public final long f45393r;

    public final long f45394s;
    public final boolean v;

    public h(String str, g gVar, long j10, int i10, long j11, l3.d dVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f45387a = str;
        this.f45388b = gVar;
        this.f45389c = j10;
        this.d = i10;
        this.f45390e = j11;
        this.f45391f = dVar;
        this.h = str2;
        this.f45392n = str3;
        this.f45393r = j12;
        this.f45394s = j13;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j10 = this.f45390e;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l10.longValue() ? -1 : 0;
    }
}
