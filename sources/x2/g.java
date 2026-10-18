package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49187a;
    public final boolean f49188b;

    public g(w wVar, int i10) {
        this.f49187a = (wVar.e & 1) != 0;
        this.f49188b = i2.d.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8418a.c(this.f49188b, gVar.f49188b).c(this.f49187a, gVar.f49187a).e();
    }
}
