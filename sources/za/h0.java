package za;
public final class h0 extends ld.c {
    public i0 f54239a;
    public Object f54240b;
    public final i0 f54241c;
    public int d;

    public h0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.f54241c = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54240b = obj;
        this.d |= Integer.MIN_VALUE;
        return i0.b(this.f54241c, this);
    }
}
