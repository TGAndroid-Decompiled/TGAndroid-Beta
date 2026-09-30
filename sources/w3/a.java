package w3;

import e2.v;
public final class a {
    public final int f44868a;
    public int f44869b;
    public int f44870c;
    public long d;
    public final boolean e;
    public final v f44871f;
    public final v f44872g;
    public int h;
    public int f44873i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f44872g = vVar;
        this.f44871f = vVar2;
        this.e = z10;
        vVar2.J(12);
        this.f44868a = vVar2.B();
        vVar.J(12);
        this.f44873i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f44869b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f44869b + 1;
        this.f44869b = i11;
        if (i11 == this.f44868a) {
            return false;
        }
        boolean z11 = this.e;
        v vVar = this.f44871f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f44869b == this.h) {
            v vVar2 = this.f44872g;
            this.f44870c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f44873i - 1;
            this.f44873i = i12;
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
