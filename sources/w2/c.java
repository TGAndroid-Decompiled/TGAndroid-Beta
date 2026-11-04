package w2;
public final class c implements d1 {
    public final d1 f57034a;
    public boolean f57035b;
    public final d f57036c;

    public c(d dVar, d1 d1Var) {
        this.f57036c = dVar;
        this.f57034a = d1Var;
    }

    @Override
    public final void a() {
        this.f57034a.a();
    }

    @Override
    public final boolean f() {
        if (!this.f57036c.a() && this.f57034a.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final int m(long j10) {
        if (this.f57036c.a()) {
            return -3;
        }
        return this.f57034a.m(j10);
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        d dVar = this.f57036c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f57035b) {
            hVar.setFlags(4);
            return -4;
        }
        long q10 = dVar.q();
        int o10 = this.f57034a.o(bVar, hVar, i3);
        if (dVar.f57069e != -9223372036854775807L && o10 != -3) {
            dVar.f57069e = -9223372036854775807L;
        }
        if (o10 == -5) {
            long j10 = dVar.f57070f;
            long j11 = dVar.h;
            d2.v vVar = (d2.v) bVar.f55095b;
            vVar.getClass();
            int i10 = vVar.O;
            int i11 = vVar.N;
            if (i11 != 0 || i10 != 0) {
                if (j10 != 0) {
                    i11 = 0;
                }
                if (j11 != Long.MIN_VALUE) {
                    i10 = 0;
                }
                d2.u a10 = vVar.a();
                a10.M = i11;
                a10.N = i10;
                bVar.f55095b = new d2.v(a10);
            }
            return -5;
        }
        long j12 = dVar.h;
        if (j12 != Long.MIN_VALUE && ((o10 == -4 && hVar.f16158e >= j12) || (o10 == -3 && q10 == Long.MIN_VALUE && !hVar.d))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f57035b = true;
            return -4;
        }
        return o10;
    }
}
