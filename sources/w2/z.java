package w2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f57290f;
    public final Object f57291g;

    public z(d2.n1 n1Var, Object obj, Object obj2) {
        super(n1Var);
        this.f57290f = obj;
        this.f57291g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f57291g) != null) {
            obj = obj2;
        }
        return this.f57209e.b(obj);
    }

    @Override
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        this.f57209e.f(i3, k1Var, z10);
        if (Objects.equals(k1Var.f8162b, this.f57291g) && z10) {
            k1Var.f8162b = h;
        }
        return k1Var;
    }

    @Override
    public final Object l(int i3) {
        Object l10 = this.f57209e.l(i3);
        if (Objects.equals(l10, this.f57291g)) {
            return h;
        }
        return l10;
    }

    @Override
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        this.f57209e.m(i3, m1Var, j10);
        if (Objects.equals(m1Var.f8208a, this.f57290f)) {
            m1Var.f8208a = d2.m1.f8199q;
        }
        return m1Var;
    }
}
