package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45165a;
    public final boolean f45166b;

    public g(b2.s sVar, int i10) {
        this.f45165a = (sVar.e & 1) != 0;
        this.f45166b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8143a.c(this.f45166b, gVar.f45166b).c(this.f45165a, gVar.f45165a).e();
    }
}
