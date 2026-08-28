package u3;

import d5.y;
public final class c {
    public final int f47976a;
    public int f47977b;
    public int f47978c;
    public long d;
    public final boolean f47979e;
    public final y f47980f;
    public final y f47981g;
    public int h;
    public int f47982i;

    public c(y yVar, y yVar2, boolean z10) {
        this.f47981g = yVar;
        this.f47980f = yVar2;
        this.f47979e = z10;
        yVar2.C(12);
        this.f47976a = yVar2.u();
        yVar.C(12);
        this.f47982i = yVar.u();
        g7.q.a("first_chunk must be 1", yVar.e() == 1);
        this.f47977b = -1;
    }

    public final boolean a() {
        long s10;
        int i9;
        int i10 = this.f47977b + 1;
        this.f47977b = i10;
        if (i10 == this.f47976a) {
            return false;
        }
        boolean z10 = this.f47979e;
        y yVar = this.f47980f;
        if (z10) {
            s10 = yVar.v();
        } else {
            s10 = yVar.s();
        }
        this.d = s10;
        if (this.f47977b == this.h) {
            y yVar2 = this.f47981g;
            this.f47978c = yVar2.u();
            yVar2.D(4);
            int i11 = this.f47982i - 1;
            this.f47982i = i11;
            if (i11 > 0) {
                i9 = yVar2.u() - 1;
            } else {
                i9 = -1;
            }
            this.h = i9;
        }
        return true;
    }
}
