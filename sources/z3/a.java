package z3;

import h2.x;
public final class a {
    public final int f61350a;
    public int f61351b;
    public int f61352c;
    public long d;
    public final boolean f61353e;
    public final x f61354f;
    public final x f61355g;
    public int h;
    public int f61356i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f61355g = xVar;
        this.f61354f = xVar2;
        this.f61353e = z10;
        xVar2.N(12);
        this.f61350a = xVar2.E();
        xVar.N(12);
        this.f61356i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f61351b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f61351b + 1;
        this.f61351b = i10;
        if (i10 == this.f61350a) {
            return false;
        }
        boolean z10 = this.f61353e;
        x xVar = this.f61354f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f61351b == this.h) {
            x xVar2 = this.f61355g;
            this.f61352c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f61356i - 1;
            this.f61356i = i11;
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
