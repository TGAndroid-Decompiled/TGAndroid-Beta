package qg;
public final class r implements o1.f {
    public final int f45304a;
    public final m0 f45305b;
    public final boolean f45306c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f45304a = i10;
        this.f45305b = m0Var;
        this.f45306c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f45304a) {
            case 0:
                m0 m0Var = this.f45305b;
                t1 t1Var = m0Var.f45189v1;
                if (hVar == m0Var.F1) {
                    m0Var.F1 = null;
                    if (!this.f45306c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f45305b;
                j0 j0Var = m0Var2.G1;
                if (hVar == m0Var2.M1) {
                    m0Var2.M1 = null;
                    if (!this.f45306c) {
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
