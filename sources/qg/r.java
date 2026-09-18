package qg;
public final class r implements o1.f {
    public final int f41624a;
    public final p0 f41625b;
    public final boolean f41626c;

    public r(p0 p0Var, boolean z10, int i10) {
        this.f41624a = i10;
        this.f41625b = p0Var;
        this.f41626c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f41624a) {
            case 0:
                p0 p0Var = this.f41625b;
                w1 w1Var = p0Var.f41575v1;
                if (hVar == p0Var.F1) {
                    p0Var.F1 = null;
                    if (!this.f41626c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                p0 p0Var2 = this.f41625b;
                l0 l0Var = p0Var2.G1;
                if (hVar == p0Var2.M1) {
                    p0Var2.M1 = null;
                    if (!this.f41626c) {
                        l0Var.setVisibility(8);
                        pg.s0.e(p0Var2.P1).g();
                        l0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
