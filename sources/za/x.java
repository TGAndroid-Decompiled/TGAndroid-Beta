package za;
public final class x extends kd.c {
    public Object f47955a;
    public int f47956b;
    public final k1.p f47957c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f47957c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f47955a = obj;
        this.f47956b |= Integer.MIN_VALUE;
        return this.f47957c.a(null, this);
    }
}
