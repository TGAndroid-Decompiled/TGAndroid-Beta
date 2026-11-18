package x2;
public final class c implements d1 {
    public final d1 f60041a;
    public boolean f60042b;
    public final d f60043c;

    public c(d dVar, d1 d1Var) {
        this.f60043c = dVar;
        this.f60041a = d1Var;
    }

    @Override
    public final void a() {
        this.f60041a.a();
    }

    @Override
    public final boolean h() {
        if (!this.f60043c.a() && this.f60041a.h()) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j3) {
        if (this.f60043c.a()) {
            return -3;
        }
        return this.f60041a.j(j3);
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        d dVar = this.f60043c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f60042b) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = dVar.r();
        int m10 = this.f60041a.m(aVar, hVar, i7);
        if (dVar.f60076e != -9223372036854775807L && m10 != -3) {
            dVar.f60076e = -9223372036854775807L;
        }
        if (m10 == -5) {
            long j3 = dVar.f60077f;
            long j10 = dVar.h;
            e2.u uVar = (e2.u) aVar.f18181c;
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
                aVar.f18181c = new e2.u(a10);
            }
            return -5;
        }
        long j11 = dVar.h;
        if (j11 != Long.MIN_VALUE && ((m10 == -4 && hVar.f18125e >= j11) || (m10 == -3 && r10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f60042b = true;
            return -4;
        }
        return m10;
    }
}
