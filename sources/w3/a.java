package w3;

import e2.v;
public final class a {
    public final int f44508a;
    public int f44509b;
    public int f44510c;
    public long d;
    public final boolean e;
    public final v f44511f;
    public final v f44512g;
    public int h;
    public int f44513i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f44512g = vVar;
        this.f44511f = vVar2;
        this.e = z10;
        vVar2.J(12);
        this.f44508a = vVar2.B();
        vVar.J(12);
        this.f44513i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f44509b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f44509b + 1;
        this.f44509b = i11;
        if (i11 == this.f44508a) {
            return false;
        }
        boolean z11 = this.e;
        v vVar = this.f44511f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f44509b == this.h) {
            v vVar2 = this.f44512g;
            this.f44510c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f44513i - 1;
            this.f44513i = i12;
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
