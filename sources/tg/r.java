package tg;
public final class r implements r1.c {
    public final int f55930a;
    public final g0 f55931b;
    public final boolean f55932c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55930a = i7;
        this.f55931b = g0Var;
        this.f55932c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55930a) {
            case 0:
                g0 g0Var = this.f55931b;
                j1 j1Var = g0Var.f55682e1;
                if (gVar == g0Var.f55695o1) {
                    g0Var.f55695o1 = null;
                    if (!this.f55932c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55931b;
                d0 d0Var = g0Var2.f55697p1;
                if (gVar == g0Var2.f55709v1) {
                    g0Var2.f55709v1 = null;
                    if (!this.f55932c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55715y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
