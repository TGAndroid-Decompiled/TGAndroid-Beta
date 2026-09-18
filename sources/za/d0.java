package za;
public final class d0 extends kd.c {
    public Object f48787a;
    public final g0 f48788b;
    public int f48789c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48788b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48787a = obj;
        this.f48789c |= Integer.MIN_VALUE;
        return g0.a(this.f48788b, this);
    }
}
