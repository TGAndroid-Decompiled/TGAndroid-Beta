package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50720a;
    public final boolean f50721b;

    public g(b2.s sVar, int i10) {
        this.f50720a = (sVar.f3629e & 1) != 0;
        this.f50721b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8817a.c(this.f50721b, gVar.f50721b).c(this.f50720a, gVar.f50720a).e();
    }
}
