package w3;

import e2.v;
public final class a {
    public final int f47945a;
    public int f47946b;
    public int f47947c;
    public long d;
    public final boolean f47948e;
    public final v f47949f;
    public final v f47950g;
    public int h;
    public int f47951i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f47950g = vVar;
        this.f47949f = vVar2;
        this.f47948e = z10;
        vVar2.J(12);
        this.f47945a = vVar2.B();
        vVar.J(12);
        this.f47951i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f47946b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f47946b + 1;
        this.f47946b = i11;
        if (i11 == this.f47945a) {
            return false;
        }
        boolean z11 = this.f47948e;
        v vVar = this.f47949f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f47946b == this.h) {
            v vVar2 = this.f47950g;
            this.f47947c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f47951i - 1;
            this.f47951i = i12;
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
