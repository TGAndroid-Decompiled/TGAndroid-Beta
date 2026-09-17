package za;
public final class x extends kd.c {
    public Object f51484a;
    public int f51485b;
    public final k1.p f51486c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f51486c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51484a = obj;
        this.f51485b |= Integer.MIN_VALUE;
        return this.f51486c.a(null, this);
    }
}
