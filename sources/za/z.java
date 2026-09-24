package za;
public final class z extends kd.c {
    public Object f49104a;
    public int f49105b;
    public final k1.p f49106c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49106c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49104a = obj;
        this.f49105b |= Integer.MIN_VALUE;
        return this.f49106c.a(null, this);
    }
}
