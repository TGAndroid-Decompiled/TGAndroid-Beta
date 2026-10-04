package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f49198a;
    public final boolean f49199b;

    public g(b2.s sVar, int i10) {
        this.f49198a = (sVar.f3552e & 1) != 0;
        this.f49199b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8825a.c(this.f49199b, gVar.f49199b).c(this.f49198a, gVar.f49198a).e();
    }
}
