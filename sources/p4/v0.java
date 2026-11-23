package p4;

import ai.u1;
import ai.v1;
public final class v0 implements c1 {
    public final int f55491a;
    public final c1 f55492b;

    public v0(c1 c1Var, int i7) {
        this.f55491a = i7;
        this.f55492b = c1Var;
    }

    @Override
    public final Object k(e0 e0Var, v vVar, int i7) {
        switch (this.f55491a) {
            case 0:
                if (e0Var == null) {
                    e1.k1(null, vVar, i7, this.f55492b, new v1(vVar, i7, 21));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return e1.k1(e0Var, vVar, i7, this.f55492b, new u1(e0Var, vVar, i7, 19));
        }
    }
}
