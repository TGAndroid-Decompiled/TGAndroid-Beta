package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45493a;
    public final boolean f45494b;

    public g(b2.s sVar, int i10) {
        this.f45493a = (sVar.e & 1) != 0;
        this.f45494b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8130a.c(this.f45494b, gVar.f45494b).c(this.f45493a, gVar.f45493a).e();
    }
}
