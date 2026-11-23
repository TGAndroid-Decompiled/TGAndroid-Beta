package y2;

import a8.xa;
import x2.c1;
import x2.d1;
public final class g implements d1 {
    public final i f60816a;
    public final c1 f60817b;
    public final int f60818c;
    public boolean d;
    public final i f60819e;

    public g(i iVar, i iVar2, c1 c1Var, int i7) {
        this.f60819e = iVar;
        this.f60816a = iVar2;
        this.f60817b = c1Var;
        this.f60818c = i7;
    }

    @Override
    public final int b(jb.m mVar, k2.h hVar, int i7) {
        i iVar = this.f60819e;
        if (!iVar.z()) {
            a aVar = iVar.M;
            c1 c1Var = this.f60817b;
            if (aVar != null && aVar.d(this.f60818c + 1) <= c1Var.v()) {
                return -3;
            }
            c();
            return c1Var.F(mVar, hVar, i7, iVar.Q);
        }
        return -3;
    }

    public final void c() {
        if (!this.d) {
            i iVar = this.f60819e;
            xa xaVar = iVar.h;
            int[] iArr = iVar.f60821b;
            int i7 = this.f60818c;
            xaVar.i(iArr[i7], iVar.f60822c[i7], 0, null, iVar.K);
            this.d = true;
        }
    }

    @Override
    public final boolean h() {
        i iVar = this.f60819e;
        if (!iVar.z() && this.f60817b.A(iVar.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final int o(long j3) {
        i iVar = this.f60819e;
        if (iVar.z()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        c1 c1Var = this.f60817b;
        int x10 = c1Var.x(j3, z10);
        a aVar = iVar.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f60818c + 1) - c1Var.v());
        }
        c1Var.L(x10);
        if (x10 > 0) {
            c();
        }
        return x10;
    }

    @Override
    public final void a() {
    }
}
