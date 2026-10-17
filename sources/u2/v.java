package u2;
public final class v extends s {
    public final int f47467f;

    public v(b2.o1 o1Var, int i10) {
        super(o1Var);
        this.f47467f = i10;
    }

    @Override
    public int e(int i10, int i11, boolean z10) {
        switch (this.f47467f) {
            case 0:
                b2.o1 o1Var = this.e;
                int e = o1Var.e(i10, i11, z10);
                if (e == -1) {
                    return o1Var.a(z10);
                }
                return e;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override
    public b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        switch (this.f47467f) {
            case 1:
                super.f(i10, l1Var, z10);
                l1Var.f3826f = true;
                return l1Var;
            default:
                return super.f(i10, l1Var, z10);
        }
    }

    @Override
    public int k(int i10, int i11, boolean z10) {
        switch (this.f47467f) {
            case 0:
                b2.o1 o1Var = this.e;
                int k10 = o1Var.k(i10, i11, z10);
                if (k10 == -1) {
                    return o1Var.c(z10);
                }
                return k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override
    public b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        switch (this.f47467f) {
            case 1:
                super.m(i10, n1Var, j10);
                n1Var.f3877k = true;
                return n1Var;
            default:
                return super.m(i10, n1Var, j10);
        }
    }
}
