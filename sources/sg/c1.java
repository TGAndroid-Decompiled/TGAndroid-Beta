package sg;
public final class c1 extends e1 {
    public final int f57300f;
    public final b1 f57301g;
    public final f1 h;

    public c1(f1 f1Var, b1 b1Var, int i7) {
        this.f57300f = i7;
        this.h = f1Var;
        this.f57301g = b1Var;
    }

    @Override
    public final void a() {
        switch (this.f57300f) {
            case 0:
                w0 w0Var = this.h.h;
                float f10 = w0Var.f57518i;
                float f11 = w0Var.f57519j;
                this.d = f10;
                this.f57313e = f11;
                return;
            default:
                w0 w0Var2 = this.h.h;
                float f12 = w0Var2.d;
                float f13 = w0Var2.f57515e;
                this.d = f12;
                this.f57313e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f57300f) {
            case 0:
                w0 w0Var = this.h.h;
                w0Var.f57518i = f10;
                w0Var.f57519j = f11;
                this.d = f10;
                this.f57313e = f11;
                this.f57301g.a();
                return;
            default:
                w0 w0Var2 = this.h.h;
                w0Var2.d = f10;
                w0Var2.f57515e = f11;
                this.d = f10;
                this.f57313e = f11;
                this.f57301g.a();
                return;
        }
    }
}
