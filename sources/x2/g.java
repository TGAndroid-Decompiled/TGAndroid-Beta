package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49149a;
    public final boolean f49150b;

    public g(w wVar, int i10) {
        this.f49149a = (wVar.e & 1) != 0;
        this.f49150b = i2.e.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8415a.c(this.f49150b, gVar.f49150b).c(this.f49149a, gVar.f49149a).e();
    }
}
