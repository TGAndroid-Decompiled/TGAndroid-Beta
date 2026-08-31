package uc;

import dd.p;
import k7.b8;
public abstract class a implements f {
    public final g f48476a;

    public a(g gVar) {
        this.f48476a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return b8.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f48476a;
    }

    @Override
    public h minusKey(g gVar) {
        return b8.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return b8.c(this, hVar);
    }
}
