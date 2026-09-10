package u2;
public final class d implements d1 {
    public final d1 f42309a;
    public boolean f42310b;
    public final e f42311c;

    public d(e eVar, d1 d1Var) {
        this.f42311c = eVar;
        this.f42309a = d1Var;
    }

    @Override
    public final void a() {
        this.f42309a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f42311c.a() && this.f42309a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(long j3) {
        if (this.f42311c.a()) {
            return -3;
        }
        return this.f42309a.g(j3);
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        e eVar = this.f42311c;
        if (eVar.a()) {
            return -3;
        }
        if (this.f42310b) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = eVar.r();
        int t10 = this.f42309a.t(bVar, hVar, i10);
        if (t10 == -5) {
            b2.s sVar = (b2.s) bVar.f14295c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (eVar.e != 0) {
                i12 = 0;
            }
            if (eVar.f42315f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            bVar.f14295c = new b2.s(a2);
            return -5;
        }
        long j3 = eVar.f42315f;
        if (j3 != Long.MIN_VALUE && ((t10 == -4 && hVar.e >= j3) || (t10 == -3 && r10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f42310b = true;
            return -4;
        }
        return t10;
    }
}
