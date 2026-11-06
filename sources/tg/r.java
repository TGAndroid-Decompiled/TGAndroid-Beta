package tg;
public final class r implements r1.c {
    public final int f55801a;
    public final g0 f55802b;
    public final boolean f55803c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55801a = i7;
        this.f55802b = g0Var;
        this.f55803c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55801a) {
            case 0:
                g0 g0Var = this.f55802b;
                j1 j1Var = g0Var.f55553e1;
                if (gVar == g0Var.f55566o1) {
                    g0Var.f55566o1 = null;
                    if (!this.f55803c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55802b;
                d0 d0Var = g0Var2.f55568p1;
                if (gVar == g0Var2.f55580v1) {
                    g0Var2.f55580v1 = null;
                    if (!this.f55803c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55586y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
