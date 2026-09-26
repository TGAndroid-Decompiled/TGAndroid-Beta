package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45446a;
    public final boolean f45447b;

    public g(b2.s sVar, int i10) {
        this.f45446a = (sVar.e & 1) != 0;
        this.f45447b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8128a.c(this.f45447b, gVar.f45447b).c(this.f45446a, gVar.f45446a).e();
    }
}
