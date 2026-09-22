package u2;
public final class c implements c1 {
    public final c1 f43659a;
    public boolean f43660b;
    public final d f43661c;

    public c(d dVar, c1 c1Var) {
        this.f43661c = dVar;
        this.f43659a = c1Var;
    }

    @Override
    public final void a() {
        this.f43659a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f43661c.b() && this.f43659a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f43661c;
        if (dVar.b()) {
            return -3;
        }
        if (this.f43660b) {
            hVar.setFlags(4);
            return -4;
        }
        long t10 = dVar.t();
        int f7 = this.f43659a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f15231b;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.e != 0) {
                i12 = 0;
            }
            if (dVar.f43665f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f15231b = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f43665f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j3) || (f7 == -3 && t10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f43660b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int j(long j3) {
        if (this.f43661c.b()) {
            return -3;
        }
        return this.f43659a.j(j3);
    }
}
