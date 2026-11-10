package z3;

import h2.x;
public final class a {
    public final int f59585a;
    public int f59586b;
    public int f59587c;
    public long d;
    public final boolean f59588e;
    public final x f59589f;
    public final x f59590g;
    public int h;
    public int f59591i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59590g = xVar;
        this.f59589f = xVar2;
        this.f59588e = z9;
        xVar2.N(12);
        this.f59585a = xVar2.E();
        xVar.N(12);
        this.f59591i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59586b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59586b + 1;
        this.f59586b = i10;
        if (i10 == this.f59585a) {
            return false;
        }
        boolean z9 = this.f59588e;
        x xVar = this.f59589f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59586b == this.h) {
            x xVar2 = this.f59590g;
            this.f59587c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59591i - 1;
            this.f59591i = i11;
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
