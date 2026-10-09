package u2;
public final class i1 implements b1 {
    public int f48605a;
    public boolean f48606b;
    public final k1 f48607c;

    public i1(k1 k1Var) {
        this.f48607c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f48607c;
        if (!k1Var.v) {
            k1Var.f48625r.a();
        }
    }

    public final void b() {
        if (!this.f48606b) {
            k1 k1Var = this.f48607c;
            k1Var.f48622e.l(b2.r0.h(k1Var.f48626s.f3643r), k1Var.f48626s, 0, null, 0L);
            this.f48606b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f48607c.f48627w;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f48607c;
        boolean z10 = k1Var.f48627w;
        if (z10 && k1Var.f48628x == null) {
            this.f48605a = 2;
        }
        int i11 = this.f48605a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f48628x.getClass();
            hVar.addFlag(1);
            hVar.f10986e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f48629y);
                hVar.f10985c.put(k1Var.f48628x, 0, k1Var.f48629y);
            }
            if ((i10 & 1) == 0) {
                this.f48605a = 2;
            }
            return -4;
        } else {
            xVar.f16613c = k1Var.f48626s;
            this.f48605a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f48605a != 2) {
            this.f48605a = 2;
            return 1;
        }
        return 0;
    }
}
