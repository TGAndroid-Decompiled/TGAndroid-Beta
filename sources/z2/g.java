package z2;

import d2.v;
import g9.w;
import k2.p1;
public final class g implements Comparable {
    public final boolean f59604a;
    public final boolean f59605b;

    public g(v vVar, int i3) {
        this.f59604a = (vVar.f8476e & 1) != 0;
        this.f59605b = p1.b(i3, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return w.f12160a.c(this.f59605b, gVar.f59605b).c(this.f59604a, gVar.f59604a).e();
    }
}
