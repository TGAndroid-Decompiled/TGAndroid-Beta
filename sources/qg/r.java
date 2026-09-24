package qg;
public final class r implements o1.f {
    public final int f41889a;
    public final n0 f41890b;
    public final boolean f41891c;

    public r(n0 n0Var, boolean z10, int i10) {
        this.f41889a = i10;
        this.f41890b = n0Var;
        this.f41891c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f41889a) {
            case 0:
                n0 n0Var = this.f41890b;
                u1 u1Var = n0Var.f41789v1;
                if (hVar == n0Var.F1) {
                    n0Var.F1 = null;
                    if (!this.f41891c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                n0 n0Var2 = this.f41890b;
                k0 k0Var = n0Var2.G1;
                if (hVar == n0Var2.M1) {
                    n0Var2.M1 = null;
                    if (!this.f41891c) {
                        k0Var.setVisibility(8);
                        pg.u0.e(n0Var2.P1).g();
                        k0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
