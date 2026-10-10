package x2;

import b2.l1;
public final class f extends n implements Comparable {
    public final int f50533e;
    public final int f50534f;

    public f(int i10, l1 l1Var, int i11, i iVar, int i12) {
        super(i10, l1Var, i11);
        int i13;
        this.f50533e = hg.c.d(i12, iVar.f50545t0) ? 1 : 0;
        b2.s sVar = this.d;
        int i14 = sVar.f3649y;
        int i15 = -1;
        if (i14 != -1 && (i13 = sVar.f3650z) != -1) {
            i15 = i14 * i13;
        }
        this.f50534f = i15;
    }

    @Override
    public final int a() {
        return this.f50533e;
    }

    @Override
    public final boolean b(n nVar) {
        f fVar = (f) nVar;
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f50534f, ((f) obj).f50534f);
    }
}
