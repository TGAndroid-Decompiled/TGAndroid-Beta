package w3;

import e2.x;
public final class a {
    public final int f50657a;
    public int f50658b;
    public int f50659c;
    public long d;
    public final boolean e;
    public final x f50660f;
    public final x f50661g;
    public int h;
    public int f50662i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f50661g = xVar;
        this.f50660f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f50657a = xVar2.E();
        xVar.N(12);
        this.f50662i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f50658b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f50658b + 1;
        this.f50658b = i11;
        if (i11 == this.f50657a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f50660f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f50658b == this.h) {
            x xVar2 = this.f50661g;
            this.f50659c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f50662i - 1;
            this.f50662i = i12;
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
