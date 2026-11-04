package tg;
public final class d1 extends f1 {
    public final int f55150f;
    public final c1 f55151g;
    public final g1 h;

    public d1(g1 g1Var, c1 c1Var, int i3) {
        this.f55150f = i3;
        this.h = g1Var;
        this.f55151g = c1Var;
    }

    @Override
    public final void a() {
        switch (this.f55150f) {
            case 0:
                x0 x0Var = this.h.h;
                float f10 = x0Var.f55370i;
                float f11 = x0Var.f55371j;
                this.d = f10;
                this.f55163e = f11;
                return;
            default:
                x0 x0Var2 = this.h.h;
                float f12 = x0Var2.d;
                float f13 = x0Var2.f55367e;
                this.d = f12;
                this.f55163e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f55150f) {
            case 0:
                x0 x0Var = this.h.h;
                x0Var.f55370i = f10;
                x0Var.f55371j = f11;
                this.d = f10;
                this.f55163e = f11;
                this.f55151g.a();
                return;
            default:
                x0 x0Var2 = this.h.h;
                x0Var2.d = f10;
                x0Var2.f55367e = f11;
                this.d = f10;
                this.f55163e = f11;
                this.f55151g.a();
                return;
        }
    }
}
