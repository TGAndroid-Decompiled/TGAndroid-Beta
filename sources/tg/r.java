package tg;
public final class r implements r1.c {
    public final int f55826a;
    public final g0 f55827b;
    public final boolean f55828c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55826a = i7;
        this.f55827b = g0Var;
        this.f55828c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55826a) {
            case 0:
                g0 g0Var = this.f55827b;
                j1 j1Var = g0Var.f55578e1;
                if (gVar == g0Var.f55591o1) {
                    g0Var.f55591o1 = null;
                    if (!this.f55828c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55827b;
                d0 d0Var = g0Var2.f55593p1;
                if (gVar == g0Var2.f55605v1) {
                    g0Var2.f55605v1 = null;
                    if (!this.f55828c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55611y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
