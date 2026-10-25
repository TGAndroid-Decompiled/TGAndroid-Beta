package x2;

import b2.x;
import c3.h0;
import f9.w;
public final class h implements Comparable {
    public final boolean f51320a;
    public final boolean f51321b;

    public h(x xVar, int i10) {
        this.f51320a = (xVar.e & 1) != 0;
        this.f51321b = h0.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return w.f10352a.c(this.f51321b, hVar.f51321b).c(this.f51320a, hVar.f51320a).e();
    }
}
