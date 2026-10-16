package u2;
public final class v extends s {
    public final int f46060f;

    public v(b2.p1 p1Var, int i10) {
        super(p1Var);
        this.f46060f = i10;
    }

    @Override
    public int e(int i10, int i11, boolean z10) {
        switch (this.f46060f) {
            case 0:
                b2.p1 p1Var = this.e;
                int e = p1Var.e(i10, i11, z10);
                if (e == -1) {
                    return p1Var.a(z10);
                }
                return e;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override
    public b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        switch (this.f46060f) {
            case 1:
                super.f(i10, m1Var, z10);
                m1Var.f2218f = true;
                return m1Var;
            default:
                return super.f(i10, m1Var, z10);
        }
    }

    @Override
    public int k(int i10, int i11, boolean z10) {
        switch (this.f46060f) {
            case 0:
                b2.p1 p1Var = this.e;
                int k10 = p1Var.k(i10, i11, z10);
                if (k10 == -1) {
                    return p1Var.c(z10);
                }
                return k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override
    public b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        switch (this.f46060f) {
            case 1:
                super.m(i10, o1Var, j10);
                o1Var.f2269k = true;
                return o1Var;
            default:
                return super.m(i10, o1Var, j10);
        }
    }
}
