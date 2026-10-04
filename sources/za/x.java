package za;
public final class x extends kd.c {
    public Object f53161a;
    public int f53162b;
    public final k1.p f53163c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f53163c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53161a = obj;
        this.f53162b |= Integer.MIN_VALUE;
        return this.f53163c.a(null, this);
    }
}
