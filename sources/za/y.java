package za;
public final class y extends ld.c {
    public Object f54414a;
    public int f54415b;
    public final k1.p f54416c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54416c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54414a = obj;
        this.f54415b |= Integer.MIN_VALUE;
        return this.f54416c.b(null, this);
    }
}
