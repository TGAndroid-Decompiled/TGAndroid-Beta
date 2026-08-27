package yf;

public final class l1 extends n1 {

    public final int f49977f;

    public final k1 f49978g;
    public final o1 h;

    public l1(o1 o1Var, k1 k1Var, int i10) {
        this.f49977f = i10;
        this.h = o1Var;
        this.f49978g = k1Var;
    }

    @Override
    public final void a() {
        switch (this.f49977f) {
            case 0:
                e1 e1Var = this.h.h;
                float f10 = e1Var.f49927i;
                float f11 = e1Var.f49928j;
                this.d = f10;
                this.f49992e = f11;
                break;
            default:
                e1 e1Var2 = this.h.h;
                float f12 = e1Var2.d;
                float f13 = e1Var2.f49924e;
                this.d = f12;
                this.f49992e = f13;
                break;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f49977f) {
            case 0:
                e1 e1Var = this.h.h;
                e1Var.f49927i = f10;
                e1Var.f49928j = f11;
                this.d = f10;
                this.f49992e = f11;
                this.f49978g.a();
                break;
            default:
                e1 e1Var2 = this.h.h;
                e1Var2.d = f10;
                e1Var2.f49924e = f11;
                this.d = f10;
                this.f49992e = f11;
                this.f49978g.a();
                break;
        }
    }
}
