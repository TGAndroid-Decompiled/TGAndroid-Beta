package pg;
public final class o1 extends q1 {
    public final int f45758f;
    public final n1 f45759g;
    public final r1 h;

    public o1(r1 r1Var, n1 n1Var, int i10) {
        this.f45758f = i10;
        this.h = r1Var;
        this.f45759g = n1Var;
    }

    @Override
    public final void a() {
        switch (this.f45758f) {
            case 0:
                h1 h1Var = this.h.h;
                float f7 = h1Var.f45703i;
                float f10 = h1Var.f45704j;
                this.d = f7;
                this.f45772e = f10;
                return;
            default:
                h1 h1Var2 = this.h.h;
                float f11 = h1Var2.d;
                float f12 = h1Var2.f45700e;
                this.d = f11;
                this.f45772e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f45758f) {
            case 0:
                h1 h1Var = this.h.h;
                h1Var.f45703i = f7;
                h1Var.f45704j = f10;
                this.d = f7;
                this.f45772e = f10;
                this.f45759g.a();
                return;
            default:
                h1 h1Var2 = this.h.h;
                h1Var2.d = f7;
                h1Var2.f45700e = f10;
                this.d = f7;
                this.f45772e = f10;
                this.f45759g.a();
                return;
        }
    }
}
