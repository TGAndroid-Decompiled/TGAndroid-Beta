package v2;

import n4.y;
import u2.a1;
import u2.b1;
public final class f implements b1 {
    public final h f44238a;
    public final a1 f44239b;
    public final int f44240c;
    public boolean d;
    public final h e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.e = hVar;
        this.f44238a = hVar2;
        this.f44239b = a1Var;
        this.f44240c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f44242b;
            int i10 = this.f44240c;
            aVar.k(iArr[i10], hVar.f44243c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.e;
        if (!hVar.y() && this.f44239b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (!hVar2.y()) {
            a aVar = hVar2.L;
            a1 a1Var = this.f44239b;
            if (aVar != null && aVar.d(this.f44240c + 1) <= a1Var.t()) {
                return -3;
            }
            b();
            return a1Var.C(yVar, hVar, i10, hVar2.O);
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
        a1 a1Var = this.f44239b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f44240c + 1) - a1Var.t());
        }
        a1Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override
    public final void a() {
    }
}
