package u2;
public final class h1 implements a1 {
    public int f48819a;
    public boolean f48820b;
    public final j1 f48821c;

    public h1(j1 j1Var) {
        this.f48821c = j1Var;
    }

    @Override
    public final void a() {
        j1 j1Var = this.f48821c;
        if (!j1Var.v) {
            j1Var.f48838r.a();
        }
    }

    public final void b() {
        if (!this.f48820b) {
            j1 j1Var = this.f48821c;
            j1Var.f48835e.l(b2.r0.h(j1Var.f48839s.f3641r), j1Var.f48839s, 0, null, 0L);
            this.f48820b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f48821c.f48840w;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        b();
        j1 j1Var = this.f48821c;
        boolean z10 = j1Var.f48840w;
        if (z10 && j1Var.f48841x == null) {
            this.f48819a = 2;
        }
        int i11 = this.f48819a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            j1Var.f48841x.getClass();
            hVar.addFlag(1);
            hVar.f10984e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(j1Var.f48842y);
                hVar.f10983c.put(j1Var.f48841x, 0, j1Var.f48842y);
            }
            if ((i10 & 1) == 0) {
                this.f48819a = 2;
            }
            return -4;
        } else {
            yVar.f16364c = j1Var.f48839s;
            this.f48819a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f48819a != 2) {
            this.f48819a = 2;
            return 1;
        }
        return 0;
    }
}
