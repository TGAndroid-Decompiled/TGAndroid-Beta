package pg;
public final class m1 extends o1 {
    public final int f40943f;
    public final l1 f40944g;
    public final p1 h;

    public m1(p1 p1Var, l1 l1Var, int i10) {
        this.f40943f = i10;
        this.h = p1Var;
        this.f40944g = l1Var;
    }

    @Override
    public final void a() {
        switch (this.f40943f) {
            case 0:
                f1 f1Var = this.h.h;
                float f7 = f1Var.f40894i;
                float f10 = f1Var.f40895j;
                this.d = f7;
                this.e = f10;
                return;
            default:
                f1 f1Var2 = this.h.h;
                float f11 = f1Var2.d;
                float f12 = f1Var2.e;
                this.d = f11;
                this.e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f40943f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.f40894i = f7;
                f1Var.f40895j = f10;
                this.d = f7;
                this.e = f10;
                this.f40944g.a();
                return;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f7;
                f1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f40944g.a();
                return;
        }
    }
}
