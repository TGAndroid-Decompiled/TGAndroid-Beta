package za;
public final class d0 extends kd.c {
    public Object f48759a;
    public final g0 f48760b;
    public int f48761c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48760b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48759a = obj;
        this.f48761c |= Integer.MIN_VALUE;
        return g0.a(this.f48760b, this);
    }
}
