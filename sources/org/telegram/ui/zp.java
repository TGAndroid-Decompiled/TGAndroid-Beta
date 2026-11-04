package org.telegram.ui;
public final class zp extends u4.k {
    public final g2.g F = new g2.g((int[]) null);
    public final nq G;

    public zp(nq nqVar) {
        this.G = nqVar;
    }

    @Override
    public final void N() {
        this.F.e();
    }

    @Override
    public final void O() {
        this.G.f48052c.invalidate();
    }

    @Override
    public final void P(u4.d1 d1Var) {
        this.G.f48052c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f55598p.isEmpty();
        boolean isEmpty2 = this.f55600r.isEmpty();
        boolean isEmpty3 = this.f55601s.isEmpty();
        boolean isEmpty4 = this.f55599q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
