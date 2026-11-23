package sg;
public final class d1 extends f1 {
    public final int f57227f;
    public final c1 f57228g;
    public final g1 h;

    public d1(g1 g1Var, c1 c1Var, int i7) {
        this.f57227f = i7;
        this.h = g1Var;
        this.f57228g = c1Var;
    }

    @Override
    public final void a() {
        switch (this.f57227f) {
            case 0:
                x0 x0Var = this.h.h;
                float f10 = x0Var.f57448i;
                float f11 = x0Var.f57449j;
                this.d = f10;
                this.f57240e = f11;
                return;
            default:
                x0 x0Var2 = this.h.h;
                float f12 = x0Var2.d;
                float f13 = x0Var2.f57445e;
                this.d = f12;
                this.f57240e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f57227f) {
            case 0:
                x0 x0Var = this.h.h;
                x0Var.f57448i = f10;
                x0Var.f57449j = f11;
                this.d = f10;
                this.f57240e = f11;
                this.f57228g.a();
                return;
            default:
                x0 x0Var2 = this.h.h;
                x0Var2.d = f10;
                x0Var2.f57445e = f11;
                this.d = f10;
                this.f57240e = f11;
                this.f57228g.a();
                return;
        }
    }
}
