package wd;

import r2.y;
public final class a extends ed.c {
    public xd.g f52803a;
    public Object f52804b;
    public final y f52805c;
    public int d;

    public a(y yVar, ed.c cVar) {
        super(cVar);
        this.f52805c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52804b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f52805c.p(null, this);
    }
}
