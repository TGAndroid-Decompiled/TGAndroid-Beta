package wd;
public final class d extends ed.c {
    public Object f52824a;
    public int f52825b;
    public final u9.b f52826c;
    public u9.b d;
    public c e;

    public d(u9.b bVar, ed.c cVar) {
        super(cVar);
        this.f52826c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52824a = obj;
        this.f52825b |= Integer.MIN_VALUE;
        return this.f52826c.p(null, this);
    }
}
