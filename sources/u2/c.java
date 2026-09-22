package u2;
public final class c implements b1 {
    public final b1 f43335a;
    public boolean f43336b;
    public final d f43337c;

    public c(d dVar, b1 b1Var) {
        this.f43337c = dVar;
        this.f43335a = b1Var;
    }

    @Override
    public final void a() {
        this.f43335a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f43337c.b() && this.f43335a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f43337c;
        if (dVar.b()) {
            return -3;
        }
        if (this.f43336b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.f43335a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f14993c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.e != 0) {
                i12 = 0;
            }
            if (dVar.f43341f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f14993c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f43341f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j3) || (f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f43336b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f43337c.b()) {
            return -3;
        }
        return this.f43335a.j(j3);
    }
}
