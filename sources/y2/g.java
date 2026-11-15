package y2;

import a8.xa;
import x2.a1;
import x2.b1;
public final class g implements b1 {
    public final i f60122a;
    public final a1 f60123b;
    public final int f60124c;
    public boolean d;
    public final i f60125e;

    public g(i iVar, i iVar2, a1 a1Var, int i7) {
        this.f60125e = iVar;
        this.f60122a = iVar2;
        this.f60123b = a1Var;
        this.f60124c = i7;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.f60125e;
            xa xaVar = iVar.h;
            int[] iArr = iVar.f60127b;
            int i7 = this.f60124c;
            xaVar.i(iArr[i7], iVar.f60128c[i7], 0, null, iVar.K);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        i iVar = this.f60125e;
        if (!iVar.z() && this.f60123b.A(iVar.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j3) {
        i iVar = this.f60125e;
        if (iVar.z()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        a1 a1Var = this.f60123b;
        int x10 = a1Var.x(j3, z10);
        a aVar = iVar.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f60124c + 1) - a1Var.v());
        }
        a1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        i iVar = this.f60125e;
        if (!iVar.z()) {
            a aVar2 = iVar.M;
            a1 a1Var = this.f60123b;
            if (aVar2 != null && aVar2.d(this.f60124c + 1) <= a1Var.v()) {
                return -3;
            }
            b();
            return a1Var.F(aVar, hVar, i7, iVar.Q);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
