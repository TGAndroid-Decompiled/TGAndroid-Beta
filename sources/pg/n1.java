package pg;
public final class n1 extends p1 {
    public final int f45596f;
    public final m1 f45597g;
    public final q1 h;

    public n1(q1 q1Var, m1 m1Var, int i10) {
        this.f45596f = i10;
        this.h = q1Var;
        this.f45597g = m1Var;
    }

    @Override
    public final void a() {
        switch (this.f45596f) {
            case 0:
                g1 g1Var = this.h.h;
                float f7 = g1Var.f45544i;
                float f10 = g1Var.f45545j;
                this.d = f7;
                this.f45611e = f10;
                return;
            default:
                g1 g1Var2 = this.h.h;
                float f11 = g1Var2.d;
                float f12 = g1Var2.f45541e;
                this.d = f11;
                this.f45611e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f45596f) {
            case 0:
                g1 g1Var = this.h.h;
                g1Var.f45544i = f7;
                g1Var.f45545j = f10;
                this.d = f7;
                this.f45611e = f10;
                this.f45597g.a();
                return;
            default:
                g1 g1Var2 = this.h.h;
                g1Var2.d = f7;
                g1Var2.f45541e = f10;
                this.d = f7;
                this.f45611e = f10;
                this.f45597g.a();
                return;
        }
    }
}
