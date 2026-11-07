package y2;

import a8.wa;
import x2.b1;
import x2.c1;
public final class g implements c1 {
    public final i f58812a;
    public final b1 f58813b;
    public final int f58814c;
    public boolean d;
    public final i f58815e;

    public g(i iVar, i iVar2, b1 b1Var, int i7) {
        this.f58815e = iVar;
        this.f58812a = iVar2;
        this.f58813b = b1Var;
        this.f58814c = i7;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.f58815e;
            wa waVar = iVar.h;
            int[] iArr = iVar.f58817b;
            int i7 = this.f58814c;
            waVar.j(iArr[i7], iVar.f58818c[i7], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        i iVar = this.f58815e;
        if (!iVar.v() && this.f58813b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j3) {
        i iVar = this.f58815e;
        if (iVar.v()) {
            return 0;
        }
        boolean z9 = iVar.P;
        b1 b1Var = this.f58813b;
        int x10 = b1Var.x(j3, z9);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f58814c + 1) - b1Var.v());
        }
        b1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        i iVar = this.f58815e;
        if (!iVar.v()) {
            a aVar = iVar.L;
            b1 b1Var = this.f58813b;
            if (aVar != null && aVar.d(this.f58814c + 1) <= b1Var.v()) {
                return -3;
            }
            b();
            return b1Var.F(bVar, hVar, i7, iVar.P);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
