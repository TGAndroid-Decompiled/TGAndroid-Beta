package w3;

import e2.x;
public final class a {
    public final int f48462a;
    public int f48463b;
    public int f48464c;
    public long d;
    public final boolean e;
    public final x f48465f;
    public final x f48466g;
    public int h;
    public int f48467i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f48466g = xVar;
        this.f48465f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f48462a = xVar2.E();
        xVar.N(12);
        this.f48467i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f48463b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f48463b + 1;
        this.f48463b = i11;
        if (i11 == this.f48462a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f48465f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f48463b == this.h) {
            x xVar2 = this.f48466g;
            this.f48464c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f48467i - 1;
            this.f48467i = i12;
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
