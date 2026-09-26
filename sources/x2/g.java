package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45447a;
    public final boolean f45448b;

    public g(b2.s sVar, int i10) {
        this.f45447a = (sVar.e & 1) != 0;
        this.f45448b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8128a.c(this.f45448b, gVar.f45448b).c(this.f45447a, gVar.f45447a).e();
    }
}
