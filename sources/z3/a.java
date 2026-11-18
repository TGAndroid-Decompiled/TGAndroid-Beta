package z3;

import h2.x;
public final class a {
    public final int f61351a;
    public int f61352b;
    public int f61353c;
    public long d;
    public final boolean f61354e;
    public final x f61355f;
    public final x f61356g;
    public int h;
    public int f61357i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f61356g = xVar;
        this.f61355f = xVar2;
        this.f61354e = z10;
        xVar2.N(12);
        this.f61351a = xVar2.E();
        xVar.N(12);
        this.f61357i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f61352b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f61352b + 1;
        this.f61352b = i10;
        if (i10 == this.f61351a) {
            return false;
        }
        boolean z10 = this.f61354e;
        x xVar = this.f61355f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f61352b == this.h) {
            x xVar2 = this.f61356g;
            this.f61353c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f61357i - 1;
            this.f61357i = i11;
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
