package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f44509a;
    public final boolean f44510b;

    public g(b2.s sVar, int i10) {
        this.f44509a = (sVar.e & 1) != 0;
        this.f44510b = hc.b.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f7446a.c(this.f44510b, gVar.f44510b).c(this.f44509a, gVar.f44509a).e();
    }
}
