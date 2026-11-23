package y2;

import a8.xa;
import x2.c1;
import x2.d1;
public final class g implements d1 {
    public final i f60698a;
    public final c1 f60699b;
    public final int f60700c;
    public boolean d;
    public final i f60701e;

    public g(i iVar, i iVar2, c1 c1Var, int i7) {
        this.f60701e = iVar;
        this.f60698a = iVar2;
        this.f60699b = c1Var;
        this.f60700c = i7;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.f60701e;
            xa xaVar = iVar.h;
            int[] iArr = iVar.f60703b;
            int i7 = this.f60700c;
            xaVar.j(iArr[i7], iVar.f60704c[i7], 0, null, iVar.K);
            this.d = true;
        }
    }

    @Override
    public final boolean h() {
        i iVar = this.f60701e;
        if (!iVar.y() && this.f60699b.A(iVar.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j3) {
        i iVar = this.f60701e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        c1 c1Var = this.f60699b;
        int x10 = c1Var.x(j3, z10);
        a aVar = iVar.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f60700c + 1) - c1Var.v());
        }
        c1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        i iVar = this.f60701e;
        if (!iVar.y()) {
            a aVar2 = iVar.M;
            c1 c1Var = this.f60699b;
            if (aVar2 != null && aVar2.d(this.f60700c + 1) <= c1Var.v()) {
                return -3;
            }
            b();
            return c1Var.F(aVar, hVar, i7, iVar.Q);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
