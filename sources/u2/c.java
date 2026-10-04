package u2;
public final class c implements c1 {
    public final c1 f47238a;
    public boolean f47239b;
    public final d f47240c;

    public c(d dVar, c1 c1Var) {
        this.f47240c = dVar;
        this.f47238a = c1Var;
    }

    @Override
    public final void a() {
        this.f47238a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f47240c.a() && this.f47238a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f47240c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f47239b) {
            hVar.setFlags(4);
            return -4;
        }
        long p5 = dVar.p();
        int f7 = this.f47238a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16641c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f47244e != 0) {
                i12 = 0;
            }
            if (dVar.f47245f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f16641c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f47245f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10980e >= j3) || (f7 == -3 && p5 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f47239b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f47240c.a()) {
            return -3;
        }
        return this.f47238a.j(j3);
    }
}
