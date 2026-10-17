package x2;

import b2.w;
import e9.b0;
public final class g implements Comparable {
    public final boolean f49162a;
    public final boolean f49163b;

    public g(w wVar, int i10) {
        this.f49162a = (wVar.e & 1) != 0;
        this.f49163b = i0.a.e(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.f8417a.c(this.f49163b, gVar.f49163b).c(this.f49162a, gVar.f49162a).e();
    }
}
