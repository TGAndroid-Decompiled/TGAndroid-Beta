package qg;
public final class m1 extends o1 {
    public final int f44512f;
    public final l1 f44513g;
    public final p1 h;

    public m1(p1 p1Var, l1 l1Var, int i10) {
        this.f44512f = i10;
        this.h = p1Var;
        this.f44513g = l1Var;
    }

    @Override
    public final void a() {
        switch (this.f44512f) {
            case 0:
                f1 f1Var = this.h.h;
                float f7 = f1Var.f44461i;
                float f10 = f1Var.f44462j;
                this.d = f7;
                this.f44528e = f10;
                return;
            default:
                f1 f1Var2 = this.h.h;
                float f11 = f1Var2.d;
                float f12 = f1Var2.f44458e;
                this.d = f11;
                this.f44528e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f44512f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.f44461i = f7;
                f1Var.f44462j = f10;
                this.d = f7;
                this.f44528e = f10;
                this.f44513g.a();
                return;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f7;
                f1Var2.f44458e = f10;
                this.d = f7;
                this.f44528e = f10;
                this.f44513g.a();
                return;
        }
    }
}
