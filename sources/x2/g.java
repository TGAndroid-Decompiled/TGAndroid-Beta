package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50613a;
    public final boolean f50614b;

    public g(b2.s sVar, int i10) {
        this.f50613a = (sVar.f3631e & 1) != 0;
        this.f50614b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8819a.c(this.f50614b, gVar.f50614b).c(this.f50613a, gVar.f50613a).e();
    }
}
