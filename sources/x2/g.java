package x2;

import e9.z;
public final class g implements Comparable {
    public final boolean f50489a;
    public final boolean f50490b;

    public g(b2.s sVar, int i10) {
        this.f50489a = (sVar.f3631e & 1) != 0;
        this.f50490b = hg.c.d(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return z.f8820a.c(this.f50490b, gVar.f50490b).c(this.f50489a, gVar.f50489a).e();
    }
}
