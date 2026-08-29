package x3;

import f5.d0;
import o3.s;
import o3.t;
import o3.u;
public final class a implements t {
    public final b f50050a;

    public a(b bVar) {
        this.f50050a = bVar;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final s g(long j10) {
        b bVar = this.f50050a;
        long j11 = bVar.f50052b;
        long j12 = bVar.f50053c;
        u uVar = new u(j10, d0.i(((((j12 - j11) * ((bVar.d.f50084i * j10) / 1000000)) / bVar.f50055f) + j11) - 30000, j11, j12 - 1));
        return new s(uVar, uVar);
    }

    @Override
    public final long h() {
        b bVar = this.f50050a;
        return (bVar.f50055f * 1000000) / bVar.d.f50084i;
    }
}
