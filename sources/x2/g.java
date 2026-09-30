package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45555a;
    public final boolean f45556b;

    public g(b2.s sVar, int i10) {
        this.f45555a = (sVar.e & 1) != 0;
        this.f45556b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8140a.c(this.f45556b, gVar.f45556b).c(this.f45555a, gVar.f45555a).e();
    }
}
