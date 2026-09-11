package za;
public final class d0 extends kd.c {
    public Object f51400a;
    public final g0 f51401b;
    public int f51402c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f51401b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51400a = obj;
        this.f51402c |= Integer.MIN_VALUE;
        return g0.a(this.f51401b, this);
    }
}
