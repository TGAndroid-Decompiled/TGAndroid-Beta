package x2;

import b2.x;
import c3.h0;
import f9.w;
public final class h implements Comparable {
    public final boolean f51323a;
    public final boolean f51324b;

    public h(x xVar, int i10) {
        this.f51323a = (xVar.e & 1) != 0;
        this.f51324b = h0.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return w.f10352a.c(this.f51324b, hVar.f51324b).c(this.f51323a, hVar.f51323a).e();
    }
}
