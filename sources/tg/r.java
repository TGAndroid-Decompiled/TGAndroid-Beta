package tg;
public final class r implements r1.c {
    public final int f55825a;
    public final g0 f55826b;
    public final boolean f55827c;

    public r(g0 g0Var, boolean z9, int i7) {
        this.f55825a = i7;
        this.f55826b = g0Var;
        this.f55827c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55825a) {
            case 0:
                g0 g0Var = this.f55826b;
                j1 j1Var = g0Var.f55577e1;
                if (gVar == g0Var.f55590o1) {
                    g0Var.f55590o1 = null;
                    if (!this.f55827c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f55826b;
                d0 d0Var = g0Var2.f55592p1;
                if (gVar == g0Var2.f55604v1) {
                    g0Var2.f55604v1 = null;
                    if (!this.f55827c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.f55610y1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
