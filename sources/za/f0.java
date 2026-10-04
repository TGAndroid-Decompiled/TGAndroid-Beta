package za;
public final class f0 extends kd.c {
    public g0 f53096a;
    public Object f53097b;
    public final g0 f53098c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53098c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53097b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f53098c, this);
    }
}
