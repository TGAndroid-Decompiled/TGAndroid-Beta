package w3;

import e2.x;
public final class a {
    public final int f47077a;
    public int f47078b;
    public int f47079c;
    public long d;
    public final boolean e;
    public final x f47080f;
    public final x f47081g;
    public int h;
    public int f47082i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f47081g = xVar;
        this.f47080f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f47077a = xVar2.E();
        xVar.N(12);
        this.f47082i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f47078b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f47078b + 1;
        this.f47078b = i11;
        if (i11 == this.f47077a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f47080f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f47078b == this.h) {
            x xVar2 = this.f47081g;
            this.f47079c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f47082i - 1;
            this.f47082i = i12;
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
