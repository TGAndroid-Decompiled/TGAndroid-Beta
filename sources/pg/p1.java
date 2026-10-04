package pg;
public final class p1 extends r1 {
    public final int f44558f;
    public final o1 f44559g;
    public final s1 h;

    public p1(s1 s1Var, o1 o1Var, int i10) {
        this.f44558f = i10;
        this.h = s1Var;
        this.f44559g = o1Var;
    }

    @Override
    public final void a() {
        switch (this.f44558f) {
            case 0:
                i1 i1Var = this.h.h;
                float f7 = i1Var.f44501i;
                float f10 = i1Var.f44502j;
                this.d = f7;
                this.f44576e = f10;
                return;
            default:
                i1 i1Var2 = this.h.h;
                float f11 = i1Var2.d;
                float f12 = i1Var2.f44498e;
                this.d = f11;
                this.f44576e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f44558f) {
            case 0:
                i1 i1Var = this.h.h;
                i1Var.f44501i = f7;
                i1Var.f44502j = f10;
                this.d = f7;
                this.f44576e = f10;
                this.f44559g.a();
                return;
            default:
                i1 i1Var2 = this.h.h;
                i1Var2.d = f7;
                i1Var2.f44498e = f10;
                this.d = f7;
                this.f44576e = f10;
                this.f44559g.a();
                return;
        }
    }
}
