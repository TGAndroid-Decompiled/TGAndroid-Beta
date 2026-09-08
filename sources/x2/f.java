package x2;

import b2.l1;
public final class f extends n implements Comparable {
    public final int f48743e;
    public final int f48744f;

    public f(int i10, l1 l1Var, int i11, i iVar, int i12) {
        super(i10, l1Var, i11);
        int i13;
        this.f48743e = i2.g.d(i12, iVar.f48755t0) ? 1 : 0;
        b2.s sVar = this.d;
        int i14 = sVar.f2403y;
        int i15 = -1;
        if (i14 != -1 && (i13 = sVar.f2404z) != -1) {
            i15 = i14 * i13;
        }
        this.f48744f = i15;
    }

    @Override
    public final int a() {
        return this.f48743e;
    }

    @Override
    public final boolean b(n nVar) {
        f fVar = (f) nVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f48744f, ((f) obj).f48744f);
    }
}
