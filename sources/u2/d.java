package u2;
public final class d implements d1 {
    public final d1 f47311a;
    public boolean f47312b;
    public final e f47313c;

    public d(e eVar, d1 d1Var) {
        this.f47313c = eVar;
        this.f47311a = d1Var;
    }

    @Override
    public final void a() {
        this.f47311a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f47313c.a() && this.f47311a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        e eVar = this.f47313c;
        if (eVar.a()) {
            return -3;
        }
        if (this.f47312b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = eVar.s();
        int f7 = this.f47311a.f(bVar, hVar, i10);
        if (eVar.e != -9223372036854775807L && f7 != -3) {
            eVar.e = -9223372036854775807L;
        }
        if (f7 == -5) {
            long j10 = eVar.f47317f;
            long j11 = eVar.h;
            b2.w wVar = (b2.w) bVar.f44466c;
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
                bVar.f44466c = new b2.w(a2);
            }
            return -5;
        }
        long j12 = eVar.h;
        if (j12 != Long.MIN_VALUE && ((f7 == -4 && hVar.e >= j12) || (f7 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f47312b = true;
            return -4;
        }
        return f7;
    }

    @Override
    public final int h(long j10) {
        if (this.f47313c.a()) {
            return -3;
        }
        return this.f47311a.h(j10);
    }
}
