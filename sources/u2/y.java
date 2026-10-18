package u2;

import j$.util.Objects;
public final class y extends r {
    public static final Object h = new Object();
    public final Object f47535f;
    public final Object f47536g;

    public y(b2.o1 o1Var, Object obj, Object obj2) {
        super(o1Var);
        this.f47535f = obj;
        this.f47536g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f47536g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        this.e.f(i10, l1Var, z10);
        if (Objects.equals(l1Var.f3825b, this.f47536g) && z10) {
            l1Var.f3825b = h;
        }
        return l1Var;
    }

    @Override
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        if (Objects.equals(l4, this.f47536g)) {
            return h;
        }
        return l4;
    }

    @Override
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        this.e.m(i10, n1Var, j10);
        if (Objects.equals(n1Var.f3871a, this.f47535f)) {
            n1Var.f3871a = b2.n1.f3862q;
        }
        return n1Var;
    }
}
