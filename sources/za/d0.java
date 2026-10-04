package za;
public final class d0 extends kd.c {
    public Object f53078a;
    public final g0 f53079b;
    public int f53080c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53079b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53078a = obj;
        this.f53080c |= Integer.MIN_VALUE;
        return g0.a(this.f53079b, this);
    }
}
