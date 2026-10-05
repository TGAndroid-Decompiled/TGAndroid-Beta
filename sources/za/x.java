package za;
public final class x extends kd.c {
    public Object f53182a;
    public int f53183b;
    public final k1.p f53184c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f53184c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53182a = obj;
        this.f53183b |= Integer.MIN_VALUE;
        return this.f53184c.a(null, this);
    }
}
