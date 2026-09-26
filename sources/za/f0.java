package za;
public final class f0 extends kd.c {
    public Object f49042a;
    public final i0 f49043b;
    public int f49044c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49043b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49042a = obj;
        this.f49044c |= Integer.MIN_VALUE;
        return i0.a(this.f49043b, this);
    }
}
