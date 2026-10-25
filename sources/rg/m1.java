package rg;
public final class m1 extends o1 {
    public final int f47466f;
    public final l1 f47467g;
    public final p1 h;

    public m1(p1 p1Var, l1 l1Var, int i10) {
        this.f47466f = i10;
        this.h = p1Var;
        this.f47467g = l1Var;
    }

    @Override
    public final void a() {
        switch (this.f47466f) {
            case 0:
                f1 f1Var = this.h.h;
                float f7 = f1Var.f47417i;
                float f10 = f1Var.f47418j;
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
        switch (this.f47466f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.f47417i = f7;
                f1Var.f47418j = f10;
                this.d = f7;
                this.e = f10;
                this.f47467g.a();
                return;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f7;
                f1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f47467g.a();
                return;
        }
    }
}
