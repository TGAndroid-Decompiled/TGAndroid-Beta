package u2;
public final class d implements d1 {
    public final d1 f45904a;
    public boolean f45905b;
    public final e f45906c;

    public d(e eVar, d1 d1Var) {
        this.f45906c = eVar;
        this.f45904a = d1Var;
    }

    @Override
    public final void d() {
        this.f45904a.d();
    }

    @Override
    public final boolean e() {
        if (!this.f45906c.a() && this.f45904a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        e eVar = this.f45906c;
        if (eVar.a()) {
            return -3;
        }
        if (this.f45905b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = eVar.s();
        int f7 = this.f45904a.f(bVar, hVar, i10);
        if (eVar.e != -9223372036854775807L && f7 != -3) {
            eVar.e = -9223372036854775807L;
        }
        if (f7 == -5) {
            long j10 = eVar.f45910f;
            long j11 = eVar.h;
            b2.x xVar = (b2.x) bVar.f43356c;
            xVar.getClass();
            int i11 = xVar.O;
            int i12 = xVar.N;
            if (i12 != 0 || i11 != 0) {
                if (j10 != 0) {
                    i12 = 0;
                }
                if (j11 != Long.MIN_VALUE) {
                    i11 = 0;
                }
                b2.w a2 = xVar.a();
                a2.M = i12;
                a2.N = i11;
                bVar.f43356c = new b2.x(a2);
            }
            return -5;
        }
        long j12 = eVar.h;
        if (j12 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j12) || (f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f45905b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int m(long j10) {
        if (this.f45906c.a()) {
            return -3;
        }
        return this.f45904a.m(j10);
    }
}
