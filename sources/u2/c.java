package u2;
public final class c implements b1 {
    public final b1 f46648a;
    public boolean f46649b;
    public final d f46650c;

    public c(d dVar, b1 b1Var) {
        this.f46650c = dVar;
        this.f46648a = b1Var;
    }

    @Override
    public final void b() {
        this.f46648a.b();
    }

    @Override
    public final boolean e() {
        if (!this.f46650c.e() && this.f46648a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        d dVar = this.f46650c;
        if (dVar.e()) {
            return -3;
        }
        if (this.f46649b) {
            gVar.f6773b = 4;
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.f46648a.f(yVar, gVar, i10);
        if (f7 == -5) {
            b2.s sVar = (b2.s) yVar.f16497c;
            sVar.getClass();
            int i11 = sVar.N;
            int i12 = sVar.M;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f46654e != 0) {
                i12 = 0;
            }
            if (dVar.f46655f != Long.MIN_VALUE) {
                i11 = 0;
            }
            b2.r a2 = sVar.a();
            a2.L = i12;
            a2.M = i11;
            yVar.f16497c = new b2.s(a2);
            return -5;
        }
        long j3 = dVar.f46655f;
        if (j3 != Long.MIN_VALUE && ((f7 == -4 && gVar.h >= j3) || (f7 == -3 && s10 == Long.MIN_VALUE && !gVar.f10848f))) {
            gVar.i();
            gVar.f6773b = 4;
            this.f46649b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int m(long j3) {
        if (this.f46650c.e()) {
            return -3;
        }
        return this.f46648a.m(j3);
    }
}
