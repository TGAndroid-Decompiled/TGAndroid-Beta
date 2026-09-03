package w3;

import r3.r;
import r3.s;
import r3.t;
public final class c implements s {
    public final s f49382a;
    public final f2.c f49383b;

    public c(f2.c cVar, s sVar) {
        this.f49383b = cVar;
        this.f49382a = sVar;
    }

    @Override
    public final boolean c() {
        return this.f49382a.c();
    }

    @Override
    public final r f(long j10) {
        r f10 = this.f49382a.f(j10);
        t tVar = f10.f46613a;
        long j11 = tVar.f46616a;
        long j12 = tVar.f46617b;
        long j13 = this.f49383b.f5739b;
        t tVar2 = new t(j11, j12 + j13);
        t tVar3 = f10.f46614b;
        return new r(tVar2, new t(tVar3.f46616a, tVar3.f46617b + j13));
    }

    @Override
    public final long g() {
        return this.f49382a.g();
    }
}
