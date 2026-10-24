package rg;
public final class r implements o1.f {
    public final int f46043a;
    public final m0 f46044b;
    public final boolean f46045c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f46043a = i10;
        this.f46044b = m0Var;
        this.f46045c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f46043a) {
            case 0:
                m0 m0Var = this.f46044b;
                u1 u1Var = m0Var.f45915v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f46045c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f46044b;
                j0 j0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f46045c) {
                        j0Var.setVisibility(8);
                        qg.u0.e(m0Var2.P1).g();
                        j0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
