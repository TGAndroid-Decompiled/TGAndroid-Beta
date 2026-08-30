package w3;

import r3.r;
import r3.s;
import r3.t;
public final class c implements s {
    public final s f46377a;
    public final f2.c f46378b;

    public c(f2.c cVar, s sVar) {
        this.f46378b = cVar;
        this.f46377a = sVar;
    }

    @Override
    public final boolean c() {
        return this.f46377a.c();
    }

    @Override
    public final r f(long j10) {
        r f10 = this.f46377a.f(j10);
        t tVar = f10.f43246a;
        long j11 = tVar.f43249a;
        long j12 = tVar.f43250b;
        long j13 = this.f46378b.f5670b;
        t tVar2 = new t(j11, j12 + j13);
        t tVar3 = f10.f43247b;
        return new r(tVar2, new t(tVar3.f43249a, tVar3.f43250b + j13));
    }

    @Override
    public final long g() {
        return this.f46377a.g();
    }
}
