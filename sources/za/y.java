package za;
public final class y extends ld.c {
    public Object f54340a;
    public int f54341b;
    public final k1.p f54342c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54342c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54340a = obj;
        this.f54341b |= Integer.MIN_VALUE;
        return this.f54342c.b(null, this);
    }
}
