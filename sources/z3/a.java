package z3;

import h2.x;
public final class a {
    public final int f61361a;
    public int f61362b;
    public int f61363c;
    public long d;
    public final boolean f61364e;
    public final x f61365f;
    public final x f61366g;
    public int h;
    public int f61367i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f61366g = xVar;
        this.f61365f = xVar2;
        this.f61364e = z10;
        xVar2.N(12);
        this.f61361a = xVar2.E();
        xVar.N(12);
        this.f61367i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f61362b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f61362b + 1;
        this.f61362b = i10;
        if (i10 == this.f61361a) {
            return false;
        }
        boolean z10 = this.f61364e;
        x xVar = this.f61365f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f61362b == this.h) {
            x xVar2 = this.f61366g;
            this.f61363c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f61367i - 1;
            this.f61367i = i11;
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
