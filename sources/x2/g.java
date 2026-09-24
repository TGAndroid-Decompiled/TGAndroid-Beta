package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45433a;
    public final boolean f45434b;

    public g(b2.s sVar, int i10) {
        this.f45433a = (sVar.e & 1) != 0;
        this.f45434b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8128a.c(this.f45434b, gVar.f45434b).c(this.f45433a, gVar.f45433a).e();
    }
}
