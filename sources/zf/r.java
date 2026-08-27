package zf;

public final class r implements o1.f {

    public final int f50670a;

    public final l0 f50671b;

    public final boolean f50672c;

    public r(l0 l0Var, boolean z10, int i10) {
        this.f50670a = i10;
        this.f50671b = l0Var;
        this.f50672c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f50670a) {
            case 0:
                l0 l0Var = this.f50671b;
                t1 t1Var = l0Var.f50530r1;
                if (hVar == l0Var.B1) {
                    l0Var.B1 = null;
                    if (!this.f50672c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                }
                break;
            default:
                l0 l0Var2 = this.f50671b;
                i0 i0Var = l0Var2.C1;
                if (hVar == l0Var2.I1) {
                    l0Var2.I1 = null;
                    if (!this.f50672c) {
                        i0Var.setVisibility(8);
                        yf.r0.e(l0Var2.L1).g();
                        i0Var.getAdapter().l();
                    }
                }
                break;
        }
    }
}
