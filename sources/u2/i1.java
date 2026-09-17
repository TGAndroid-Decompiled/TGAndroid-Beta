package u2;
public final class i1 implements b1 {
    public int f46733a;
    public boolean f46734b;
    public final k1 f46735c;

    public i1(k1 k1Var) {
        this.f46735c = k1Var;
    }

    public final void a() {
        if (!this.f46734b) {
            k1 k1Var = this.f46735c;
            k1Var.f46750e.j(b2.r0.h(k1Var.f46754s.f2397r), k1Var.f46754s, 0, null, 0L);
            this.f46734b = true;
        }
    }

    @Override
    public final void b() {
        k1 k1Var = this.f46735c;
        if (!k1Var.v) {
            k1Var.f46753r.b();
        }
    }

    @Override
    public final boolean e() {
        return this.f46735c.f46755w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        a();
        k1 k1Var = this.f46735c;
        boolean z10 = k1Var.f46755w;
        if (z10 && k1Var.f46756x == null) {
            this.f46733a = 2;
        }
        int i11 = this.f46733a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f46756x.getClass();
            hVar.addFlag(1);
            hVar.f10877e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f46757y);
                hVar.f10876c.put(k1Var.f46756x, 0, k1Var.f46757y);
            }
            if ((i10 & 1) == 0) {
                this.f46733a = 2;
            }
            return -4;
        } else {
            yVar.f16524c = k1Var.f46754s;
            this.f46733a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j3) {
        a();
        if (j3 > 0 && this.f46733a != 2) {
            this.f46733a = 2;
            return 1;
        }
        return 0;
    }
}
