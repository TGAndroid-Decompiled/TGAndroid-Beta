package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45448a;
    public final boolean f45449b;

    public g(b2.s sVar, int i10) {
        this.f45448a = (sVar.e & 1) != 0;
        this.f45449b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8128a.c(this.f45449b, gVar.f45449b).c(this.f45448a, gVar.f45448a).e();
    }
}
