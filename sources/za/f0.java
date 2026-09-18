package za;
public final class f0 extends kd.c {
    public g0 f48803a;
    public Object f48804b;
    public final g0 f48805c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48805c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48804b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f48805c, this);
    }
}
