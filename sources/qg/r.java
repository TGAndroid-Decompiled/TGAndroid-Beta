package qg;
public final class r implements o1.f {
    public final int f41905a;
    public final n0 f41906b;
    public final boolean f41907c;

    public r(n0 n0Var, boolean z10, int i10) {
        this.f41905a = i10;
        this.f41906b = n0Var;
        this.f41907c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f41905a) {
            case 0:
                n0 n0Var = this.f41906b;
                u1 u1Var = n0Var.f41805v1;
                if (hVar == n0Var.F1) {
                    n0Var.F1 = null;
                    if (!this.f41907c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                n0 n0Var2 = this.f41906b;
                k0 k0Var = n0Var2.G1;
                if (hVar == n0Var2.M1) {
                    n0Var2.M1 = null;
                    if (!this.f41907c) {
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
