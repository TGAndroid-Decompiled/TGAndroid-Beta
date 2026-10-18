package u2;
public final class c implements c1 {
    public final c1 f47331a;
    public boolean f47332b;
    public final d f47333c;

    public c(d dVar, c1 c1Var) {
        this.f47333c = dVar;
        this.f47331a = c1Var;
    }

    @Override
    public final void a() {
        this.f47331a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f47333c.a() && this.f47331a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        d dVar = this.f47333c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f47332b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int f7 = this.f47331a.f(bVar, hVar, i10);
        if (dVar.e != -9223372036854775807L && f7 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (f7 == -5) {
            long j10 = dVar.f47337f;
            long j11 = dVar.h;
            b2.w wVar = (b2.w) bVar.f44486c;
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
                bVar.f44486c = new b2.w(a2);
            }
            return -5;
        }
        long j12 = dVar.h;
        if (j12 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j12) || (f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f47332b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int h(long j10) {
        if (this.f47333c.a()) {
            return -3;
        }
        return this.f47331a.h(j10);
    }
}
