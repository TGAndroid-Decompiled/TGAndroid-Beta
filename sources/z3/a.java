package z3;

import h2.x;
public final class a {
    public final int f59479a;
    public int f59480b;
    public int f59481c;
    public long d;
    public final boolean f59482e;
    public final x f59483f;
    public final x f59484g;
    public int h;
    public int f59485i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59484g = xVar;
        this.f59483f = xVar2;
        this.f59482e = z9;
        xVar2.N(12);
        this.f59479a = xVar2.E();
        xVar.N(12);
        this.f59485i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59480b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59480b + 1;
        this.f59480b = i10;
        if (i10 == this.f59479a) {
            return false;
        }
        boolean z9 = this.f59482e;
        x xVar = this.f59483f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59480b == this.h) {
            x xVar2 = this.f59484g;
            this.f59481c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59485i - 1;
            this.f59485i = i11;
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
