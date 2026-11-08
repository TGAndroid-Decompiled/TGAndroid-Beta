package tg;
public final class r implements r1.c {
    public final int f55918a;
    public final g0 f55919b;
    public final boolean f55920c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55918a = i7;
        this.f55919b = g0Var;
        this.f55920c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55918a) {
            case 0:
                g0 g0Var = this.f55919b;
                j1 j1Var = g0Var.f55670e1;
                if (gVar == g0Var.f55683o1) {
                    g0Var.f55683o1 = null;
                    if (!this.f55920c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55919b;
                d0 d0Var = g0Var2.f55685p1;
                if (gVar == g0Var2.f55697v1) {
                    g0Var2.f55697v1 = null;
                    if (!this.f55920c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55703y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
