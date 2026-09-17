package za;
public final class d0 extends kd.c {
    public Object f51401a;
    public final g0 f51402b;
    public int f51403c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f51402b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51401a = obj;
        this.f51403c |= Integer.MIN_VALUE;
        return g0.a(this.f51402b, this);
    }
}
