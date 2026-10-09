package w3;

import e2.v;
public final class a {
    public final int f49761a;
    public int f49762b;
    public int f49763c;
    public long d;
    public final boolean f49764e;
    public final v f49765f;
    public final v f49766g;
    public int h;
    public int f49767i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f49766g = vVar;
        this.f49765f = vVar2;
        this.f49764e = z10;
        vVar2.J(12);
        this.f49761a = vVar2.B();
        vVar.J(12);
        this.f49767i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f49762b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f49762b + 1;
        this.f49762b = i11;
        if (i11 == this.f49761a) {
            return false;
        }
        boolean z11 = this.f49764e;
        v vVar = this.f49765f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f49762b == this.h) {
            v vVar2 = this.f49766g;
            this.f49763c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f49767i - 1;
            this.f49767i = i12;
            if (i12 > 0) {
                i10 = vVar2.B() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
