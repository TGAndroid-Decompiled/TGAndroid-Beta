package tg;
public final class r implements r1.c {
    public final int f58147a;
    public final h0 f58148b;
    public final boolean f58149c;

    public r(h0 h0Var, boolean z10, int i7) {
        this.f58147a = i7;
        this.f58148b = h0Var;
        this.f58149c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f58147a) {
            case 0:
                h0 h0Var = this.f58148b;
                k1 k1Var = h0Var.f57909f1;
                if (gVar == h0Var.f57922p1) {
                    h0Var.f57922p1 = null;
                    if (!this.f58149c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f58148b;
                e0 e0Var = h0Var2.f57924q1;
                if (gVar == h0Var2.f57936w1) {
                    h0Var2.f57936w1 = null;
                    if (!this.f58149c) {
                        e0Var.setVisibility(8);
                        sg.k0.e(h0Var2.f57942z1).g();
                        e0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
