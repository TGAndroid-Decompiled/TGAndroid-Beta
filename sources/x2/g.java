package x2;

import b2.x;
import e9.b0;
public final class g implements Comparable {
    public final boolean f47753a;
    public final boolean f47754b;

    public g(x xVar, int i10) {
        this.f47753a = (xVar.e & 1) != 0;
        this.f47754b = i2.d.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8536a.c(this.f47754b, gVar.f47754b).c(this.f47753a, gVar.f47753a).e();
    }
}
