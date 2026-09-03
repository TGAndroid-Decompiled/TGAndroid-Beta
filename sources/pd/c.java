package pd;

import dd.p;
public final class c implements uc.h {
    public final Throwable f44388a;
    public final uc.h f44389b;

    public c(Throwable th2, uc.h hVar) {
        this.f44388a = th2;
        this.f44389b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f44389b.fold(obj, pVar);
    }

    @Override
    public final uc.f get(uc.g gVar) {
        return this.f44389b.get(gVar);
    }

    @Override
    public final uc.h minusKey(uc.g gVar) {
        return this.f44389b.minusKey(gVar);
    }

    @Override
    public final uc.h plus(uc.h hVar) {
        return this.f44389b.plus(hVar);
    }
}
