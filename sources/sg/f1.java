package sg;
public final class f1 extends h1 {
    public final int f55050f;
    public final e1 f55051g;
    public final i1 h;

    public f1(i1 i1Var, e1 e1Var, int i7) {
        this.f55050f = i7;
        this.h = i1Var;
        this.f55051g = e1Var;
    }

    @Override
    public final void a() {
        switch (this.f55050f) {
            case 0:
                z0 z0Var = this.h.h;
                float f10 = z0Var.f55273i;
                float f11 = z0Var.f55274j;
                this.d = f10;
                this.f55066e = f11;
                return;
            default:
                z0 z0Var2 = this.h.h;
                float f12 = z0Var2.d;
                float f13 = z0Var2.f55270e;
                this.d = f12;
                this.f55066e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f55050f) {
            case 0:
                z0 z0Var = this.h.h;
                z0Var.f55273i = f10;
                z0Var.f55274j = f11;
                this.d = f10;
                this.f55066e = f11;
                this.f55051g.a();
                return;
            default:
                z0 z0Var2 = this.h.h;
                z0Var2.d = f10;
                z0Var2.f55270e = f11;
                this.d = f10;
                this.f55066e = f11;
                this.f55051g.a();
                return;
        }
    }
}
