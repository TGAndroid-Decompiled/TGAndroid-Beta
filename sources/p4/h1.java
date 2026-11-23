package p4;
public final class h1 extends e2.l1 {
    public static final Object f55280j = new Object();
    public final e2.l0 f55281e;
    public final boolean f55282f;
    public final boolean f55283g;
    public final e2.f0 h;
    public final long f55284i;

    public h1(i1 i1Var) {
        e2.f0 f0Var;
        this.f55281e = i1Var.w();
        this.f55282f = i1Var.e0();
        this.f55283g = i1Var.v0();
        if (i1Var.P0()) {
            f0Var = e2.f0.f10382f;
        } else {
            f0Var = null;
        }
        this.h = f0Var;
        this.f55284i = h2.l0.S(i1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f55280j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        i1Var.getClass();
        e2.c cVar = e2.c.f10336c;
        Object obj = f55280j;
        i1Var.h(obj, obj, 0, this.f55284i, 0L, cVar, false);
        i1Var.f10430f = false;
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        return f55280j;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(f55280j, this.f55281e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f55282f, this.f55283g, this.h, 0L, this.f55284i, 0, 0, 0L);
        k1Var.f10478k = false;
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
