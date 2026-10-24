package w3;

import e2.x;
public final class a {
    public final int f48910a;
    public int f48911b;
    public int f48912c;
    public long d;
    public final boolean e;
    public final x f48913f;
    public final x f48914g;
    public int h;
    public int f48915i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f48914g = xVar;
        this.f48913f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f48910a = xVar2.E();
        xVar.N(12);
        this.f48915i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f48911b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f48911b + 1;
        this.f48911b = i11;
        if (i11 == this.f48910a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f48913f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f48911b == this.h) {
            x xVar2 = this.f48914g;
            this.f48912c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f48915i - 1;
            this.f48915i = i12;
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
