package tg;
public final class r implements r1.c {
    public final int f58103a;
    public final g0 f58104b;
    public final boolean f58105c;

    public r(g0 g0Var, boolean z10, int i7) {
        this.f58103a = i7;
        this.f58104b = g0Var;
        this.f58105c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f58103a) {
            case 0:
                g0 g0Var = this.f58104b;
                j1 j1Var = g0Var.f57855f1;
                if (gVar == g0Var.f57868p1) {
                    g0Var.f57868p1 = null;
                    if (!this.f58105c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f58104b;
                d0 d0Var = g0Var2.f57870q1;
                if (gVar == g0Var2.f57882w1) {
                    g0Var2.f57882w1 = null;
                    if (!this.f58105c) {
                        d0Var.setVisibility(8);
                        sg.k0.e(g0Var2.f57888z1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
