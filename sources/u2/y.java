package u2;

import j$.util.Objects;
public final class y extends r {
    public static final Object h = new Object();
    public final Object f43462f;
    public final Object f43463g;

    public y(b2.k1 k1Var, Object obj, Object obj2) {
        super(k1Var);
        this.f43462f = obj;
        this.f43463g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f43463g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.e.f(i10, h1Var, z10);
        if (Objects.equals(h1Var.f3005b, this.f43463g) && z10) {
            h1Var.f3005b = h;
        }
        return h1Var;
    }

    @Override
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        if (Objects.equals(l4, this.f43463g)) {
            return h;
        }
        return l4;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.e.m(i10, j1Var, j3);
        if (Objects.equals(j1Var.f3050a, this.f43462f)) {
            j1Var.f3050a = b2.j1.f3041q;
        }
        return j1Var;
    }
}
