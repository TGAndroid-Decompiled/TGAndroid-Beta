package p4;

import ai.t1;
import ai.u1;
public final class v0 implements c1 {
    public final int f55487a;
    public final c1 f55488b;

    public v0(c1 c1Var, int i7) {
        this.f55487a = i7;
        this.f55488b = c1Var;
    }

    @Override
    public final Object k(e0 e0Var, v vVar, int i7) {
        switch (this.f55487a) {
            case 0:
                if (e0Var == null) {
                    e1.k1(null, vVar, i7, this.f55488b, new u1(vVar, i7, 21));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return e1.k1(e0Var, vVar, i7, this.f55488b, new t1(e0Var, vVar, i7, 19));
        }
    }
}
