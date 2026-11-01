package w3;

import e2.x;
public final class a {
    public final int f52354a;
    public int f52355b;
    public int f52356c;
    public long d;
    public final boolean e;
    public final x f52357f;
    public final x f52358g;
    public int h;
    public int f52359i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f52358g = xVar;
        this.f52357f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f52354a = xVar2.E();
        xVar.N(12);
        this.f52359i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f52355b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f52355b + 1;
        this.f52355b = i11;
        if (i11 == this.f52354a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f52357f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f52355b == this.h) {
            x xVar2 = this.f52358g;
            this.f52356c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f52359i - 1;
            this.f52359i = i12;
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
