package x2;

import b2.x;
import e9.b0;
public final class h implements Comparable {
    public final boolean f52936a;
    public final boolean f52937b;

    public h(x xVar, int i10) {
        this.f52936a = (xVar.e & 1) != 0;
        this.f52937b = i0.a.b(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return b0.f6331a.c(this.f52937b, hVar.f52937b).c(this.f52936a, hVar.f52936a).e();
    }
}
