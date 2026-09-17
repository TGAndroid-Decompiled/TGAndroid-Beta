package u2;
public final class i1 implements b1 {
    public int f46705a;
    public boolean f46706b;
    public final k1 f46707c;

    public i1(k1 k1Var) {
        this.f46707c = k1Var;
    }

    public final void a() {
        if (!this.f46706b) {
            k1 k1Var = this.f46707c;
            k1Var.f46722e.j(b2.r0.h(k1Var.f46726s.f2370r), k1Var.f46726s, 0, null, 0L);
            this.f46706b = true;
        }
    }

    @Override
    public final void b() {
        k1 k1Var = this.f46707c;
        if (!k1Var.v) {
            k1Var.f46725r.b();
        }
    }

    @Override
    public final boolean e() {
        return this.f46707c.f46727w;
    }

    @Override
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        a();
        k1 k1Var = this.f46707c;
        boolean z10 = k1Var.f46727w;
        if (z10 && k1Var.f46728x == null) {
            this.f46705a = 2;
        }
        int i11 = this.f46705a;
        if (i11 == 2) {
            gVar.a(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f46728x.getClass();
            gVar.a(1);
            gVar.h = 0L;
            if ((i10 & 4) == 0) {
                gVar.l(k1Var.f46729y);
                gVar.f10847e.put(k1Var.f46728x, 0, k1Var.f46729y);
            }
            if ((i10 & 1) == 0) {
                this.f46705a = 2;
            }
            return -4;
        } else {
            yVar.f16497c = k1Var.f46726s;
            this.f46705a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j3) {
        a();
        if (j3 > 0 && this.f46705a != 2) {
            this.f46705a = 2;
            return 1;
        }
        return 0;
    }
}
