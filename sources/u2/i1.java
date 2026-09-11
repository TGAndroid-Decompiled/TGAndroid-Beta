package u2;
public final class i1 implements b1 {
    public int f46704a;
    public boolean f46705b;
    public final k1 f46706c;

    public i1(k1 k1Var) {
        this.f46706c = k1Var;
    }

    public final void a() {
        if (!this.f46705b) {
            k1 k1Var = this.f46706c;
            k1Var.f46721e.j(b2.r0.h(k1Var.f46725s.f2370r), k1Var.f46725s, 0, null, 0L);
            this.f46705b = true;
        }
    }

    @Override
    public final void b() {
        k1 k1Var = this.f46706c;
        if (!k1Var.v) {
            k1Var.f46724r.b();
        }
    }

    @Override
    public final boolean e() {
        return this.f46706c.f46726w;
    }

    @Override
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        a();
        k1 k1Var = this.f46706c;
        boolean z10 = k1Var.f46726w;
        if (z10 && k1Var.f46727x == null) {
            this.f46704a = 2;
        }
        int i11 = this.f46704a;
        if (i11 == 2) {
            gVar.a(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f46727x.getClass();
            gVar.a(1);
            gVar.h = 0L;
            if ((i10 & 4) == 0) {
                gVar.l(k1Var.f46728y);
                gVar.f10847e.put(k1Var.f46727x, 0, k1Var.f46728y);
            }
            if ((i10 & 1) == 0) {
                this.f46704a = 2;
            }
            return -4;
        } else {
            yVar.f16497c = k1Var.f46725s;
            this.f46704a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j3) {
        a();
        if (j3 > 0 && this.f46704a != 2) {
            this.f46704a = 2;
            return 1;
        }
        return 0;
    }
}
