package v2;

import a8.ng;
import n4.s;
import u2.c1;
import u2.d1;
public final class g implements d1 {
    public final i f50009a;
    public final c1 f50010b;
    public final int f50011c;
    public boolean d;
    public final i e;

    public g(i iVar, i iVar2, c1 c1Var, int i10) {
        this.e = iVar;
        this.f50009a = iVar2;
        this.f50010b = c1Var;
        this.f50011c = i10;
    }

    public final void a() {
        if (!this.d) {
            i iVar = this.e;
            ng ngVar = iVar.h;
            int[] iArr = iVar.f50013b;
            int i10 = this.f50011c;
            ngVar.l(iArr[i10], iVar.f50014c[i10], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        i iVar = this.e;
        if (!iVar.v() && this.f50010b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(s sVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (!iVar.v()) {
            a aVar = iVar.L;
            c1 c1Var = this.f50010b;
            if (aVar != null && aVar.d(this.f50011c + 1) <= c1Var.v()) {
                return -3;
            }
            a();
            return c1Var.F(sVar, hVar, i10, iVar.P);
        }
        return -3;
    }

    @Override
    public final int j(long j10) {
        i iVar = this.e;
        if (iVar.v()) {
            return 0;
        }
        boolean z10 = iVar.P;
        c1 c1Var = this.f50010b;
        int x9 = c1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x9 = Math.min(x9, aVar.d(this.f50011c + 1) - c1Var.v());
        }
        c1Var.L(x9);
        if (x9 > 0) {
            a();
        }
        return x9;
    }

    @Override
    public final void d() {
    }
}
