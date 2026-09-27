package pg;
public final class p1 extends r1 {
    public final int f41197f;
    public final o1 f41198g;
    public final s1 h;

    public p1(s1 s1Var, o1 o1Var, int i10) {
        this.f41197f = i10;
        this.h = s1Var;
        this.f41198g = o1Var;
    }

    @Override
    public final void a() {
        switch (this.f41197f) {
            case 0:
                i1 i1Var = this.h.h;
                float f7 = i1Var.f41143i;
                float f10 = i1Var.f41144j;
                this.d = f7;
                this.e = f10;
                return;
            default:
                i1 i1Var2 = this.h.h;
                float f11 = i1Var2.d;
                float f12 = i1Var2.e;
                this.d = f11;
                this.e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f41197f) {
            case 0:
                i1 i1Var = this.h.h;
                i1Var.f41143i = f7;
                i1Var.f41144j = f10;
                this.d = f7;
                this.e = f10;
                this.f41198g.a();
                return;
            default:
                i1 i1Var2 = this.h.h;
                i1Var2.d = f7;
                i1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f41198g.a();
                return;
        }
    }
}
