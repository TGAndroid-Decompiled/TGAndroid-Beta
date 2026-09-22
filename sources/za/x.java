package za;
public final class x extends kd.c {
    public Object f48828a;
    public int f48829b;
    public final k1.p f48830c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f48830c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48828a = obj;
        this.f48829b |= Integer.MIN_VALUE;
        return this.f48830c.a(null, this);
    }
}
