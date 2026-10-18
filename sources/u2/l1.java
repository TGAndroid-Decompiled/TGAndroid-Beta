package u2;
public final class l1 implements e1 {
    public int f47349a;
    public boolean f47350b;
    public final n1 f47351c;

    public l1(n1 n1Var) {
        this.f47351c = n1Var;
    }

    @Override
    public final void a() {
        n1 n1Var = this.f47351c;
        if (!n1Var.v) {
            n1Var.f47373r.a();
        }
    }

    public final void b() {
        if (!this.f47350b) {
            n1 n1Var = this.f47351c;
            n1Var.e.m(b2.v0.h(n1Var.f47374s.f4132s), n1Var.f47374s, 0, null, 0L);
            this.f47350b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f47351c.f47375w;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        b();
        n1 n1Var = this.f47351c;
        boolean z10 = n1Var.f47375w;
        if (z10 && n1Var.f47376x == null) {
            this.f47349a = 2;
        }
        int i11 = this.f47349a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            n1Var.f47376x.getClass();
            hVar.addFlag(1);
            hVar.e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(n1Var.f47377y);
                hVar.f11635c.put(n1Var.f47376x, 0, n1Var.f47377y);
            }
            if ((i10 & 1) == 0) {
                this.f47349a = 2;
            }
            return -4;
        } else {
            bVar.f44443c = n1Var.f47374s;
            this.f47349a = 1;
            return -5;
        }
    }

    @Override
    public final int h(long j10) {
        b();
        if (j10 > 0 && this.f47349a != 2) {
            this.f47349a = 2;
            return 1;
        }
        return 0;
    }
}
