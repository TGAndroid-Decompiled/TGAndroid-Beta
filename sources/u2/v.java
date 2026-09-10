package u2;
public final class v extends s {
    public final int f42459f;

    public v(b2.k1 k1Var, int i10) {
        super(k1Var);
        this.f42459f = i10;
    }

    @Override
    public int e(int i10, int i11, boolean z10) {
        switch (this.f42459f) {
            case 0:
                b2.k1 k1Var = this.e;
                int e = k1Var.e(i10, i11, z10);
                if (e == -1) {
                    return k1Var.a(z10);
                }
                return e;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f42459f) {
            case 1:
                super.f(i10, h1Var, z10);
                h1Var.f1708f = true;
                return h1Var;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override
    public int k(int i10, int i11, boolean z10) {
        switch (this.f42459f) {
            case 0:
                b2.k1 k1Var = this.e;
                int k10 = k1Var.k(i10, i11, z10);
                if (k10 == -1) {
                    return k1Var.c(z10);
                }
                return k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f42459f) {
            case 1:
                super.m(i10, j1Var, j3);
                j1Var.f1758k = true;
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }
}
