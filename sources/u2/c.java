package u2;
public final class c implements a1 {
    public final a1 f43268a;
    public boolean f43269b;
    public final d f43270c;

    public c(d dVar, a1 a1Var) {
        this.f43270c = dVar;
        this.f43268a = a1Var;
    }

    @Override
    public final void a() {
        this.f43268a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f43270c.b() && this.f43268a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f43270c;
        if (dVar.b()) {
            return -3;
        }
        if (this.f43269b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.f43268a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f14970c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.e != 0) {
                i12 = 0;
            }
            if (dVar.f43274f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f14970c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f43274f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j3) || (f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f43269b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f43270c.b()) {
            return -3;
        }
        return this.f43268a.j(j3);
    }
}
