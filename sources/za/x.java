package za;
public final class x extends kd.c {
    public Object f51514a;
    public int f51515b;
    public final k1.p f51516c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f51516c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51514a = obj;
        this.f51515b |= Integer.MIN_VALUE;
        return this.f51516c.a(null, this);
    }
}
