package v2;

import u2.b1;
import u2.c1;
public final class g implements c1 {
    public final i f47937a;
    public final b1 f47938b;
    public final int f47939c;
    public boolean d;
    public final i e;

    public g(i iVar, i iVar2, b1 b1Var, int i10) {
        this.e = iVar;
        this.f47937a = iVar2;
        this.f47938b = b1Var;
        this.f47939c = i10;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.e;
            a5.a aVar = iVar.h;
            int[] iArr = iVar.f47941b;
            int i10 = this.f47939c;
            aVar.m(iArr[i10], iVar.f47942c[i10], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        i iVar = this.e;
        if (!iVar.y() && this.f47938b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (!iVar.y()) {
            a aVar = iVar.L;
            b1 b1Var = this.f47938b;
            if (aVar != null && aVar.d(this.f47939c + 1) <= b1Var.v()) {
                return -3;
            }
            b();
            return b1Var.F(bVar, hVar, i10, iVar.P);
        }
        return -3;
    }

    @Override
    public final int h(long j10) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.P;
        b1 b1Var = this.f47938b;
        int x10 = b1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f47939c + 1) - b1Var.v());
        }
        b1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final void a() {
    }
}
