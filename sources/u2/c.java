package u2;
public final class c implements b1 {
    public final b1 f46675a;
    public boolean f46676b;
    public final d f46677c;

    public c(d dVar, b1 b1Var) {
        this.f46677c = dVar;
        this.f46675a = b1Var;
    }

    @Override
    public final void b() {
        this.f46675a.b();
    }

    @Override
    public final boolean e() {
        if (!this.f46677c.e() && this.f46675a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        d dVar = this.f46677c;
        if (dVar.e()) {
            return -3;
        }
        if (this.f46676b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.f46675a.f(yVar, hVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16524c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f46681e != 0) {
                i12 = 0;
            }
            if (dVar.f46682f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f16524c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f46682f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && hVar.f10877e >= j3) || (f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f46676b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        if (this.f46677c.e()) {
            return -3;
        }
        return this.f46675a.m(j3);
    }
}
