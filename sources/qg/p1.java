package qg;
public final class p1 extends r1 {
    public final int f44598f;
    public final o1 f44599g;
    public final s1 h;

    public p1(s1 s1Var, o1 o1Var, int i10) {
        this.f44598f = i10;
        this.h = s1Var;
        this.f44599g = o1Var;
    }

    @Override
    public final void a() {
        switch (this.f44598f) {
            case 0:
                i1 i1Var = this.h.h;
                float f7 = i1Var.f44543i;
                float f10 = i1Var.f44544j;
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
        switch (this.f44598f) {
            case 0:
                i1 i1Var = this.h.h;
                i1Var.f44543i = f7;
                i1Var.f44544j = f10;
                this.d = f7;
                this.e = f10;
                this.f44599g.a();
                return;
            default:
                i1 i1Var2 = this.h.h;
                i1Var2.d = f7;
                i1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f44599g.a();
                return;
        }
    }
}
