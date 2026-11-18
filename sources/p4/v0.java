package p4;

import ai.r1;
import ai.s1;
public final class v0 implements c1 {
    public final int f55446a;
    public final c1 f55447b;

    public v0(c1 c1Var, int i7) {
        this.f55446a = i7;
        this.f55447b = c1Var;
    }

    @Override
    public final Object k(d0 d0Var, v vVar, int i7) {
        switch (this.f55446a) {
            case 0:
                if (d0Var == null) {
                    e1.k1(null, vVar, i7, this.f55447b, new s1(vVar, i7, 21));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return e1.k1(d0Var, vVar, i7, this.f55447b, new r1(d0Var, vVar, i7, 19));
        }
    }
}
