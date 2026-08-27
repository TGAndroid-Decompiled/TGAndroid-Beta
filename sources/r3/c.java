package r3;

import m3.s;
import m3.t;
import m3.u;

public final class c implements t {

    public final t f46715a;

    public final f2.c f46716b;

    public c(f2.c cVar, t tVar) {
        this.f46716b = cVar;
        this.f46715a = tVar;
    }

    @Override
    public final boolean e() {
        return this.f46715a.e();
    }

    @Override
    public final s h(long j10) {
        s sVarH = this.f46715a.h(j10);
        u uVar = sVarH.f17632a;
        long j11 = uVar.f17635a;
        long j12 = uVar.f17636b;
        long j13 = this.f46716b.f5630b;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = sVarH.f17633b;
        return new s(uVar2, new u(uVar3.f17635a, uVar3.f17636b + j13));
    }

    @Override
    public final long i() {
        return this.f46715a.i();
    }
}
