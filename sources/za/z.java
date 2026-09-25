package za;
public final class z extends kd.c {
    public Object f49116a;
    public int f49117b;
    public final k1.p f49118c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49118c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49116a = obj;
        this.f49117b |= Integer.MIN_VALUE;
        return this.f49118c.a(null, this);
    }
}
