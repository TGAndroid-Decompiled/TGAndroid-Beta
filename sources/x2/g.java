package x2;

import b2.x;
import e9.b0;
public final class g implements Comparable {
    public final boolean f47754a;
    public final boolean f47755b;

    public g(x xVar, int i10) {
        this.f47754a = (xVar.e & 1) != 0;
        this.f47755b = i2.d.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8533a.c(this.f47755b, gVar.f47755b).c(this.f47754a, gVar.f47754a).e();
    }
}
