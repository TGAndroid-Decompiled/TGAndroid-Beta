package za;
public final class h0 extends kd.c {
    public i0 f48733a;
    public Object f48734b;
    public final i0 f48735c;
    public int d;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f48735c = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48734b = obj;
        this.d |= Integer.MIN_VALUE;
        return i0.b(this.f48735c, this);
    }
}
