package w3;

import e2.v;
public final class a {
    public final int f47917a;
    public int f47918b;
    public int f47919c;
    public long d;
    public final boolean f47920e;
    public final v f47921f;
    public final v f47922g;
    public int h;
    public int f47923i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f47922g = vVar;
        this.f47921f = vVar2;
        this.f47920e = z10;
        vVar2.J(12);
        this.f47917a = vVar2.B();
        vVar.J(12);
        this.f47923i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f47918b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f47918b + 1;
        this.f47918b = i11;
        if (i11 == this.f47917a) {
            return false;
        }
        boolean z11 = this.f47920e;
        v vVar = this.f47921f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f47918b == this.h) {
            v vVar2 = this.f47922g;
            this.f47919c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f47923i - 1;
            this.f47923i = i12;
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
