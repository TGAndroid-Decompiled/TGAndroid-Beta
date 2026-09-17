package qg;
public final class m1 extends o1 {
    public final int f44485f;
    public final l1 f44486g;
    public final p1 h;

    public m1(p1 p1Var, l1 l1Var, int i10) {
        this.f44485f = i10;
        this.h = p1Var;
        this.f44486g = l1Var;
    }

    @Override
    public final void a() {
        switch (this.f44485f) {
            case 0:
                f1 f1Var = this.h.h;
                float f7 = f1Var.f44434i;
                float f10 = f1Var.f44435j;
                this.d = f7;
                this.f44501e = f10;
                return;
            default:
                f1 f1Var2 = this.h.h;
                float f11 = f1Var2.d;
                float f12 = f1Var2.f44431e;
                this.d = f11;
                this.f44501e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f44485f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.f44434i = f7;
                f1Var.f44435j = f10;
                this.d = f7;
                this.f44501e = f10;
                this.f44486g.a();
                return;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f7;
                f1Var2.f44431e = f10;
                this.d = f7;
                this.f44501e = f10;
                this.f44486g.a();
                return;
        }
    }
}
