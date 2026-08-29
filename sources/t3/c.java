package t3;

import o3.s;
import o3.t;
import o3.u;
public final class c implements t {
    public final t f48108a;
    public final f2.c f48109b;

    public c(f2.c cVar, t tVar) {
        this.f48109b = cVar;
        this.f48108a = tVar;
    }

    @Override
    public final boolean c() {
        return this.f48108a.c();
    }

    @Override
    public final s g(long j10) {
        s g10 = this.f48108a.g(j10);
        u uVar = g10.f19115a;
        long j11 = uVar.f19118a;
        long j12 = uVar.f19119b;
        long j13 = this.f48109b.f6282b;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = g10.f19116b;
        return new s(uVar2, new u(uVar3.f19118a, uVar3.f19119b + j13));
    }

    @Override
    public final long h() {
        return this.f48108a.h();
    }
}
