package r3;

import m3.s;
import m3.t;
import m3.u;
public final class c implements t {
    public final t f47025a;
    public final f2.d f47026b;

    public c(f2.d dVar, t tVar) {
        this.f47026b = dVar;
        this.f47025a = tVar;
    }

    @Override
    public final boolean e() {
        return this.f47025a.e();
    }

    @Override
    public final s h(long j10) {
        s h = this.f47025a.h(j10);
        u uVar = h.f17256a;
        long j11 = uVar.f17259a;
        long j12 = uVar.f17260b;
        long j13 = this.f47026b.f5337b;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = h.f17257b;
        return new s(uVar2, new u(uVar3.f17259a, uVar3.f17260b + j13));
    }

    @Override
    public final long i() {
        return this.f47025a.i();
    }
}
