package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50535a;
    public final boolean f50536b;

    public g(b2.s sVar, int i10) {
        this.f50535a = (sVar.f3631e & 1) != 0;
        this.f50536b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8820a.c(this.f50536b, gVar.f50536b).c(this.f50535a, gVar.f50535a).e();
    }
}
