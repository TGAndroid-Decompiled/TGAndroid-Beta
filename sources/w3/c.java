package w3;

import r3.r;
import r3.s;
import r3.t;
public final class c implements s {
    public final s f49345a;
    public final f2.c f49346b;

    public c(f2.c cVar, s sVar) {
        this.f49346b = cVar;
        this.f49345a = sVar;
    }

    @Override
    public final boolean c() {
        return this.f49345a.c();
    }

    @Override
    public final r f(long j10) {
        r f10 = this.f49345a.f(j10);
        t tVar = f10.f46582a;
        long j11 = tVar.f46585a;
        long j12 = tVar.f46586b;
        long j13 = this.f49346b.f5739b;
        t tVar2 = new t(j11, j12 + j13);
        t tVar3 = f10.f46583b;
        return new r(tVar2, new t(tVar3.f46585a, tVar3.f46586b + j13));
    }

    @Override
    public final long g() {
        return this.f49345a.g();
    }
}
