package za;
public final class h0 extends ld.c {
    public i0 f54237a;
    public Object f54238b;
    public final i0 f54239c;
    public int d;

    public h0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.f54239c = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54238b = obj;
        this.d |= Integer.MIN_VALUE;
        return i0.b(this.f54239c, this);
    }
}
