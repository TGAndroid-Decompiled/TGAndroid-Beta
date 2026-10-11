package pg;
public final class o1 extends q1 {
    public final int f45748f;
    public final n1 f45749g;
    public final r1 h;

    public o1(r1 r1Var, n1 n1Var, int i10) {
        this.f45748f = i10;
        this.h = r1Var;
        this.f45749g = n1Var;
    }

    @Override
    public final void a() {
        switch (this.f45748f) {
            case 0:
                h1 h1Var = this.h.h;
                float f7 = h1Var.f45693i;
                float f10 = h1Var.f45694j;
                this.d = f7;
                this.f45762e = f10;
                return;
            default:
                h1 h1Var2 = this.h.h;
                float f11 = h1Var2.d;
                float f12 = h1Var2.f45690e;
                this.d = f11;
                this.f45762e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f45748f) {
            case 0:
                h1 h1Var = this.h.h;
                h1Var.f45693i = f7;
                h1Var.f45694j = f10;
                this.d = f7;
                this.f45762e = f10;
                this.f45749g.a();
                return;
            default:
                h1 h1Var2 = this.h.h;
                h1Var2.d = f7;
                h1Var2.f45690e = f10;
                this.d = f7;
                this.f45762e = f10;
                this.f45749g.a();
                return;
        }
    }
}
