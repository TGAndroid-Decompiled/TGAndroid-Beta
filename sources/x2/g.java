package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f48746a;
    public final boolean f48747b;

    public g(b2.s sVar, int i10) {
        this.f48746a = (sVar.f2385e & 1) != 0;
        this.f48747b = i2.g.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f9053a.c(this.f48747b, gVar.f48747b).c(this.f48746a, gVar.f48746a).e();
    }
}
