package za;
public final class d0 extends kd.c {
    public Object f53099a;
    public final g0 f53100b;
    public int f53101c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53100b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53099a = obj;
        this.f53101c |= Integer.MIN_VALUE;
        return g0.a(this.f53100b, this);
    }
}
