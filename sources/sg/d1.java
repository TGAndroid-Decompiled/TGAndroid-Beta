package sg;
public final class d1 extends f1 {
    public final int f57223f;
    public final c1 f57224g;
    public final g1 h;

    public d1(g1 g1Var, c1 c1Var, int i7) {
        this.f57223f = i7;
        this.h = g1Var;
        this.f57224g = c1Var;
    }

    @Override
    public final void a() {
        switch (this.f57223f) {
            case 0:
                x0 x0Var = this.h.h;
                float f10 = x0Var.f57444i;
                float f11 = x0Var.f57445j;
                this.d = f10;
                this.f57236e = f11;
                return;
            default:
                x0 x0Var2 = this.h.h;
                float f12 = x0Var2.d;
                float f13 = x0Var2.f57441e;
                this.d = f12;
                this.f57236e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f57223f) {
            case 0:
                x0 x0Var = this.h.h;
                x0Var.f57444i = f10;
                x0Var.f57445j = f11;
                this.d = f10;
                this.f57236e = f11;
                this.f57224g.a();
                return;
            default:
                x0 x0Var2 = this.h.h;
                x0Var2.d = f10;
                x0Var2.f57441e = f11;
                this.d = f10;
                this.f57236e = f11;
                this.f57224g.a();
                return;
        }
    }
}
