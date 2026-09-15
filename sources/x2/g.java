package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45169a;
    public final boolean f45170b;

    public g(b2.s sVar, int i10) {
        this.f45169a = (sVar.e & 1) != 0;
        this.f45170b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8141a.c(this.f45170b, gVar.f45170b).c(this.f45169a, gVar.f45169a).e();
    }
}
