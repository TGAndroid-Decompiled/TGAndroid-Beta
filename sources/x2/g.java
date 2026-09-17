package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45192a;
    public final boolean f45193b;

    public g(b2.s sVar, int i10) {
        this.f45192a = (sVar.e & 1) != 0;
        this.f45193b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8146a.c(this.f45193b, gVar.f45193b).c(this.f45192a, gVar.f45192a).e();
    }
}
