package tg;
public final class r implements r1.c {
    public final int f55917a;
    public final g0 f55918b;
    public final boolean f55919c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55917a = i7;
        this.f55918b = g0Var;
        this.f55919c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55917a) {
            case 0:
                g0 g0Var = this.f55918b;
                j1 j1Var = g0Var.f55669e1;
                if (gVar == g0Var.f55682o1) {
                    g0Var.f55682o1 = null;
                    if (!this.f55919c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55918b;
                d0 d0Var = g0Var2.f55684p1;
                if (gVar == g0Var2.f55696v1) {
                    g0Var2.f55696v1 = null;
                    if (!this.f55919c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55702y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
