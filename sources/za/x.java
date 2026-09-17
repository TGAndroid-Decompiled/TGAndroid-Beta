package za;
public final class x extends kd.c {
    public Object f48858a;
    public int f48859b;
    public final k1.p f48860c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f48860c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48858a = obj;
        this.f48859b |= Integer.MIN_VALUE;
        return this.f48860c.a(null, this);
    }
}
