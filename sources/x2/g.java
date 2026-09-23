package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f45119a;
    public final boolean f45120b;

    public g(b2.s sVar, int i10) {
        this.f45119a = (sVar.e & 1) != 0;
        this.f45120b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8129a.c(this.f45120b, gVar.f45120b).c(this.f45119a, gVar.f45119a).e();
    }
}
