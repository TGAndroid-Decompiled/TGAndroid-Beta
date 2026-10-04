package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f49206a;
    public final boolean f49207b;

    public g(b2.s sVar, int i10) {
        this.f49206a = (sVar.f3552e & 1) != 0;
        this.f49207b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8826a.c(this.f49207b, gVar.f49207b).c(this.f49206a, gVar.f49206a).e();
    }
}
