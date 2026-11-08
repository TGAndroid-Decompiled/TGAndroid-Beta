package z3;

import h2.x;
public final class a {
    public final int f59577a;
    public int f59578b;
    public int f59579c;
    public long d;
    public final boolean f59580e;
    public final x f59581f;
    public final x f59582g;
    public int h;
    public int f59583i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59582g = xVar;
        this.f59581f = xVar2;
        this.f59580e = z9;
        xVar2.N(12);
        this.f59577a = xVar2.E();
        xVar.N(12);
        this.f59583i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59578b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59578b + 1;
        this.f59578b = i10;
        if (i10 == this.f59577a) {
            return false;
        }
        boolean z9 = this.f59580e;
        x xVar = this.f59581f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59578b == this.h) {
            x xVar2 = this.f59582g;
            this.f59579c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59583i - 1;
            this.f59583i = i11;
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
