package v2;

import n4.y;
import u2.a1;
import u2.z0;
public final class f implements a1 {
    public final h f43797a;
    public final z0 f43798b;
    public final int f43799c;
    public boolean d;
    public final h e;

    public f(h hVar, h hVar2, z0 z0Var, int i10) {
        this.e = hVar;
        this.f43797a = hVar2;
        this.f43798b = z0Var;
        this.f43799c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f43801b;
            int i10 = this.f43799c;
            aVar.k(iArr[i10], hVar.f43802c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.e;
        if (!hVar.y() && this.f43798b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (!hVar2.y()) {
            a aVar = hVar2.L;
            z0 z0Var = this.f43798b;
            if (aVar != null && aVar.d(this.f43799c + 1) <= z0Var.t()) {
                return -3;
            }
            b();
            return z0Var.C(yVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        h hVar = this.e;
        if (hVar.y()) {
            return 0;
        }
        boolean z10 = hVar.O;
        z0 z0Var = this.f43798b;
        int v = z0Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f43799c + 1) - z0Var.t());
        }
        z0Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override
    public final void a() {
    }
}
