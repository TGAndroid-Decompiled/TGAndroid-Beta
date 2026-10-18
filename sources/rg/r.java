package rg;
public final class r implements o1.f {
    public final int f45607a;
    public final m0 f45608b;
    public final boolean f45609c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f45607a = i10;
        this.f45608b = m0Var;
        this.f45609c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f45607a) {
            case 0:
                m0 m0Var = this.f45608b;
                t1 t1Var = m0Var.f45499v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f45609c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f45608b;
                i0 i0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f45609c) {
                        i0Var.setVisibility(8);
                        qg.u0.e(m0Var2.P1).g();
                        i0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
