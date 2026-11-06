package z3;

import h2.x;
public final class a {
    public final int f59455a;
    public int f59456b;
    public int f59457c;
    public long d;
    public final boolean f59458e;
    public final x f59459f;
    public final x f59460g;
    public int h;
    public int f59461i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59460g = xVar;
        this.f59459f = xVar2;
        this.f59458e = z9;
        xVar2.N(12);
        this.f59455a = xVar2.E();
        xVar.N(12);
        this.f59461i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59456b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59456b + 1;
        this.f59456b = i10;
        if (i10 == this.f59455a) {
            return false;
        }
        boolean z9 = this.f59458e;
        x xVar = this.f59459f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59456b == this.h) {
            x xVar2 = this.f59460g;
            this.f59457c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59461i - 1;
            this.f59461i = i11;
            if (i11 > 0) {
                i7 = xVar2.E() - 1;
            } else {
                i7 = -1;
            }
            this.h = i7;
        }
        return true;
    }
}
