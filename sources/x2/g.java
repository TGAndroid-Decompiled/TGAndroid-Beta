package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f48717a;
    public final boolean f48718b;

    public g(b2.s sVar, int i10) {
        this.f48717a = (sVar.f2358e & 1) != 0;
        this.f48718b = i2.g.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f9025a.c(this.f48718b, gVar.f48718b).c(this.f48717a, gVar.f48717a).e();
    }
}
