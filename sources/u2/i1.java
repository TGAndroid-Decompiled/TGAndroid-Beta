package u2;
public final class i1 implements b1 {
    public int f46732a;
    public boolean f46733b;
    public final k1 f46734c;

    public i1(k1 k1Var) {
        this.f46734c = k1Var;
    }

    public final void a() {
        if (!this.f46733b) {
            k1 k1Var = this.f46734c;
            k1Var.f46749e.j(b2.r0.h(k1Var.f46753s.f2397r), k1Var.f46753s, 0, null, 0L);
            this.f46733b = true;
        }
    }

    @Override
    public final void b() {
        k1 k1Var = this.f46734c;
        if (!k1Var.v) {
            k1Var.f46752r.b();
        }
    }

    @Override
    public final boolean e() {
        return this.f46734c.f46754w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        a();
        k1 k1Var = this.f46734c;
        boolean z10 = k1Var.f46754w;
        if (z10 && k1Var.f46755x == null) {
            this.f46732a = 2;
        }
        int i11 = this.f46732a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f46755x.getClass();
            hVar.addFlag(1);
            hVar.f10877e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f46756y);
                hVar.f10876c.put(k1Var.f46755x, 0, k1Var.f46756y);
            }
            if ((i10 & 1) == 0) {
                this.f46732a = 2;
            }
            return -4;
        } else {
            yVar.f16524c = k1Var.f46753s;
            this.f46732a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j3) {
        a();
        if (j3 > 0 && this.f46732a != 2) {
            this.f46732a = 2;
            return 1;
        }
        return 0;
    }
}
