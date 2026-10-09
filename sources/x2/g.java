package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50491a;
    public final boolean f50492b;

    public g(b2.s sVar, int i10) {
        this.f50491a = (sVar.f3631e & 1) != 0;
        this.f50492b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8820a.c(this.f50492b, gVar.f50492b).c(this.f50491a, gVar.f50491a).e();
    }
}
