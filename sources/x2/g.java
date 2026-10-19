package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49139a;
    public final boolean f49140b;

    public g(w wVar, int i10) {
        this.f49139a = (wVar.e & 1) != 0;
        this.f49140b = i2.e.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8417a.c(this.f49140b, gVar.f49140b).c(this.f49139a, gVar.f49139a).e();
    }
}
