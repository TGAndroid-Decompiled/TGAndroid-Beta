package v2;

import u2.e1;
import u2.f1;
public final class g implements f1 {
    public final i f48338a;
    public final e1 f48339b;
    public final int f48340c;
    public boolean d;
    public final i e;

    public g(i iVar, i iVar2, e1 e1Var, int i10) {
        this.e = iVar;
        this.f48338a = iVar2;
        this.f48339b = e1Var;
        this.f48340c = i10;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.e;
            a5.a aVar = iVar.h;
            int[] iArr = iVar.f48342b;
            int i10 = this.f48340c;
            aVar.m(iArr[i10], iVar.f48343c[i10], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        i iVar = this.e;
        if (!iVar.y() && this.f48339b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (!iVar.y()) {
            a aVar = iVar.L;
            e1 e1Var = this.f48339b;
            if (aVar != null && aVar.d(this.f48340c + 1) <= e1Var.v()) {
                return -3;
            }
            b();
            return e1Var.F(bVar, hVar, i10, iVar.P);
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
        e1 e1Var = this.f48339b;
        int x10 = e1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f48340c + 1) - e1Var.v());
        }
        e1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final void a() {
    }
}
