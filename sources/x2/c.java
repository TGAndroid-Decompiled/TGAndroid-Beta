package x2;
public final class c implements c1 {
    public final c1 f58208a;
    public boolean f58209b;
    public final d f58210c;

    public c(d dVar, c1 c1Var) {
        this.f58210c = dVar;
        this.f58208a = c1Var;
    }

    @Override
    public final void a() {
        this.f58208a.a();
    }

    @Override
    public final boolean f() {
        if (!this.f58210c.f() && this.f58208a.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j3) {
        if (this.f58210c.f()) {
            return -3;
        }
        return this.f58208a.l(j3);
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        d dVar = this.f58210c;
        if (dVar.f()) {
            return -3;
        }
        if (this.f58209b) {
            hVar.setFlags(4);
            return -4;
        }
        long p10 = dVar.p();
        int m10 = this.f58208a.m(bVar, hVar, i7);
        if (dVar.f58220e != -9223372036854775807L && m10 != -3) {
            dVar.f58220e = -9223372036854775807L;
        }
        if (m10 == -5) {
            long j3 = dVar.f58221f;
            long j10 = dVar.h;
            e2.u uVar = (e2.u) bVar.f57564c;
            uVar.getClass();
            int i10 = uVar.O;
            int i11 = uVar.N;
            if (i11 != 0 || i10 != 0) {
                if (j3 != 0) {
                    i11 = 0;
                }
                if (j10 != Long.MIN_VALUE) {
                    i10 = 0;
                }
                e2.t a10 = uVar.a();
                a10.M = i11;
                a10.N = i10;
                bVar.f57564c = new e2.u(a10);
            }
            return -5;
        }
        long j11 = dVar.h;
        if (j11 != Long.MIN_VALUE && ((m10 == -4 && hVar.f17173e >= j11) || (m10 == -3 && p10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f58209b = true;
            return -4;
        }
        return m10;
    }
}
