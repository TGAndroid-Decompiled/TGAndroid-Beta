package u2;
public final class c implements d1 {
    public final d1 f49846a;
    public boolean f49847b;
    public final d f49848c;

    public c(d dVar, d1 d1Var) {
        this.f49848c = dVar;
        this.f49846a = d1Var;
    }

    @Override
    public final void a() {
        this.f49846a.a();
    }

    @Override
    public final boolean e() {
        if (!this.f49848c.a() && this.f49846a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        if (this.f49848c.a()) {
            return -3;
        }
        return this.f49846a.i(j10);
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        d dVar = this.f49848c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f49847b) {
            hVar.setFlags(4);
            return -4;
        }
        long s10 = dVar.s();
        int r10 = this.f49846a.r(bVar, hVar, i10);
        if (dVar.e != -9223372036854775807L && r10 != -3) {
            dVar.e = -9223372036854775807L;
        }
        if (r10 == -5) {
            long j10 = dVar.f49879f;
            long j11 = dVar.h;
            b2.x xVar = (b2.x) bVar.f7659c;
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
                bVar.f7659c = new b2.x(a2);
            }
            return -5;
        }
        long j12 = dVar.h;
        if (j12 != Long.MIN_VALUE && ((r10 == -4 && hVar.e >= j12) || (r10 == -3 && s10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f49847b = true;
            return -4;
        }
        return r10;
    }
}
