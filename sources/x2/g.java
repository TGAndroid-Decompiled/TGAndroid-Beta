package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45464a;
    public final boolean f45465b;

    public g(b2.s sVar, int i10) {
        this.f45464a = (sVar.e & 1) != 0;
        this.f45465b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8146a.c(this.f45465b, gVar.f45465b).c(this.f45464a, gVar.f45464a).e();
    }
}
