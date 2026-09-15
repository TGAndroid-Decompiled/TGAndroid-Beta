package x2;

import b2.l1;
import hg.k0;
public final class f extends n implements Comparable {
    public final int e;
    public final int f45168f;

    public f(int i10, l1 l1Var, int i11, i iVar, int i12) {
        super(i10, l1Var, i11);
        int i13;
        this.e = k0.d(i12, iVar.f45179t0) ? 1 : 0;
        b2.s sVar = this.d;
        int i14 = sVar.f3310y;
        int i15 = -1;
        if (i14 != -1 && (i13 = sVar.f3311z) != -1) {
            i15 = i14 * i13;
        }
        this.f45168f = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(n nVar) {
        f fVar = (f) nVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f45168f, ((f) obj).f45168f);
    }
}
