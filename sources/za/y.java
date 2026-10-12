package za;
public final class y extends ld.c {
    public Object f54517a;
    public int f54518b;
    public final k1.p f54519c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54519c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54517a = obj;
        this.f54518b |= Integer.MIN_VALUE;
        return this.f54519c.b(null, this);
    }
}
