package pd;

import dd.p;
public final class c implements uc.h {
    public final Throwable f41190a;
    public final uc.h f41191b;

    public c(Throwable th2, uc.h hVar) {
        this.f41190a = th2;
        this.f41191b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f41191b.fold(obj, pVar);
    }

    @Override
    public final uc.f get(uc.g gVar) {
        return this.f41191b.get(gVar);
    }

    @Override
    public final uc.h minusKey(uc.g gVar) {
        return this.f41191b.minusKey(gVar);
    }

    @Override
    public final uc.h plus(uc.h hVar) {
        return this.f41191b.plus(hVar);
    }
}
