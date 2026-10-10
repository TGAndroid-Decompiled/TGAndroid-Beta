package za;
public final class h0 extends ld.c {
    public i0 f54283a;
    public Object f54284b;
    public final i0 f54285c;
    public int d;

    public h0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.f54285c = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54284b = obj;
        this.d |= Integer.MIN_VALUE;
        return i0.b(this.f54285c, this);
    }
}
