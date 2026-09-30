package za;
public final class z extends kd.c {
    public Object f49223a;
    public int f49224b;
    public final k1.p f49225c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49225c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49223a = obj;
        this.f49224b |= Integer.MIN_VALUE;
        return this.f49225c.a(null, this);
    }
}
