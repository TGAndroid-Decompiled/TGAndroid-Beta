package u2;
public final class h1 implements a1 {
    public int f48704a;
    public boolean f48705b;
    public final j1 f48706c;

    public h1(j1 j1Var) {
        this.f48706c = j1Var;
    }

    @Override
    public final void a() {
        j1 j1Var = this.f48706c;
        if (!j1Var.v) {
            j1Var.f48723r.a();
        }
    }

    public final void b() {
        if (!this.f48705b) {
            j1 j1Var = this.f48706c;
            j1Var.f48720e.l(b2.r0.h(j1Var.f48724s.f3643r), j1Var.f48724s, 0, null, 0L);
            this.f48705b = true;
        }
    }

    @Override
    public final boolean e() {
        return this.f48706c.f48725w;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        b();
        j1 j1Var = this.f48706c;
        boolean z10 = j1Var.f48725w;
        if (z10 && j1Var.f48726x == null) {
            this.f48704a = 2;
        }
        int i11 = this.f48704a;
        if (i11 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            j1Var.f48726x.getClass();
            hVar.addFlag(1);
            hVar.f10985e = 0L;
            if ((i10 & 4) == 0) {
                hVar.b(j1Var.f48727y);
                hVar.f10984c.put(j1Var.f48726x, 0, j1Var.f48727y);
            }
            if ((i10 & 1) == 0) {
                this.f48704a = 2;
            }
            return -4;
        } else {
            xVar.f16695c = j1Var.f48724s;
            this.f48704a = 1;
            return -5;
        }
    }

    @Override
    public final int j(long j3) {
        b();
        if (j3 > 0 && this.f48704a != 2) {
            this.f48704a = 2;
            return 1;
        }
        return 0;
    }
}
