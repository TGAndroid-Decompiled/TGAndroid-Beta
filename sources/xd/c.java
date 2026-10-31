package xd;

import ld.p;
public final class c implements cd.h {
    public final Throwable f53662a;
    public final cd.h f53663b;

    public c(cd.h hVar, Throwable th2) {
        this.f53662a = th2;
        this.f53663b = hVar;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return this.f53663b.fold(obj, pVar);
    }

    @Override
    public final cd.f get(cd.g gVar) {
        return this.f53663b.get(gVar);
    }

    @Override
    public final cd.h minusKey(cd.g gVar) {
        return this.f53663b.minusKey(gVar);
    }

    @Override
    public final cd.h plus(cd.h hVar) {
        return this.f53663b.plus(hVar);
    }
}
