package z3;

import h2.x;
public final class a {
    public final int f59480a;
    public int f59481b;
    public int f59482c;
    public long d;
    public final boolean f59483e;
    public final x f59484f;
    public final x f59485g;
    public int h;
    public int f59486i;

    public a(x xVar, x xVar2, boolean z9) {
        this.f59485g = xVar;
        this.f59484f = xVar2;
        this.f59483e = z9;
        xVar2.N(12);
        this.f59480a = xVar2.E();
        xVar.N(12);
        this.f59486i = xVar.E();
        f3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f59481b = -1;
    }

    public final boolean a() {
        long C;
        int i7;
        int i10 = this.f59481b + 1;
        this.f59481b = i10;
        if (i10 == this.f59480a) {
            return false;
        }
        boolean z9 = this.f59483e;
        x xVar = this.f59484f;
        if (z9) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f59481b == this.h) {
            x xVar2 = this.f59485g;
            this.f59482c = xVar2.E();
            xVar2.O(4);
            int i11 = this.f59486i - 1;
            this.f59486i = i11;
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
