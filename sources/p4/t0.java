package p4;

import jg.a2;
public final class t0 implements a1 {
    public final int f53331a;
    public final a1 f53332b;

    public t0(a1 a1Var, int i7) {
        this.f53331a = i7;
        this.f53332b = a1Var;
    }

    @Override
    public final Object i(d0 d0Var, v vVar, int i7) {
        switch (this.f53331a) {
            case 0:
                if (d0Var == null) {
                    c1.K0(null, vVar, i7, this.f53332b, new l2.q(vVar, i7, 18));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return c1.K0(d0Var, vVar, i7, this.f53332b, new a2(d0Var, vVar, i7, 17));
        }
    }
}
