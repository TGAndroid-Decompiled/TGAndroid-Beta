package z3;

import h2.x;
public final class a {
    public final int f61392a;
    public int f61393b;
    public int f61394c;
    public long d;
    public final boolean f61395e;
    public final x f61396f;
    public final x f61397g;
    public int h;
    public int f61398i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f61397g = xVar;
        this.f61396f = xVar2;
        this.f61395e = z10;
        xVar2.N(12);
        this.f61392a = xVar2.E();
        xVar.N(12);
        this.f61398i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f61393b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f61393b + 1;
        this.f61393b = i10;
        if (i10 == this.f61392a) {
            return false;
        }
        boolean z10 = this.f61395e;
        x xVar = this.f61396f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f61393b == this.h) {
            x xVar2 = this.f61397g;
            this.f61394c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f61398i - 1;
            this.f61398i = i11;
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
