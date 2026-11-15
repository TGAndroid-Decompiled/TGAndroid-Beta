package x2;
public final class c implements b1 {
    public final b1 f59502a;
    public boolean f59503b;
    public final d f59504c;

    public c(d dVar, b1 b1Var) {
        this.f59504c = dVar;
        this.f59502a = b1Var;
    }

    @Override
    public final void a() {
        this.f59502a.a();
    }

    @Override
    public final boolean f() {
        if (!this.f59504c.a() && this.f59502a.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j3) {
        if (this.f59504c.a()) {
            return -3;
        }
        return this.f59502a.n(j3);
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        d dVar = this.f59504c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f59503b) {
            hVar.setFlags(4);
            return -4;
        }
        long s5 = dVar.s();
        int q10 = this.f59502a.q(aVar, hVar, i7);
        if (dVar.f59508e != -9223372036854775807L && q10 != -3) {
            dVar.f59508e = -9223372036854775807L;
        }
        if (q10 == -5) {
            long j3 = dVar.f59509f;
            long j10 = dVar.h;
            e2.u uVar = (e2.u) aVar.f17789c;
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
                aVar.f17789c = new e2.u(a10);
            }
            return -5;
        }
        long j11 = dVar.h;
        if (j11 != Long.MIN_VALUE && ((q10 == -4 && hVar.f17733e >= j11) || (q10 == -3 && s5 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f59503b = true;
            return -4;
        }
        return q10;
    }
}
