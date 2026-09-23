package qg;
public final class r implements o1.f {
    public final int f41549a;
    public final p0 f41550b;
    public final boolean f41551c;

    public r(p0 p0Var, boolean z10, int i10) {
        this.f41549a = i10;
        this.f41550b = p0Var;
        this.f41551c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f41549a) {
            case 0:
                p0 p0Var = this.f41550b;
                w1 w1Var = p0Var.f41500v1;
                if (hVar == p0Var.F1) {
                    p0Var.F1 = null;
                    if (!this.f41551c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                p0 p0Var2 = this.f41550b;
                l0 l0Var = p0Var2.G1;
                if (hVar == p0Var2.M1) {
                    p0Var2.M1 = null;
                    if (!this.f41551c) {
                        l0Var.setVisibility(8);
                        pg.t0.e(p0Var2.P1).g();
                        l0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
