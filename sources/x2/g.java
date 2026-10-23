package x2;

import b2.w;
import e9.b0;
import i2.o1;
public final class g implements Comparable {
    public final boolean f49592a;
    public final boolean f49593b;

    public g(w wVar, int i10) {
        this.f49592a = (wVar.e & 1) != 0;
        this.f49593b = o1.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8422a.c(this.f49593b, gVar.f49593b).c(this.f49592a, gVar.f49592a).e();
    }
}
