package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49141a;
    public final boolean f49142b;

    public g(w wVar, int i10) {
        this.f49141a = (wVar.e & 1) != 0;
        this.f49142b = i2.e.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8415a.c(this.f49142b, gVar.f49142b).c(this.f49141a, gVar.f49141a).e();
    }
}
