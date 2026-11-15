package tg;
public final class r implements r1.c {
    public final int f57533a;
    public final g0 f57534b;
    public final boolean f57535c;

    public r(g0 g0Var, boolean z10, int i7) {
        this.f57533a = i7;
        this.f57534b = g0Var;
        this.f57535c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f57533a) {
            case 0:
                g0 g0Var = this.f57534b;
                j1 j1Var = g0Var.f57273f1;
                if (gVar == g0Var.f57286p1) {
                    g0Var.f57286p1 = null;
                    if (!this.f57535c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g0 g0Var2 = this.f57534b;
                d0 d0Var = g0Var2.f57288q1;
                if (gVar == g0Var2.f57300w1) {
                    g0Var2.f57300w1 = null;
                    if (!this.f57535c) {
                        d0Var.setVisibility(8);
                        sg.k0.e(g0Var2.f57306z1).g();
                        d0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
