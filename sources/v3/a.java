package v3;

import d5.f0;
import m3.s;
import m3.t;
import m3.u;
public final class a implements t {
    public final b f48312a;

    public a(b bVar) {
        this.f48312a = bVar;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        b bVar = this.f48312a;
        long j11 = bVar.f48314b;
        long j12 = bVar.f48315c;
        u uVar = new u(j10, f0.i(((((j12 - j11) * ((bVar.d.f48346i * j10) / 1000000)) / bVar.f48317f) + j11) - 30000, j11, j12 - 1));
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        b bVar = this.f48312a;
        return (bVar.f48317f * 1000000) / bVar.d.f48346i;
    }
}
