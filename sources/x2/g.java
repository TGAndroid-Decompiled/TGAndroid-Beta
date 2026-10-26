package x2;

import b2.q1;
import b2.x;
import c3.h0;
public final class g extends m implements Comparable {
    public final int e;
    public final int f51322f;

    public g(int i10, q1 q1Var, int i11, j jVar, int i12) {
        super(i10, q1Var, i11);
        int i13;
        this.e = h0.e(i12, jVar.B0) ? 1 : 0;
        x xVar = this.d;
        int i14 = xVar.f3592z;
        int i15 = -1;
        if (i14 != -1 && (i13 = xVar.A) != -1) {
            i15 = i14 * i13;
        }
        this.f51322f = i15;
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
        return Integer.compare(this.f51322f, ((g) obj).f51322f);
    }
}
