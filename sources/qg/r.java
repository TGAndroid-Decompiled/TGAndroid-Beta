package qg;
public final class r implements o1.f {
    public final int f46637a;
    public final m0 f46638b;
    public final boolean f46639c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f46637a = i10;
        this.f46638b = m0Var;
        this.f46639c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f46637a) {
            case 0:
                m0 m0Var = this.f46638b;
                t1 t1Var = m0Var.f46522v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f46639c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f46638b;
                j0 j0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f46639c) {
                        j0Var.setVisibility(8);
                        pg.u0.e(m0Var2.P1).g();
                        j0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
