package w3;

import e2.x;
public final class a {
    public final int f48509a;
    public int f48510b;
    public int f48511c;
    public long d;
    public final boolean e;
    public final x f48512f;
    public final x f48513g;
    public int h;
    public int f48514i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f48513g = xVar;
        this.f48512f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f48509a = xVar2.E();
        xVar.N(12);
        this.f48514i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f48510b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f48510b + 1;
        this.f48510b = i11;
        if (i11 == this.f48509a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f48512f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f48510b == this.h) {
            x xVar2 = this.f48513g;
            this.f48511c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f48514i - 1;
            this.f48514i = i12;
            if (i12 > 0) {
                i10 = xVar2.E() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
