package w3;

import e2.v;
public final class a {
    public final int f43439a;
    public int f43440b;
    public int f43441c;
    public long d;
    public final boolean e;
    public final v f43442f;
    public final v f43443g;
    public int h;
    public int f43444i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f43443g = vVar;
        this.f43442f = vVar2;
        this.e = z10;
        vVar2.J(12);
        this.f43439a = vVar2.B();
        vVar.J(12);
        this.f43444i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f43440b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f43440b + 1;
        this.f43440b = i11;
        if (i11 == this.f43439a) {
            return false;
        }
        boolean z11 = this.e;
        v vVar = this.f43442f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f43440b == this.h) {
            v vVar2 = this.f43443g;
            this.f43441c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f43444i - 1;
            this.f43444i = i12;
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
