package z3;

import h2.x;
public final class a {
    public final int f59485a;
    public int f59486b;
    public int f59487c;
    public long d;
    public final boolean f59488e;
    public final x f59489f;
    public final x f59490g;
    public int h;
    public int f59491i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59490g = xVar;
        this.f59489f = xVar2;
        this.f59488e = z9;
        xVar2.N(12);
        this.f59485a = xVar2.E();
        xVar.N(12);
        this.f59491i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59486b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59486b + 1;
        this.f59486b = i10;
        if (i10 == this.f59485a) {
            return false;
        }
        boolean z9 = this.f59488e;
        x xVar = this.f59489f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59486b == this.h) {
            x xVar2 = this.f59490g;
            this.f59487c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59491i - 1;
            this.f59491i = i11;
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
