package za;
public final class z extends kd.c {
    public Object f48786a;
    public int f48787b;
    public final k1.p f48788c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f48788c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48786a = obj;
        this.f48787b |= Integer.MIN_VALUE;
        return this.f48788c.a(null, this);
    }
}
