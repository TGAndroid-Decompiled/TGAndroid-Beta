package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45485a;
    public final boolean f45486b;

    public g(b2.s sVar, int i10) {
        this.f45485a = (sVar.e & 1) != 0;
        this.f45486b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8145a.c(this.f45486b, gVar.f45486b).c(this.f45485a, gVar.f45485a).e();
    }
}
