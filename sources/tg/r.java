package tg;
public final class r implements r1.c {
    public final int f58151a;
    public final h0 f58152b;
    public final boolean f58153c;

    public r(h0 h0Var, boolean z10, int i7) {
        this.f58151a = i7;
        this.f58152b = h0Var;
        this.f58153c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f58151a) {
            case 0:
                h0 h0Var = this.f58152b;
                k1 k1Var = h0Var.f57913f1;
                if (gVar == h0Var.f57926p1) {
                    h0Var.f57926p1 = null;
                    if (!this.f58153c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f58152b;
                e0 e0Var = h0Var2.f57928q1;
                if (gVar == h0Var2.f57940w1) {
                    h0Var2.f57940w1 = null;
                    if (!this.f58153c) {
                        e0Var.setVisibility(8);
                        sg.k0.e(h0Var2.f57946z1).g();
                        e0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
