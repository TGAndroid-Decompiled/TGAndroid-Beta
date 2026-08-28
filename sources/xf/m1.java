package xf;
public final class m1 extends o1 {
    public final int f49275f;
    public final l1 f49276g;
    public final p1 h;

    public m1(p1 p1Var, l1 l1Var, int i9) {
        this.f49275f = i9;
        this.h = p1Var;
        this.f49276g = l1Var;
    }

    @Override
    public final void a() {
        switch (this.f49275f) {
            case 0:
                f1 f1Var = this.h.h;
                float f10 = f1Var.f49225i;
                float f11 = f1Var.f49226j;
                this.d = f10;
                this.f49292e = f11;
                return;
            default:
                f1 f1Var2 = this.h.h;
                float f12 = f1Var2.d;
                float f13 = f1Var2.f49222e;
                this.d = f12;
                this.f49292e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f49275f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.f49225i = f10;
                f1Var.f49226j = f11;
                this.d = f10;
                this.f49292e = f11;
                this.f49276g.a();
                return;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f10;
                f1Var2.f49222e = f11;
                this.d = f10;
                this.f49292e = f11;
                this.f49276g.a();
                return;
        }
    }
}
