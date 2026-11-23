package z3;

import h2.x;
public final class a {
    public final int f61396a;
    public int f61397b;
    public int f61398c;
    public long d;
    public final boolean f61399e;
    public final x f61400f;
    public final x f61401g;
    public int h;
    public int f61402i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f61401g = xVar;
        this.f61400f = xVar2;
        this.f61399e = z10;
        xVar2.N(12);
        this.f61396a = xVar2.E();
        xVar.N(12);
        this.f61402i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f61397b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f61397b + 1;
        this.f61397b = i10;
        if (i10 == this.f61396a) {
            return false;
        }
        boolean z10 = this.f61399e;
        x xVar = this.f61400f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f61397b == this.h) {
            x xVar2 = this.f61401g;
            this.f61398c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f61402i - 1;
            this.f61402i = i11;
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
