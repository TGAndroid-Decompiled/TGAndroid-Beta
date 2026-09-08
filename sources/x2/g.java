package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f48745a;
    public final boolean f48746b;

    public g(b2.s sVar, int i10) {
        this.f48745a = (sVar.f2385e & 1) != 0;
        this.f48746b = i2.g.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f9053a.c(this.f48746b, gVar.f48746b).c(this.f48745a, gVar.f48745a).e();
    }
}
