package u2;
public final class m1 implements f1 {
    public int f47813a;
    public boolean f47814b;
    public final o1 f47815c;

    public m1(o1 o1Var) {
        this.f47815c = o1Var;
    }

    @Override
    public final void a() {
        o1 o1Var = this.f47815c;
        if (!o1Var.v) {
            o1Var.f47837r.a();
        }
    }

    public final void b() {
        if (!this.f47814b) {
            o1 o1Var = this.f47815c;
            o1Var.e.m(b2.v0.h(o1Var.f47838s.f4135s), o1Var.f47838s, 0, null, 0L);
            this.f47814b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f47815c.f47839w;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        b();
        o1 o1Var = this.f47815c;
        boolean z10 = o1Var.f47839w;
        if (z10 && o1Var.f47840x == null) {
            this.f47813a = 2;
        }
        int i11 = this.f47813a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            o1Var.f47840x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(o1Var.f47841y);
                hVar.f11661c.put(o1Var.f47840x, 0, o1Var.f47841y);
            }
            if ((i10 & 1) == 0) {
                this.f47813a = 2;
            }
            return -4;
        } else {
            bVar.f44864c = o1Var.f47838s;
            this.f47813a = 1;
            return -5;
        }
    }

    @Override
    public final int m(long j10) {
        b();
        if (j10 > 0 && this.f47813a != 2) {
            this.f47813a = 2;
            return 1;
        }
        return 0;
    }
}
