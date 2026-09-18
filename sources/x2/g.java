package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45420a;
    public final boolean f45421b;

    public g(b2.s sVar, int i10) {
        this.f45420a = (sVar.e & 1) != 0;
        this.f45421b = k0.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8145a.c(this.f45421b, gVar.f45421b).c(this.f45420a, gVar.f45420a).e();
    }
}
