package qc;

import g7.u6;
import zc.p;
public abstract class a implements f {
    public final g f46136a;

    public a(g gVar) {
        this.f46136a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return u6.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f46136a;
    }

    @Override
    public h minusKey(g gVar) {
        return u6.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return u6.c(this, hVar);
    }
}
