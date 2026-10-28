package x2;

import b2.x;
import c3.h0;
import f9.w;
public final class h implements Comparable {
    public final boolean f51381a;
    public final boolean f51382b;

    public h(x xVar, int i10) {
        this.f51381a = (xVar.e & 1) != 0;
        this.f51382b = h0.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return w.f10351a.c(this.f51382b, hVar.f51382b).c(this.f51381a, hVar.f51381a).e();
    }
}
