package rg;
public final class r implements o1.f {
    public final int f45619a;
    public final m0 f45620b;
    public final boolean f45621c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f45619a = i10;
        this.f45620b = m0Var;
        this.f45621c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f45619a) {
            case 0:
                m0 m0Var = this.f45620b;
                t1 t1Var = m0Var.f45509v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f45621c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f45620b;
                i0 i0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f45621c) {
                        i0Var.setVisibility(8);
                        qg.v0.e(m0Var2.P1).g();
                        i0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
