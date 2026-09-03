package pd;

import dd.p;
public final class c implements uc.h {
    public final Throwable f41213a;
    public final uc.h f41214b;

    public c(Throwable th2, uc.h hVar) {
        this.f41213a = th2;
        this.f41214b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f41214b.fold(obj, pVar);
    }

    @Override
    public final uc.f get(uc.g gVar) {
        return this.f41214b.get(gVar);
    }

    @Override
    public final uc.h minusKey(uc.g gVar) {
        return this.f41214b.minusKey(gVar);
    }

    @Override
    public final uc.h plus(uc.h hVar) {
        return this.f41214b.plus(hVar);
    }
}
