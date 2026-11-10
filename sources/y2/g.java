package y2;

import a8.wa;
import x2.a1;
import x2.b1;
public final class g implements b1 {
    public final i f58909a;
    public final a1 f58910b;
    public final int f58911c;
    public boolean d;
    public final i f58912e;

    public g(i iVar, i iVar2, a1 a1Var, int i7) {
        this.f58912e = iVar;
        this.f58909a = iVar2;
        this.f58910b = a1Var;
        this.f58911c = i7;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.f58912e;
            wa waVar = iVar.h;
            int[] iArr = iVar.f58914b;
            int i7 = this.f58911c;
            waVar.j(iArr[i7], iVar.f58915c[i7], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        i iVar = this.f58912e;
        if (!iVar.v() && this.f58910b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j3) {
        i iVar = this.f58912e;
        if (iVar.v()) {
            return 0;
        }
        boolean z9 = iVar.P;
        a1 a1Var = this.f58910b;
        int x10 = a1Var.x(j3, z9);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f58911c + 1) - a1Var.v());
        }
        a1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        i iVar = this.f58912e;
        if (!iVar.v()) {
            a aVar = iVar.L;
            a1 a1Var = this.f58910b;
            if (aVar != null && aVar.d(this.f58911c + 1) <= a1Var.v()) {
                return -3;
            }
            b();
            return a1Var.F(bVar, hVar, i7, iVar.P);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
