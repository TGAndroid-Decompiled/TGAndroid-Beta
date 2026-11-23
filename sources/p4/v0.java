package p4;
public final class v0 implements c1 {
    public final int f55456a;
    public final c1 f55457b;

    public v0(c1 c1Var, int i7) {
        this.f55456a = i7;
        this.f55457b = c1Var;
    }

    @Override
    public final Object k(d0 d0Var, v vVar, int i7) {
        switch (this.f55456a) {
            case 0:
                if (d0Var == null) {
                    e1.k1(null, vVar, i7, this.f55457b, new ai.m1(vVar, i7, 20));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return e1.k1(d0Var, vVar, i7, this.f55457b, new ai.n1(d0Var, vVar, i7, 19));
        }
    }
}
