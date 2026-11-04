package zd;
public final class k extends hd.c {
    public l f60410a;
    public Object f60411b;
    public final l f60412c;
    public int d;

    public k(l lVar, fd.c cVar) {
        super(cVar);
        this.f60412c = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f60411b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f60412c.b(null, this);
    }
}
