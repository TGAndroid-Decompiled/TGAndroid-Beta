package w3;

import e2.x;
public final class a {
    public final int f50654a;
    public int f50655b;
    public int f50656c;
    public long d;
    public final boolean e;
    public final x f50657f;
    public final x f50658g;
    public int h;
    public int f50659i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f50658g = xVar;
        this.f50657f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f50654a = xVar2.E();
        xVar.N(12);
        this.f50659i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f50655b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f50655b + 1;
        this.f50655b = i11;
        if (i11 == this.f50654a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f50657f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f50655b == this.h) {
            x xVar2 = this.f50658g;
            this.f50656c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f50659i - 1;
            this.f50659i = i12;
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
