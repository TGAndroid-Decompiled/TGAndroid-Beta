package za;
public final class d0 extends kd.c {
    public Object f48752a;
    public final g0 f48753b;
    public int f48754c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48753b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48752a = obj;
        this.f48754c |= Integer.MIN_VALUE;
        return g0.a(this.f48753b, this);
    }
}
