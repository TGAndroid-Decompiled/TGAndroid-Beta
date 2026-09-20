package za;
public final class x extends kd.c {
    public Object f49135a;
    public int f49136b;
    public final k1.p f49137c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49137c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49135a = obj;
        this.f49136b |= Integer.MIN_VALUE;
        return this.f49137c.a(null, this);
    }
}
