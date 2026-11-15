package x2;
public final class i1 implements b1 {
    public int f59558a;
    public boolean f59559b;
    public final k1 f59560c;

    public i1(k1 k1Var) {
        this.f59560c = k1Var;
    }

    @Override
    public final void a() {
        k1 k1Var = this.f59560c;
        if (!k1Var.f59580w) {
            k1Var.f59578r.a();
        }
    }

    public final void b() {
        if (!this.f59559b) {
            k1 k1Var = this.f59560c;
            k1Var.f59575e.i(e2.s0.h(k1Var.f59579s.f10451s), k1Var.f59579s, 0, null, 0L);
            this.f59559b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f59560c.f59581x;
    }

    @Override
    public final int n(long j3) {
        b();
        if (j3 > 0 && this.f59558a != 2) {
            this.f59558a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        b();
        k1 k1Var = this.f59560c;
        boolean z10 = k1Var.f59581x;
        if (z10 && k1Var.f59582y == null) {
            this.f59558a = 2;
        }
        int i10 = this.f59558a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i7 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            k1Var.f59582y.getClass();
            hVar.addFlag(1);
            hVar.f17733e = 0L;
            if ((i7 & 4) == 0) {
                hVar.b(k1Var.E);
                hVar.f17732c.put(k1Var.f59582y, 0, k1Var.E);
            }
            if ((i7 & 1) == 0) {
                this.f59558a = 2;
            }
            return -4;
        } else {
            aVar.f17789c = k1Var.f59579s;
            this.f59558a = 1;
            return -5;
        }
    }
}
