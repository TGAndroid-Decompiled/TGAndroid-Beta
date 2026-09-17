package v2;

import n4.y;
import u2.a1;
import u2.b1;
public final class f implements b1 {
    public final h f43871a;
    public final a1 f43872b;
    public final int f43873c;
    public boolean d;
    public final h e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.e = hVar;
        this.f43871a = hVar2;
        this.f43872b = a1Var;
        this.f43873c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f43875b;
            int i10 = this.f43873c;
            aVar.k(iArr[i10], hVar.f43876c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.e;
        if (!hVar.y() && this.f43872b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (!hVar2.y()) {
            a aVar = hVar2.L;
            a1 a1Var = this.f43872b;
            if (aVar != null && aVar.d(this.f43873c + 1) <= a1Var.t()) {
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
        a1 a1Var = this.f43872b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f43873c + 1) - a1Var.t());
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
