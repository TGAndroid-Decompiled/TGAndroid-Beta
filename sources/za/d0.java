package za;
public final class d0 extends kd.c {
    public Object f53072a;
    public final g0 f53073b;
    public int f53074c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53073b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53072a = obj;
        this.f53074c |= Integer.MIN_VALUE;
        return g0.a(this.f53073b, this);
    }
}
