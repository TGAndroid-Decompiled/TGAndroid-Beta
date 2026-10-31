package x2;

import b2.x;
import e9.b0;
public final class h implements Comparable {
    public final boolean f52918a;
    public final boolean f52919b;

    public h(x xVar, int i10) {
        this.f52918a = (xVar.e & 1) != 0;
        this.f52919b = i0.a.b(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return b0.f6331a.c(this.f52919b, hVar.f52919b).c(this.f52918a, hVar.f52918a).e();
    }
}
