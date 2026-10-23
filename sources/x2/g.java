package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49150a;
    public final boolean f49151b;

    public g(w wVar, int i10) {
        this.f49150a = (wVar.e & 1) != 0;
        this.f49151b = i2.e.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8415a.c(this.f49151b, gVar.f49151b).c(this.f49150a, gVar.f49150a).e();
    }
}
