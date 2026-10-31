package wd;
public final class h extends ed.c {
    public i f52817a;
    public Object f52818b;
    public Object f52819c;
    public final i d;
    public int e;

    public h(i iVar, ed.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52819c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
