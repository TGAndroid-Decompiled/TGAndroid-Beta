package yf;
public final class r implements o1.f {
    public final int f50075a;
    public final l0 f50076b;
    public final boolean f50077c;

    public r(l0 l0Var, boolean z10, int i9) {
        this.f50075a = i9;
        this.f50076b = l0Var;
        this.f50077c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f50075a) {
            case 0:
                l0 l0Var = this.f50076b;
                t1 t1Var = l0Var.f49952r1;
                if (hVar == l0Var.B1) {
                    l0Var.B1 = null;
                    if (!this.f50077c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                l0 l0Var2 = this.f50076b;
                i0 i0Var = l0Var2.C1;
                if (hVar == l0Var2.I1) {
                    l0Var2.I1 = null;
                    if (!this.f50077c) {
                        i0Var.setVisibility(8);
                        xf.s0.e(l0Var2.L1).g();
                        i0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
