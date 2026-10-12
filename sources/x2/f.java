package x2;

import b2.q1;
import b2.x;
public final class f extends l implements Comparable {
    public final int e;
    public final int f47753f;

    public f(int i10, q1 q1Var, int i11, i iVar, int i12) {
        super(i10, q1Var, i11);
        int i13;
        this.e = i2.d.e(i12, iVar.B0) ? 1 : 0;
        x xVar = this.d;
        int i14 = xVar.f2525z;
        int i15 = -1;
        if (i14 != -1 && (i13 = xVar.A) != -1) {
            i15 = i14 * i13;
        }
        this.f47753f = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(l lVar) {
        f fVar = (f) lVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f47753f, ((f) obj).f47753f);
    }
}
