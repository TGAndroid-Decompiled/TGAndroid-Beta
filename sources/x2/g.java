package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49140a;
    public final boolean f49141b;

    public g(w wVar, int i10) {
        this.f49140a = (wVar.e & 1) != 0;
        this.f49141b = i2.d.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8416a.c(this.f49141b, gVar.f49141b).c(this.f49140a, gVar.f49140a).e();
    }
}
