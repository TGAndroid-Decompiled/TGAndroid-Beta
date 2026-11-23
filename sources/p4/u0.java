package p4;
public final class u0 implements b1 {
    public final int f55565a;
    public final b1 f55566b;

    public u0(b1 b1Var, int i7) {
        this.f55565a = i7;
        this.f55566b = b1Var;
    }

    @Override
    public final Object j(d0 d0Var, v vVar, int i7) {
        switch (this.f55565a) {
            case 0:
                if (d0Var == null) {
                    d1.k1(null, vVar, i7, this.f55566b, new ai.n1(vVar, i7, 20));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return d1.k1(d0Var, vVar, i7, this.f55566b, new ai.o1(d0Var, vVar, i7, 19));
        }
    }
}
