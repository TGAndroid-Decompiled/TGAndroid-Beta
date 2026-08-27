package v3;

import d5.g0;
import m3.s;
import m3.t;
import m3.u;

public final class a implements t {

    public final b f48739a;

    public a(b bVar) {
        this.f48739a = bVar;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        b bVar = this.f48739a;
        long j11 = (((long) bVar.d.f48773i) * j10) / 1000000;
        long j12 = bVar.f48741b;
        long j13 = bVar.f48742c;
        u uVar = new u(j10, g0.i(((((j13 - j12) * j11) / bVar.f48744f) + j12) - 30000, j12, j13 - 1));
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        b bVar = this.f48739a;
        return (bVar.f48744f * 1000000) / ((long) bVar.d.f48773i);
    }
}
