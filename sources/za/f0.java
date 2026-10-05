package za;
public final class f0 extends kd.c {
    public g0 f53117a;
    public Object f53118b;
    public final g0 f53119c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53119c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53118b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f53119c, this);
    }
}
