package p4;

import ai.q1;
import ai.r1;
public final class t0 implements a1 {
    public final int f54866a;
    public final a1 f54867b;

    public t0(a1 a1Var, int i7) {
        this.f54866a = i7;
        this.f54867b = a1Var;
    }

    @Override
    public final Object k(d0 d0Var, v vVar, int i7) {
        switch (this.f54866a) {
            case 0:
                if (d0Var == null) {
                    c1.k1(null, vVar, i7, this.f54867b, new r1(vVar, i7, 21));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return c1.k1(d0Var, vVar, i7, this.f54867b, new q1(d0Var, vVar, i7, 18));
        }
    }
}
