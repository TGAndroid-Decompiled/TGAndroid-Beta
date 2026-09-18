package u2;
public final class i1 implements b1 {
    public int f43646a;
    public boolean f43647b;
    public final k1 f43648c;

    public i1(k1 k1Var) {
        this.f43648c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f43648c;
        if (!k1Var.v) {
            k1Var.f43665r.a();
        }
    }

    public final void b() {
        if (!this.f43647b) {
            k1 k1Var = this.f43648c;
            k1Var.e.k(b2.r0.h(k1Var.f43666s.f3309r), k1Var.f43666s, 0, null, 0L);
            this.f43647b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f43648c.f43667w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        k1 k1Var = this.f43648c;
        boolean z10 = k1Var.f43667w;
        if (z10 && k1Var.f43668x == null) {
            this.f43646a = 2;
        }
        int i11 = this.f43646a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f43668x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(k1Var.f43669y);
                hVar.f10096c.put(k1Var.f43668x, 0, k1Var.f43669y);
            }
            if ((i10 & 1) == 0) {
                this.f43646a = 2;
            }
            return -4;
        } else {
            yVar.f15180c = k1Var.f43666s;
            this.f43646a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f43646a != 2) {
            this.f43646a = 2;
            return 1;
        }
        return 0;
    }
}
