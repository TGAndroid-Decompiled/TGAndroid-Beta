package z3;

import h2.x;
public final class a {
    public final int f59578a;
    public int f59579b;
    public int f59580c;
    public long d;
    public final boolean f59581e;
    public final x f59582f;
    public final x f59583g;
    public int h;
    public int f59584i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59583g = xVar;
        this.f59582f = xVar2;
        this.f59581e = z9;
        xVar2.N(12);
        this.f59578a = xVar2.E();
        xVar.N(12);
        this.f59584i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59579b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59579b + 1;
        this.f59579b = i10;
        if (i10 == this.f59578a) {
            return false;
        }
        boolean z9 = this.f59581e;
        x xVar = this.f59582f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59579b == this.h) {
            x xVar2 = this.f59583g;
            this.f59580c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59584i - 1;
            this.f59584i = i11;
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
