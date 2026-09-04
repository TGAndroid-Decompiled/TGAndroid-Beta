package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f48716a;
    public final boolean f48717b;

    public g(b2.s sVar, int i10) {
        this.f48716a = (sVar.f2358e & 1) != 0;
        this.f48717b = i2.g.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f9025a.c(this.f48717b, gVar.f48717b).c(this.f48716a, gVar.f48716a).e();
    }
}
