package p4;

import jg.a2;
public final class t0 implements a1 {
    public final int f53449a;
    public final a1 f53450b;

    public t0(a1 a1Var, int i7) {
        this.f53449a = i7;
        this.f53450b = a1Var;
    }

    @Override
    public final Object l(d0 d0Var, v vVar, int i7) {
        switch (this.f53449a) {
            case 0:
                if (d0Var == null) {
                    c1.k1(null, vVar, i7, this.f53450b, new l2.q(vVar, i7, 18));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return c1.k1(d0Var, vVar, i7, this.f53450b, new a2(d0Var, vVar, i7, 17));
        }
    }
}
