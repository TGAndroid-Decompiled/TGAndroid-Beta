package za;
public final class d0 extends kd.c {
    public Object f53073a;
    public final g0 f53074b;
    public int f53075c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53074b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53073a = obj;
        this.f53075c |= Integer.MIN_VALUE;
        return g0.a(this.f53074b, this);
    }
}
