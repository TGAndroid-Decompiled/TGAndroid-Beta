package rg;
public final class r implements o1.f {
    public final int f45606a;
    public final m0 f45607b;
    public final boolean f45608c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f45606a = i10;
        this.f45607b = m0Var;
        this.f45608c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f45606a) {
            case 0:
                m0 m0Var = this.f45607b;
                t1 t1Var = m0Var.f45496v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f45608c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f45607b;
                i0 i0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f45608c) {
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
