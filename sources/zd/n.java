package zd;
public final class n extends hd.c {
    public Object f60420a;
    public int f60421b;
    public final ua.b f60422c;
    public l d;

    public n(ua.b bVar, hd.c cVar) {
        super(cVar);
        this.f60422c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f60420a = obj;
        this.f60421b |= Integer.MIN_VALUE;
        return this.f60422c.U(null, this);
    }
}
