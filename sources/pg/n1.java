package pg;
public final class n1 extends p1 {
    public final int f40871f;
    public final m1 f40872g;
    public final q1 h;

    public n1(q1 q1Var, m1 m1Var, int i10) {
        this.f40871f = i10;
        this.h = q1Var;
        this.f40872g = m1Var;
    }

    @Override
    public final void a() {
        switch (this.f40871f) {
            case 0:
                g1 g1Var = this.h.h;
                float f7 = g1Var.f40821i;
                float f10 = g1Var.f40822j;
                this.d = f7;
                this.e = f10;
                return;
            default:
                g1 g1Var2 = this.h.h;
                float f11 = g1Var2.d;
                float f12 = g1Var2.e;
                this.d = f11;
                this.e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f40871f) {
            case 0:
                g1 g1Var = this.h.h;
                g1Var.f40821i = f7;
                g1Var.f40822j = f10;
                this.d = f7;
                this.e = f10;
                this.f40872g.a();
                return;
            default:
                g1 g1Var2 = this.h.h;
                g1Var2.d = f7;
                g1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f40872g.a();
                return;
        }
    }
}
