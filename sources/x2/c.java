package x2;
public final class c implements d1 {
    public final d1 f60169a;
    public boolean f60170b;
    public final d f60171c;

    public c(d dVar, d1 d1Var) {
        this.f60171c = dVar;
        this.f60169a = d1Var;
    }

    @Override
    public final void a() {
        this.f60169a.a();
    }

    @Override
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        d dVar = this.f60171c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f60170b) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = dVar.r();
        int b10 = this.f60169a.b(mVar, hVar, i7);
        if (dVar.f60204e != -9223372036854775807L && b10 != -3) {
            dVar.f60204e = -9223372036854775807L;
        }
        if (b10 == -5) {
            long j3 = dVar.f60205f;
            long j10 = dVar.h;
            e2.u uVar = (e2.u) mVar.f17465c;
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
                mVar.f17465c = new e2.u(a10);
            }
            return -5;
        }
        long j11 = dVar.h;
        if (j11 != Long.MIN_VALUE && ((b10 == -4 && hVar.f18224e >= j11) || (b10 == -3 && r10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f60170b = true;
            return -4;
        }
        return b10;
    }

    @Override
    public final boolean h() {
        if (!this.f60171c.a() && this.f60169a.h()) {
            return true;
        }
        return false;
    }

    @Override
    public final int o(long j3) {
        if (this.f60171c.a()) {
            return -3;
        }
        return this.f60169a.o(j3);
    }
}
