package z3;

import h2.x;
public final class a {
    public final int f59587a;
    public int f59588b;
    public int f59589c;
    public long d;
    public final boolean f59590e;
    public final x f59591f;
    public final x f59592g;
    public int h;
    public int f59593i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59592g = xVar;
        this.f59591f = xVar2;
        this.f59590e = z9;
        xVar2.N(12);
        this.f59587a = xVar2.E();
        xVar.N(12);
        this.f59593i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59588b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59588b + 1;
        this.f59588b = i10;
        if (i10 == this.f59587a) {
            return false;
        }
        boolean z9 = this.f59590e;
        x xVar = this.f59591f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59588b == this.h) {
            x xVar2 = this.f59592g;
            this.f59589c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59593i - 1;
            this.f59593i = i11;
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
