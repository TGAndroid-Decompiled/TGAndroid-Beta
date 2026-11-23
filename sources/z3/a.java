package z3;

import h2.x;
public final class a {
    public final int f61480a;
    public int f61481b;
    public int f61482c;
    public long d;
    public final boolean f61483e;
    public final x f61484f;
    public final x f61485g;
    public int h;
    public int f61486i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f61485g = xVar;
        this.f61484f = xVar2;
        this.f61483e = z10;
        xVar2.N(12);
        this.f61480a = xVar2.E();
        xVar.N(12);
        this.f61486i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f61481b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f61481b + 1;
        this.f61481b = i10;
        if (i10 == this.f61480a) {
            return false;
        }
        boolean z10 = this.f61483e;
        x xVar = this.f61484f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f61481b == this.h) {
            x xVar2 = this.f61485g;
            this.f61482c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f61486i - 1;
            this.f61486i = i11;
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
