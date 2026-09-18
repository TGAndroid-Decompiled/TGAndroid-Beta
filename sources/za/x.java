package za;
public final class x extends kd.c {
    public Object f49089a;
    public int f49090b;
    public final k1.p f49091c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49091c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49089a = obj;
        this.f49090b |= Integer.MIN_VALUE;
        return this.f49091c.a(null, this);
    }
}
