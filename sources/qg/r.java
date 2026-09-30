package qg;
public final class r implements o1.f {
    public final int f42004a;
    public final n0 f42005b;
    public final boolean f42006c;

    public r(n0 n0Var, boolean z10, int i10) {
        this.f42004a = i10;
        this.f42005b = n0Var;
        this.f42006c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f42004a) {
            case 0:
                n0 n0Var = this.f42005b;
                u1 u1Var = n0Var.f41904v1;
                if (hVar == n0Var.F1) {
                    n0Var.F1 = null;
                    if (!this.f42006c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                n0 n0Var2 = this.f42005b;
                k0 k0Var = n0Var2.G1;
                if (hVar == n0Var2.M1) {
                    n0Var2.M1 = null;
                    if (!this.f42006c) {
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
