package tg;
public final class r implements r1.c {
    public final int f58116a;
    public final h0 f58117b;
    public final boolean f58118c;

    public r(h0 h0Var, boolean z10, int i7) {
        this.f58116a = i7;
        this.f58117b = h0Var;
        this.f58118c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f58116a) {
            case 0:
                h0 h0Var = this.f58117b;
                k1 k1Var = h0Var.f57878f1;
                if (gVar == h0Var.f57891p1) {
                    h0Var.f57891p1 = null;
                    if (!this.f58118c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f58117b;
                e0 e0Var = h0Var2.f57893q1;
                if (gVar == h0Var2.f57905w1) {
                    h0Var2.f57905w1 = null;
                    if (!this.f58118c) {
                        e0Var.setVisibility(8);
                        sg.k0.e(h0Var2.f57911z1).g();
                        e0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
