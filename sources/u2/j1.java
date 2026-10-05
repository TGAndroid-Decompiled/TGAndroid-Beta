package u2;
public final class j1 implements c1 {
    public int f47314a;
    public boolean f47315b;
    public final l1 f47316c;

    public j1(l1 l1Var) {
        this.f47316c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f47316c;
        if (!l1Var.v) {
            l1Var.f47332r.a();
        }
    }

    public final void b() {
        if (!this.f47315b) {
            l1 l1Var = this.f47316c;
            l1Var.f47329e.k(b2.r0.h(l1Var.f47333s.f3564r), l1Var.f47333s, 0, null, 0L);
            this.f47315b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47316c.f47334w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f47316c;
        boolean z10 = l1Var.f47334w;
        if (z10 && l1Var.f47335x == null) {
            this.f47314a = 2;
        }
        int i11 = this.f47314a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f47335x.getClass();
            hVar.addFlag(1);
            hVar.f10981e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(l1Var.f47336y);
                hVar.f10980c.put(l1Var.f47335x, 0, l1Var.f47336y);
            }
            if ((i10 & 1) == 0) {
                this.f47314a = 2;
            }
            return -4;
        } else {
            yVar.f16650c = l1Var.f47333s;
            this.f47314a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f47314a != 2) {
            this.f47314a = 2;
            return 1;
        }
        return 0;
    }
}
