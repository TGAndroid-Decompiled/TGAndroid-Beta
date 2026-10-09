package za;
public final class y extends ld.c {
    public Object f54296a;
    public int f54297b;
    public final k1.p f54298c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54298c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54296a = obj;
        this.f54297b |= Integer.MIN_VALUE;
        return this.f54298c.b(null, this);
    }
}
