package rc;

import ad.p;
import h7.y6;

public abstract class a implements f {

    public final g f46895a;

    public a(g gVar) {
        this.f46895a = gVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public f get(g gVar) {
        return y6.a(this, gVar);
    }

    @Override
    public final g getKey() {
        return this.f46895a;
    }

    @Override
    public h minusKey(g gVar) {
        return y6.b(this, gVar);
    }

    @Override
    public final h plus(h hVar) {
        return y6.c(this, hVar);
    }
}
