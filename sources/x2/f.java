package x2;

import b2.l1;
public final class f extends n implements Comparable {
    public final int f50611e;
    public final int f50612f;

    public f(int i10, l1 l1Var, int i11, i iVar, int i12) {
        super(i10, l1Var, i11);
        int i13;
        this.f50611e = hg.c.d(i12, iVar.f50623t0) ? 1 : 0;
        b2.s sVar = this.d;
        int i14 = sVar.f3649y;
        int i15 = -1;
        if (i14 != -1 && (i13 = sVar.f3650z) != -1) {
            i15 = i14 * i13;
        }
        this.f50612f = i15;
    }

    @Override
    public final int a() {
        return this.f50611e;
    }

    @Override
    public final boolean b(n nVar) {
        f fVar = (f) nVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f50612f, ((f) obj).f50612f);
    }
}
