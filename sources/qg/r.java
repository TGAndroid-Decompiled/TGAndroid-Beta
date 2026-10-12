package qg;
public final class r implements o1.f {
    public final int f46461a;
    public final m0 f46462b;
    public final boolean f46463c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f46461a = i10;
        this.f46462b = m0Var;
        this.f46463c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f46461a) {
            case 0:
                m0 m0Var = this.f46462b;
                t1 t1Var = m0Var.f46330v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f46463c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f46462b;
                j0 j0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f46463c) {
                        j0Var.setVisibility(8);
                        pg.t0.e(m0Var2.P1).g();
                        j0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
