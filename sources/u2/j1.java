package u2;
public final class j1 implements c1 {
    public int f47299a;
    public boolean f47300b;
    public final l1 f47301c;

    public j1(l1 l1Var) {
        this.f47301c = l1Var;
    }

    @Override
    public final void a() {
        l1 l1Var = this.f47301c;
        if (!l1Var.v) {
            l1Var.f47317r.a();
        }
    }

    public final void b() {
        if (!this.f47300b) {
            l1 l1Var = this.f47301c;
            l1Var.f47314e.k(b2.r0.h(l1Var.f47318s.f3564r), l1Var.f47318s, 0, null, 0L);
            this.f47300b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47301c.f47319w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        l1 l1Var = this.f47301c;
        boolean z10 = l1Var.f47319w;
        if (z10 && l1Var.f47320x == null) {
            this.f47299a = 2;
        }
        int i11 = this.f47299a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            l1Var.f47320x.getClass();
            hVar.addFlag(1);
            hVar.f10980e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(l1Var.f47321y);
                hVar.f10979c.put(l1Var.f47320x, 0, l1Var.f47321y);
            }
            if ((i10 & 1) == 0) {
                this.f47299a = 2;
            }
            return -4;
        } else {
            yVar.f16641c = l1Var.f47318s;
            this.f47299a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f47299a != 2) {
            this.f47299a = 2;
            return 1;
        }
        return 0;
    }
}
