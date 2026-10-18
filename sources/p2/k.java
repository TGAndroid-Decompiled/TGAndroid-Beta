package p2;
public abstract class k implements Comparable {
    public final String f43987a;
    public final j f43988b;
    public final long f43989c;
    public final int d;
    public final long e;
    public final b2.s f43990f;
    public final String h;
    public final String f43991n;
    public final long f43992r;
    public final long f43993s;
    public final boolean v;

    public k(String str, j jVar, long j10, int i10, long j11, b2.s sVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f43987a = str;
        this.f43988b = jVar;
        this.f43989c = j10;
        this.d = i10;
        this.e = j11;
        this.f43990f = sVar;
        this.h = str2;
        this.f43991n = str3;
        this.f43992r = j12;
        this.f43993s = j13;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j10 = this.e;
        if (j10 > longValue) {
            return 1;
        }
        if (j10 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
