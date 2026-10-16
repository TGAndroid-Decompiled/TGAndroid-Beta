package rg;
public final class r implements o1.f {
    public final int f44283a;
    public final o0 f44284b;
    public final boolean f44285c;

    public r(o0 o0Var, boolean z10, int i10) {
        this.f44283a = i10;
        this.f44284b = o0Var;
        this.f44285c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f44283a) {
            case 0:
                o0 o0Var = this.f44284b;
                v1 v1Var = o0Var.f44192v1;
                if (hVar == o0Var.F1) {
                    o0Var.F1 = null;
                    if (!this.f44285c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                o0 o0Var2 = this.f44284b;
                k0 k0Var = o0Var2.G1;
                if (hVar == o0Var2.M1) {
                    o0Var2.M1 = null;
                    if (!this.f44285c) {
                        k0Var.setVisibility(8);
                        qg.s0.e(o0Var2.P1).g();
                        k0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
