package w3;

import e2.v;
public final class a {
    public final int f44798a;
    public int f44799b;
    public int f44800c;
    public long d;
    public final boolean e;
    public final v f44801f;
    public final v f44802g;
    public int h;
    public int f44803i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f44802g = vVar;
        this.f44801f = vVar2;
        this.e = z10;
        vVar2.J(12);
        this.f44798a = vVar2.B();
        vVar.J(12);
        this.f44803i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f44799b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f44799b + 1;
        this.f44799b = i11;
        if (i11 == this.f44798a) {
            return false;
        }
        boolean z11 = this.e;
        v vVar = this.f44801f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f44799b == this.h) {
            v vVar2 = this.f44802g;
            this.f44800c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f44803i - 1;
            this.f44803i = i12;
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
