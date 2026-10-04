package u2;
public final class j1 implements c1 {
    public int f47307a;
    public boolean f47308b;
    public final l1 f47309c;

    public j1(l1 l1Var) {
        this.f47309c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f47309c;
        if (!l1Var.v) {
            l1Var.f47325r.a();
        }
    }

    public final void b() {
        if (!this.f47308b) {
            l1 l1Var = this.f47309c;
            l1Var.f47322e.k(b2.r0.h(l1Var.f47326s.f3564r), l1Var.f47326s, 0, null, 0L);
            this.f47308b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47309c.f47327w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f47309c;
        boolean z10 = l1Var.f47327w;
        if (z10 && l1Var.f47328x == null) {
            this.f47307a = 2;
        }
        int i11 = this.f47307a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f47328x.getClass();
            hVar.addFlag(1);
            hVar.f10981e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(l1Var.f47329y);
                hVar.f10980c.put(l1Var.f47328x, 0, l1Var.f47329y);
            }
            if ((i10 & 1) == 0) {
                this.f47307a = 2;
            }
            return -4;
        } else {
            yVar.f16645c = l1Var.f47326s;
            this.f47307a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f47307a != 2) {
            this.f47307a = 2;
            return 1;
        }
        return 0;
    }
}
