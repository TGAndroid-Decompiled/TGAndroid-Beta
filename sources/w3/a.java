package w3;

import e2.x;
public final class a {
    public final int f48464a;
    public int f48465b;
    public int f48466c;
    public long d;
    public final boolean e;
    public final x f48467f;
    public final x f48468g;
    public int h;
    public int f48469i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f48468g = xVar;
        this.f48467f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f48464a = xVar2.E();
        xVar.N(12);
        this.f48469i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f48465b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f48465b + 1;
        this.f48465b = i11;
        if (i11 == this.f48464a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f48467f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f48465b == this.h) {
            x xVar2 = this.f48468g;
            this.f48466c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f48469i - 1;
            this.f48469i = i12;
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
