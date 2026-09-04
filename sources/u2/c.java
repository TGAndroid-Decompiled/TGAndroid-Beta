package u2;
public final class c implements b1 {
    public final b1 f46647a;
    public boolean f46648b;
    public final d f46649c;

    public c(d dVar, b1 b1Var) {
        this.f46649c = dVar;
        this.f46647a = b1Var;
    }

    @Override
    public final void b() {
        this.f46647a.b();
    }

    @Override
    public final boolean e() {
        if (!this.f46649c.e() && this.f46647a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        d dVar = this.f46649c;
        if (dVar.e()) {
            return -3;
        }
        if (this.f46648b) {
            gVar.f6773b = 4;
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.f46647a.f(yVar, gVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16497c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f46653e != 0) {
                i12 = 0;
            }
            if (dVar.f46654f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f16497c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f46654f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && gVar.h >= j3) || (f7 == -3 && s10 == Long.MIN_VALUE && !gVar.f10848f))) {
            gVar.i();
            gVar.f6773b = 4;
            this.f46648b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        if (this.f46649c.e()) {
            return -3;
        }
        return this.f46647a.m(j3);
    }
}
