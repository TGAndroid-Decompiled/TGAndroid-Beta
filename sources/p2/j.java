package p2;
public abstract class j implements Comparable {
    public final String f44057a;
    public final i f44058b;
    public final long f44059c;
    public final int d;
    public final long f44060e;
    public final b2.o f44061f;
    public final String h;
    public final String f44062n;
    public final long f44063r;
    public final long f44064s;
    public final boolean v;

    public j(String str, i iVar, long j3, int i10, long j10, b2.o oVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f44057a = str;
        this.f44058b = iVar;
        this.f44059c = j3;
        this.d = i10;
        this.f44060e = j10;
        this.f44061f = oVar;
        this.h = str2;
        this.f44062n = str3;
        this.f44063r = j11;
        this.f44064s = j12;
        this.v = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j3 = this.f44060e;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l4.longValue()) {
            return -1;
        }
        return 0;
    }
}
