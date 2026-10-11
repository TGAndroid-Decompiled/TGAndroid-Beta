package za;
public final class y extends ld.c {
    public Object f54380a;
    public int f54381b;
    public final k1.p f54382c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54382c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54380a = obj;
        this.f54381b |= Integer.MIN_VALUE;
        return this.f54382c.b(null, this);
    }
}
