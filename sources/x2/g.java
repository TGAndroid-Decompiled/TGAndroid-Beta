package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49146a;
    public final boolean f49147b;

    public g(w wVar, int i10) {
        this.f49146a = (wVar.e & 1) != 0;
        this.f49147b = i2.e.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8415a.c(this.f49147b, gVar.f49147b).c(this.f49146a, gVar.f49146a).e();
    }
}
