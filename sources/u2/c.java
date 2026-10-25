package u2;
public final class c implements d1 {
    public final d1 f49251a;
    public boolean f49252b;
    public final d f49253c;

    public c(d dVar, d1 d1Var) {
        this.f49253c = dVar;
        this.f49251a = d1Var;
    }

    @Override
    public final void d() {
        this.f49251a.d();
    }

    @Override
    public final boolean e() {
        if (!this.f49253c.a() && this.f49251a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        d dVar = this.f49253c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f49252b) {
            hVar.setFlags(4);
            return -4;
        }
        long q5 = dVar.q();
        int f7 = this.f49251a.f(sVar, hVar, i10);
        if (dVar.e != -9223372036854775807L && f7 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (f7 == -5) {
            long j10 = dVar.f49284f;
            long j11 = dVar.h;
            b2.x xVar = (b2.x) sVar.f18697c;
            xVar.getClass();
            int i11 = xVar.O;
            int i12 = xVar.N;
            if (i12 != 0 || i11 != 0) {
                if (j10 != 0) {
                    i12 = 0;
                }
                if (j11 != Long.MIN_VALUE) {
                    i11 = 0;
                }
                b2.w a2 = xVar.a();
                a2.M = i12;
                a2.N = i11;
                sVar.f18697c = new b2.x(a2);
            }
            return -5;
        }
        long j12 = dVar.h;
        if (j12 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j12) || (f7 == -3 && q5 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f49252b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j10) {
        if (this.f49253c.a()) {
            return -3;
        }
        return this.f49251a.j(j10);
    }
}
