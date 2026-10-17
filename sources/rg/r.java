package rg;
public final class r implements o1.f {
    public final int f45634a;
    public final m0 f45635b;
    public final boolean f45636c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f45634a = i10;
        this.f45635b = m0Var;
        this.f45636c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f45634a) {
            case 0:
                m0 m0Var = this.f45635b;
                t1 t1Var = m0Var.f45525v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f45636c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f45635b;
                i0 i0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f45636c) {
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
