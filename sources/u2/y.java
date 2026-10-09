package u2;

import j$.util.Objects;
public final class y extends r {
    public static final Object h = new Object();
    public final Object f48759f;
    public final Object f48760g;

    public y(b2.k1 k1Var, Object obj, Object obj2) {
        super(k1Var);
        this.f48759f = obj;
        this.f48760g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f48760g) != null) {
            obj = obj2;
        }
        return this.f48689e.b(obj);
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.f48689e.f(i10, h1Var, z10);
        if (Objects.equals(h1Var.f3328b, this.f48760g) && z10) {
            h1Var.f3328b = h;
        }
        return h1Var;
    }

    @Override
    public final Object l(int i10) {
        Object l4 = this.f48689e.l(i10);
        if (Objects.equals(l4, this.f48760g)) {
            return h;
        }
        return l4;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.f48689e.m(i10, j1Var, j3);
        if (Objects.equals(j1Var.f3379a, this.f48759f)) {
            j1Var.f3379a = b2.j1.f3370q;
        }
        return j1Var;
    }
}
