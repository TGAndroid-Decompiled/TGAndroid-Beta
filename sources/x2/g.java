package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f49213a;
    public final boolean f49214b;

    public g(b2.s sVar, int i10) {
        this.f49213a = (sVar.f3552e & 1) != 0;
        this.f49214b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8826a.c(this.f49214b, gVar.f49214b).c(this.f49213a, gVar.f49213a).e();
    }
}
