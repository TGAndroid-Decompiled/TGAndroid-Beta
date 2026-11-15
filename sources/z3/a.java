package z3;

import h2.x;
public final class a {
    public final int f60786a;
    public int f60787b;
    public int f60788c;
    public long d;
    public final boolean f60789e;
    public final x f60790f;
    public final x f60791g;
    public int h;
    public int f60792i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f60791g = xVar;
        this.f60790f = xVar2;
        this.f60789e = z10;
        xVar2.N(12);
        this.f60786a = xVar2.E();
        xVar.N(12);
        this.f60792i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f60787b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f60787b + 1;
        this.f60787b = i10;
        if (i10 == this.f60786a) {
            return false;
        }
        boolean z10 = this.f60789e;
        x xVar = this.f60790f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f60787b == this.h) {
            x xVar2 = this.f60791g;
            this.f60788c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f60792i - 1;
            this.f60792i = i11;
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
