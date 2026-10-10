package u2;
public final class c implements b1 {
    public final b1 f48596a;
    public boolean f48597b;
    public final d f48598c;

    public c(d dVar, b1 b1Var) {
        this.f48598c = dVar;
        this.f48596a = b1Var;
    }

    @Override
    public final void a() {
        this.f48596a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f48598c.a() && this.f48596a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        d dVar = this.f48598c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f48597b) {
            hVar.setFlags(4);
            return -4;
        }
        long q6 = dVar.q();
        int f7 = this.f48596a.f(xVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) xVar.f16617c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f48602e != 0) {
                i12 = 0;
            }
            if (dVar.f48603f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            xVar.f16617c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f48603f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10986e >= j3) || (f7 == -3 && q6 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f48597b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f48598c.a()) {
            return -3;
        }
        return this.f48596a.j(j3);
    }
}
