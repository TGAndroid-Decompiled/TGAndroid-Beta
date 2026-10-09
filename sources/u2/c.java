package u2;
public final class c implements b1 {
    public final b1 f48550a;
    public boolean f48551b;
    public final d f48552c;

    public c(d dVar, b1 b1Var) {
        this.f48552c = dVar;
        this.f48550a = b1Var;
    }

    @Override
    public final void a() {
        this.f48550a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f48552c.a() && this.f48550a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        d dVar = this.f48552c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f48551b) {
            hVar.setFlags(4);
            return -4;
        }
        long q6 = dVar.q();
        int f7 = this.f48550a.f(xVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) xVar.f16613c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f48556e != 0) {
                i12 = 0;
            }
            if (dVar.f48557f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            xVar.f16613c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f48557f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10986e >= j3) || (f7 == -3 && q6 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f48551b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f48552c.a()) {
            return -3;
        }
        return this.f48550a.j(j3);
    }
}
