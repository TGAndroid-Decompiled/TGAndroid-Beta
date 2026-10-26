package sg;
public final class r implements o1.f {
    public final int f48482a;
    public final n0 f48483b;
    public final boolean f48484c;

    public r(n0 n0Var, boolean z10, int i10) {
        this.f48482a = i10;
        this.f48483b = n0Var;
        this.f48484c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f48482a) {
            case 0:
                n0 n0Var = this.f48483b;
                v1 v1Var = n0Var.f48344k1;
                if (hVar == n0Var.f48359u1) {
                    n0Var.f48359u1 = null;
                    if (!this.f48484c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                n0 n0Var2 = this.f48483b;
                k0 k0Var = n0Var2.f48361v1;
                if (hVar == n0Var2.B1) {
                    n0Var2.B1 = null;
                    if (!this.f48484c) {
                        k0Var.setVisibility(8);
                        rg.s0.e(n0Var2.E1).g();
                        k0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
