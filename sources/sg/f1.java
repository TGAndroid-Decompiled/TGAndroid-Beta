package sg;
public final class f1 extends h1 {
    public final int f54957f;
    public final e1 f54958g;
    public final i1 h;

    public f1(i1 i1Var, e1 e1Var, int i7) {
        this.f54957f = i7;
        this.h = i1Var;
        this.f54958g = e1Var;
    }

    @Override
    public final void a() {
        switch (this.f54957f) {
            case 0:
                z0 z0Var = this.h.h;
                float f10 = z0Var.f55180i;
                float f11 = z0Var.f55181j;
                this.d = f10;
                this.f54973e = f11;
                return;
            default:
                z0 z0Var2 = this.h.h;
                float f12 = z0Var2.d;
                float f13 = z0Var2.f55177e;
                this.d = f12;
                this.f54973e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f54957f) {
            case 0:
                z0 z0Var = this.h.h;
                z0Var.f55180i = f10;
                z0Var.f55181j = f11;
                this.d = f10;
                this.f54973e = f11;
                this.f54958g.a();
                return;
            default:
                z0 z0Var2 = this.h.h;
                z0Var2.d = f10;
                z0Var2.f55177e = f11;
                this.d = f10;
                this.f54973e = f11;
                this.f54958g.a();
                return;
        }
    }
}
