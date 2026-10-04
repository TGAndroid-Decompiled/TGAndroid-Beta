package u2;
public final class j1 implements c1 {
    public int f47298a;
    public boolean f47299b;
    public final l1 f47300c;

    public j1(l1 l1Var) {
        this.f47300c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f47300c;
        if (!l1Var.v) {
            l1Var.f47316r.a();
        }
    }

    public final void b() {
        if (!this.f47299b) {
            l1 l1Var = this.f47300c;
            l1Var.f47313e.k(b2.r0.h(l1Var.f47317s.f3564r), l1Var.f47317s, 0, null, 0L);
            this.f47299b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47300c.f47318w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f47300c;
        boolean z10 = l1Var.f47318w;
        if (z10 && l1Var.f47319x == null) {
            this.f47298a = 2;
        }
        int i11 = this.f47298a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f47319x.getClass();
            hVar.addFlag(1);
            hVar.f10980e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(l1Var.f47320y);
                hVar.f10979c.put(l1Var.f47319x, 0, l1Var.f47320y);
            }
            if ((i10 & 1) == 0) {
                this.f47298a = 2;
            }
            return -4;
        } else {
            yVar.f16640c = l1Var.f47317s;
            this.f47298a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f47298a != 2) {
            this.f47298a = 2;
            return 1;
        }
        return 0;
    }
}
