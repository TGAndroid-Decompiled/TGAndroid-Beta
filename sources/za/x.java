package za;
public final class x extends kd.c {
    public Object f49151a;
    public int f49152b;
    public final k1.p f49153c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49153c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49151a = obj;
        this.f49152b |= Integer.MIN_VALUE;
        return this.f49153c.a(null, this);
    }
}
