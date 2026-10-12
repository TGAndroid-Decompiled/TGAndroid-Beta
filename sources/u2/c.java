package u2;
public final class c implements a1 {
    public final a1 f48768a;
    public boolean f48769b;
    public final d f48770c;

    public c(d dVar, a1 a1Var) {
        this.f48770c = dVar;
        this.f48768a = a1Var;
    }

    @Override
    public final void a() {
        this.f48768a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f48770c.e() && this.f48768a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f48770c;
        if (dVar.e()) {
            return -3;
        }
        if (this.f48769b) {
            hVar.setFlags(4);
            return -4;
        }
        long p5 = dVar.p();
        int f7 = this.f48768a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16364c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f48774e != 0) {
                i12 = 0;
            }
            if (dVar.f48775f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f16364c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f48775f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10984e >= j3) || (f7 == -3 && p5 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f48769b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f48770c.e()) {
            return -3;
        }
        return this.f48768a.j(j3);
    }
}
