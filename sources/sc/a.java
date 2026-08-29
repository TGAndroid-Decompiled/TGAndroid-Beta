package sc;

import bd.p;
import i7.s7;
public abstract class a implements f {
    public final g f47707a;

    public a(g gVar) {
        this.f47707a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return s7.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f47707a;
    }

    @Override
    public h minusKey(g gVar) {
        return s7.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return s7.c(this, hVar);
    }
}
