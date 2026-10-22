package u2;
public final class d implements e1 {
    public final e1 f47279a;
    public boolean f47280b;
    public final e f47281c;

    public d(e eVar, e1 e1Var) {
        this.f47281c = eVar;
        this.f47279a = e1Var;
    }

    @Override
    public final void a() {
        this.f47279a.a();
    }

    @Override
    public final boolean f() {
        if (!this.f47281c.b() && this.f47279a.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        e eVar = this.f47281c;
        if (eVar.b()) {
            return -3;
        }
        if (this.f47280b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = eVar.s();
        int g10 = this.f47279a.g(bVar, hVar, i10);
        if (eVar.e != -9223372036854775807L && g10 != -3) {
            eVar.e = -9223372036854775807L;
        }
        if (g10 == -5) {
            long j10 = eVar.f47307f;
            long j11 = eVar.h;
            b2.w wVar = (b2.w) bVar.f44451c;
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
                bVar.f44451c = new b2.w(a2);
            }
            return -5;
        }
        long j12 = eVar.h;
        if (j12 != Long.MIN_VALUE && ((g10 == -4 && hVar.e >= j12) || (g10 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f47280b = true;
            return -4;
        }
        return g10;
    }

    @Override
    public final int m(long j10) {
        if (this.f47281c.b()) {
            return -3;
        }
        return this.f47279a.m(j10);
    }
}
