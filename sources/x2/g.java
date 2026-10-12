package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50728a;
    public final boolean f50729b;

    public g(b2.s sVar, int i10) {
        this.f50728a = (sVar.f3629e & 1) != 0;
        this.f50729b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8817a.c(this.f50729b, gVar.f50729b).c(this.f50728a, gVar.f50728a).e();
    }
}
