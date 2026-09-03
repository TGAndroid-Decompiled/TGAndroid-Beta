package w3;

import r3.r;
import r3.s;
import r3.t;
public final class c implements s {
    public final s f46459a;
    public final f2.c f46460b;

    public c(f2.c cVar, s sVar) {
        this.f46460b = cVar;
        this.f46459a = sVar;
    }

    @Override
    public final boolean c() {
        return this.f46459a.c();
    }

    @Override
    public final r f(long j10) {
        r f10 = this.f46459a.f(j10);
        t tVar = f10.f43270a;
        long j11 = tVar.f43273a;
        long j12 = tVar.f43274b;
        long j13 = this.f46460b.f5659b;
        t tVar2 = new t(j11, j12 + j13);
        t tVar3 = f10.f43271b;
        return new r(tVar2, new t(tVar3.f43273a, tVar3.f43274b + j13));
    }

    @Override
    public final long g() {
        return this.f46459a.g();
    }
}
