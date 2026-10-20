package v2;

import u2.d1;
import u2.e1;
public final class g implements e1 {
    public final i f47897a;
    public final d1 f47898b;
    public final int f47899c;
    public boolean d;
    public final i e;

    public g(i iVar, i iVar2, d1 d1Var, int i10) {
        this.e = iVar;
        this.f47897a = iVar2;
        this.f47898b = d1Var;
        this.f47899c = i10;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.e;
            a5.a aVar = iVar.h;
            int[] iArr = iVar.f47901b;
            int i10 = this.f47899c;
            aVar.m(iArr[i10], iVar.f47902c[i10], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        i iVar = this.e;
        if (!iVar.y() && this.f47898b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (!iVar.y()) {
            a aVar = iVar.L;
            d1 d1Var = this.f47898b;
            if (aVar != null && aVar.d(this.f47899c + 1) <= d1Var.v()) {
                return -3;
            }
            b();
            return d1Var.F(bVar, hVar, i10, iVar.P);
        }
        return -3;
    }

    @Override
    public final int m(long j10) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.P;
        d1 d1Var = this.f47898b;
        int x10 = d1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f47899c + 1) - d1Var.v());
        }
        d1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final void a() {
    }
}
