package x2;
public final class u extends r {
    public final int f58490f;

    public u(e2.l1 l1Var, int i7) {
        super(l1Var);
        this.f58490f = i7;
    }

    @Override
    public int e(int i7, int i10, boolean z9) {
        switch (this.f58490f) {
            case 0:
                e2.l1 l1Var = this.f58462e;
                int e10 = l1Var.e(i7, i10, z9);
                if (e10 == -1) {
                    return l1Var.a(z9);
                }
                return e10;
            default:
                return super.e(i7, i10, z9);
        }
    }

    @Override
    public e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        switch (this.f58490f) {
            case 1:
                super.f(i7, i1Var, z9);
                i1Var.f10289f = true;
                return i1Var;
            default:
                return super.f(i7, i1Var, z9);
        }
    }

    @Override
    public int k(int i7, int i10, boolean z9) {
        switch (this.f58490f) {
            case 0:
                e2.l1 l1Var = this.f58462e;
                int k10 = l1Var.k(i7, i10, z9);
                if (k10 == -1) {
                    return l1Var.c(z9);
                }
                return k10;
            default:
                return super.k(i7, i10, z9);
        }
    }

    @Override
    public e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        switch (this.f58490f) {
            case 1:
                super.m(i7, k1Var, j3);
                k1Var.f10337k = true;
                return k1Var;
            default:
                return super.m(i7, k1Var, j3);
        }
    }
}
