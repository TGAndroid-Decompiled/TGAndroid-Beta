package x2;

import b2.p1;
import b2.x;
public final class g extends m implements Comparable {
    public final int e;
    public final int f52935f;

    public g(int i10, p1 p1Var, int i11, j jVar, int i12) {
        super(i10, p1Var, i11);
        int i13;
        this.e = i0.a.b(i12, jVar.B0) ? 1 : 0;
        x xVar = this.d;
        int i14 = xVar.f2429z;
        int i15 = -1;
        if (i14 != -1 && (i13 = xVar.A) != -1) {
            i15 = i14 * i13;
        }
        this.f52935f = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(m mVar) {
        g gVar = (g) mVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f52935f, ((g) obj).f52935f);
    }
}
