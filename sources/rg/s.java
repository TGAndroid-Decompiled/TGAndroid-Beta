package rg;
public final class s implements o1.f {
    public final int f45502a;
    public final o0 f45503b;
    public final boolean f45504c;

    public s(o0 o0Var, boolean z10, int i10) {
        this.f45502a = i10;
        this.f45503b = o0Var;
        this.f45504c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f45502a) {
            case 0:
                o0 o0Var = this.f45503b;
                v1 v1Var = o0Var.f45399v1;
                if (hVar == o0Var.F1) {
                    o0Var.F1 = null;
                    if (!this.f45504c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                o0 o0Var2 = this.f45503b;
                l0 l0Var = o0Var2.G1;
                if (hVar == o0Var2.M1) {
                    o0Var2.M1 = null;
                    if (!this.f45504c) {
                        l0Var.setVisibility(8);
                        qg.s0.e(o0Var2.P1).g();
                        l0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
