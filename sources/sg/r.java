package sg;
public final class r implements o1.f {
    public final int f48479a;
    public final n0 f48480b;
    public final boolean f48481c;

    public r(n0 n0Var, boolean z10, int i10) {
        this.f48479a = i10;
        this.f48480b = n0Var;
        this.f48481c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f48479a) {
            case 0:
                n0 n0Var = this.f48480b;
                v1 v1Var = n0Var.f48341k1;
                if (hVar == n0Var.f48356u1) {
                    n0Var.f48356u1 = null;
                    if (!this.f48481c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                n0 n0Var2 = this.f48480b;
                k0 k0Var = n0Var2.f48358v1;
                if (hVar == n0Var2.B1) {
                    n0Var2.B1 = null;
                    if (!this.f48481c) {
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
