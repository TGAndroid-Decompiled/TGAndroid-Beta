package pd;

import dd.p;
public final class c implements uc.h {
    public final Throwable f44357a;
    public final uc.h f44358b;

    public c(Throwable th2, uc.h hVar) {
        this.f44357a = th2;
        this.f44358b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f44358b.fold(obj, pVar);
    }

    @Override
    public final uc.f get(uc.g gVar) {
        return this.f44358b.get(gVar);
    }

    @Override
    public final uc.h minusKey(uc.g gVar) {
        return this.f44358b.minusKey(gVar);
    }

    @Override
    public final uc.h plus(uc.h hVar) {
        return this.f44358b.plus(hVar);
    }
}
