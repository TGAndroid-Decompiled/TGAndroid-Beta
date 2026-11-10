package sg;
public final class e1 extends g1 {
    public final int f55057f;
    public final d1 f55058g;
    public final h1 h;

    public e1(h1 h1Var, d1 d1Var, int i7) {
        this.f55057f = i7;
        this.h = h1Var;
        this.f55058g = d1Var;
    }

    @Override
    public final void a() {
        switch (this.f55057f) {
            case 0:
                y0 y0Var = this.h.h;
                float f10 = y0Var.f55280i;
                float f11 = y0Var.f55281j;
                this.d = f10;
                this.f55072e = f11;
                return;
            default:
                y0 y0Var2 = this.h.h;
                float f12 = y0Var2.d;
                float f13 = y0Var2.f55277e;
                this.d = f12;
                this.f55072e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f55057f) {
            case 0:
                y0 y0Var = this.h.h;
                y0Var.f55280i = f10;
                y0Var.f55281j = f11;
                this.d = f10;
                this.f55072e = f11;
                this.f55058g.a();
                return;
            default:
                y0 y0Var2 = this.h.h;
                y0Var2.d = f10;
                y0Var2.f55277e = f11;
                this.d = f10;
                this.f55072e = f11;
                this.f55058g.a();
                return;
        }
    }
}
