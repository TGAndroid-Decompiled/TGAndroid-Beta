package w3;

import e2.v;
public final class a {
    public final int f49759a;
    public int f49760b;
    public int f49761c;
    public long d;
    public final boolean f49762e;
    public final v f49763f;
    public final v f49764g;
    public int h;
    public int f49765i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f49764g = vVar;
        this.f49763f = vVar2;
        this.f49762e = z10;
        vVar2.J(12);
        this.f49759a = vVar2.B();
        vVar.J(12);
        this.f49765i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f49760b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f49760b + 1;
        this.f49760b = i11;
        if (i11 == this.f49759a) {
            return false;
        }
        boolean z11 = this.f49762e;
        v vVar = this.f49763f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f49760b == this.h) {
            v vVar2 = this.f49764g;
            this.f49761c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f49765i - 1;
            this.f49765i = i12;
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
