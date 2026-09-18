package x2;

import e9.z;
import hg.k0;
public final class g implements Comparable {
    public final boolean f45197a;
    public final boolean f45198b;

    public g(b2.s sVar, int i10) {
        this.f45197a = (sVar.e & 1) != 0;
        this.f45198b = k0.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8146a.c(this.f45198b, gVar.f45198b).c(this.f45197a, gVar.f45197a).e();
    }
}
