package x2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f60307f;
    public final Object f60308g;

    public z(e2.l1 l1Var, Object obj, Object obj2) {
        super(l1Var);
        this.f60307f = obj;
        this.f60308g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f60308g) != null) {
            obj = obj2;
        }
        return this.f60226e.b(obj);
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        this.f60226e.f(i7, i1Var, z10);
        if (Objects.equals(i1Var.f10427b, this.f60308g) && z10) {
            i1Var.f10427b = h;
        }
        return i1Var;
    }

    @Override
    public final Object l(int i7) {
        Object l10 = this.f60226e.l(i7);
        if (Objects.equals(l10, this.f60308g)) {
            return h;
        }
        return l10;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.f60226e.m(i7, k1Var, j3);
        if (Objects.equals(k1Var.f10470a, this.f60307f)) {
            k1Var.f10470a = e2.k1.f10461q;
        }
        return k1Var;
    }
}
