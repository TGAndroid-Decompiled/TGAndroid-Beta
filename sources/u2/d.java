package u2;
public final class d implements f1 {
    public final f1 f47723a;
    public boolean f47724b;
    public final e f47725c;

    public d(e eVar, f1 f1Var) {
        this.f47725c = eVar;
        this.f47723a = f1Var;
    }

    @Override
    public final void a() {
        this.f47723a.a();
    }

    @Override
    public final boolean f() {
        if (!this.f47725c.e() && this.f47723a.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        e eVar = this.f47725c;
        if (eVar.e()) {
            return -3;
        }
        if (this.f47724b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = eVar.s();
        int g10 = this.f47723a.g(bVar, hVar, i10);
        if (eVar.e != -9223372036854775807L && g10 != -3) {
            eVar.e = -9223372036854775807L;
        }
        if (g10 == -5) {
            long j10 = eVar.f47734f;
            long j11 = eVar.h;
            b2.w wVar = (b2.w) bVar.f44864c;
            wVar.getClass();
            int i11 = wVar.O;
            int i12 = wVar.N;
            if (i12 != 0 || i11 != 0) {
                if (j10 != 0) {
                    i12 = 0;
                }
                if (j11 != Long.MIN_VALUE) {
                    i11 = 0;
                }
                b2.v a2 = wVar.a();
                a2.M = i12;
                a2.N = i11;
                bVar.f44864c = new b2.w(a2);
            }
            return -5;
        }
        long j12 = eVar.h;
        if (j12 != Long.MIN_VALUE && ((g10 == -4 && hVar.e >= j12) || (g10 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f47724b = true;
            return -4;
        }
        return g10;
    }

    @Override
    public final int m(long j10) {
        if (this.f47725c.e()) {
            return -3;
        }
        return this.f47723a.m(j10);
    }
}
