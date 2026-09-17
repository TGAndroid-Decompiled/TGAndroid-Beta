package za;
public final class f0 extends kd.c {
    public g0 f51450a;
    public Object f51451b;
    public final g0 f51452c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f51452c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51451b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f51452c, this);
    }
}
