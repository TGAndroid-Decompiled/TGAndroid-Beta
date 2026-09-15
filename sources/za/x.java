package za;
public final class x extends kd.c {
    public Object f48835a;
    public int f48836b;
    public final k1.p f48837c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f48837c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48835a = obj;
        this.f48836b |= Integer.MIN_VALUE;
        return this.f48837c.a(null, this);
    }
}
