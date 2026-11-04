package zd;
public final class i extends hd.c {
    public Object f60403a;
    public int f60404b;
    public final ua.b f60405c;
    public ua.b d;
    public c f60406e;

    public i(ua.b bVar, hd.c cVar) {
        super(cVar);
        this.f60405c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f60403a = obj;
        this.f60404b |= Integer.MIN_VALUE;
        return this.f60405c.U(null, this);
    }
}
