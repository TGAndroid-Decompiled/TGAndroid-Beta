package tg;
public final class r implements r1.c {
    public final int f55929a;
    public final g0 f55930b;
    public final boolean f55931c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55929a = i7;
        this.f55930b = g0Var;
        this.f55931c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55929a) {
            case 0:
                g0 g0Var = this.f55930b;
                j1 j1Var = g0Var.f55681e1;
                if (gVar == g0Var.f55694o1) {
                    g0Var.f55694o1 = null;
                    if (!this.f55931c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55930b;
                d0 d0Var = g0Var2.f55696p1;
                if (gVar == g0Var2.f55708v1) {
                    g0Var2.f55708v1 = null;
                    if (!this.f55931c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55714y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
