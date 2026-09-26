package za;
public final class h0 extends kd.c {
    public i0 f49060a;
    public Object f49061b;
    public final i0 f49062c;
    public int d;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49062c = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49061b = obj;
        this.d |= Integer.MIN_VALUE;
        return i0.b(this.f49062c, this);
    }
}
