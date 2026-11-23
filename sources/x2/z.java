package x2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f60425f;
    public final Object f60426g;

    public z(e2.l1 l1Var, Object obj, Object obj2) {
        super(l1Var);
        this.f60425f = obj;
        this.f60426g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f60426g) != null) {
            obj = obj2;
        }
        return this.f60344e.b(obj);
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        this.f60344e.f(i7, i1Var, z10);
        if (Objects.equals(i1Var.f10425b, this.f60426g) && z10) {
            i1Var.f10425b = h;
        }
        return i1Var;
    }

    @Override
    public final Object l(int i7) {
        Object l10 = this.f60344e.l(i7);
        if (Objects.equals(l10, this.f60426g)) {
            return h;
        }
        return l10;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.f60344e.m(i7, k1Var, j3);
        if (Objects.equals(k1Var.f10468a, this.f60425f)) {
            k1Var.f10468a = e2.k1.f10459q;
        }
        return k1Var;
    }
}
