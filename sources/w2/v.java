package w2;
public final class v extends s {
    public final int f57238f;

    public v(d2.n1 n1Var, int i3) {
        super(n1Var);
        this.f57238f = i3;
    }

    @Override
    public int e(int i3, int i10, boolean z10) {
        switch (this.f57238f) {
            case 0:
                d2.n1 n1Var = this.f57209e;
                int e10 = n1Var.e(i3, i10, z10);
                if (e10 == -1) {
                    return n1Var.a(z10);
                }
                return e10;
            default:
                return super.e(i3, i10, z10);
        }
    }

    @Override
    public d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        switch (this.f57238f) {
            case 1:
                super.f(i3, k1Var, z10);
                k1Var.f8165f = true;
                return k1Var;
            default:
                return super.f(i3, k1Var, z10);
        }
    }

    @Override
    public int k(int i3, int i10, boolean z10) {
        switch (this.f57238f) {
            case 0:
                d2.n1 n1Var = this.f57209e;
                int k10 = n1Var.k(i3, i10, z10);
                if (k10 == -1) {
                    return n1Var.c(z10);
                }
                return k10;
            default:
                return super.k(i3, i10, z10);
        }
    }

    @Override
    public d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        switch (this.f57238f) {
            case 1:
                super.m(i3, m1Var, j10);
                m1Var.f8216k = true;
                return m1Var;
            default:
                return super.m(i3, m1Var, j10);
        }
    }
}
