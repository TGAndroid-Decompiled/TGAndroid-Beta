package u2;
public final class c implements a1 {
    public final a1 f48619a;
    public boolean f48620b;
    public final d f48621c;

    public c(d dVar, a1 a1Var) {
        this.f48621c = dVar;
        this.f48619a = a1Var;
    }

    @Override
    public final void a() {
        this.f48619a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f48621c.a() && this.f48619a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        d dVar = this.f48621c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f48620b) {
            hVar.setFlags(4);
            return -4;
        }
        long q6 = dVar.q();
        int f7 = this.f48619a.f(xVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) xVar.f16659c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f48625e != 0) {
                i12 = 0;
            }
            if (dVar.f48626f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            xVar.f16659c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f48626f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10985e >= j3) || (f7 == -3 && q6 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f48620b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f48621c.a()) {
            return -3;
        }
        return this.f48619a.j(j3);
    }
}
