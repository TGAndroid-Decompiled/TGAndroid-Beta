package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50579a;
    public final boolean f50580b;

    public g(b2.s sVar, int i10) {
        this.f50579a = (sVar.f3631e & 1) != 0;
        this.f50580b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8819a.c(this.f50580b, gVar.f50580b).c(this.f50579a, gVar.f50579a).e();
    }
}
