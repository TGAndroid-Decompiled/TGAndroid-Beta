package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45449a;
    public final boolean f45450b;

    public g(b2.s sVar, int i10) {
        this.f45449a = (sVar.e & 1) != 0;
        this.f45450b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8128a.c(this.f45450b, gVar.f45450b).c(this.f45449a, gVar.f45449a).e();
    }
}
