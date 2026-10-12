package u2;
public final class c implements a1 {
    public final a1 f48760a;
    public boolean f48761b;
    public final d f48762c;

    public c(d dVar, a1 a1Var) {
        this.f48762c = dVar;
        this.f48760a = a1Var;
    }

    @Override
    public final void a() {
        this.f48760a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f48762c.e() && this.f48760a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f48762c;
        if (dVar.e()) {
            return -3;
        }
        if (this.f48761b) {
            hVar.setFlags(4);
            return -4;
        }
        long p5 = dVar.p();
        int f7 = this.f48760a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16363c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f48766e != 0) {
                i12 = 0;
            }
            if (dVar.f48767f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f16363c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f48767f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10984e >= j3) || (f7 == -3 && p5 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f48761b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f48762c.e()) {
            return -3;
        }
        return this.f48760a.j(j3);
    }
}
