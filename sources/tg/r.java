package tg;
public final class r implements r1.c {
    public final int f57535a;
    public final g0 f57536b;
    public final boolean f57537c;

    public r(g0 g0Var, boolean z10, int i7) {
        this.f57535a = i7;
        this.f57536b = g0Var;
        this.f57537c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f57535a) {
            case 0:
                g0 g0Var = this.f57536b;
                j1 j1Var = g0Var.f57283f1;
                if (gVar == g0Var.f57296p1) {
                    g0Var.f57296p1 = null;
                    if (!this.f57537c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f57536b;
                d0 d0Var = g0Var2.f57298q1;
                if (gVar == g0Var2.f57310w1) {
                    g0Var2.f57310w1 = null;
                    if (!this.f57537c) {
                        d0Var.setVisibility(8);
                        sg.k0.e(g0Var2.f57316z1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
