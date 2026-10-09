package za;
public final class y extends ld.c {
    public Object f54294a;
    public int f54295b;
    public final k1.p f54296c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54296c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54294a = obj;
        this.f54295b |= Integer.MIN_VALUE;
        return this.f54296c.b(null, this);
    }
}
