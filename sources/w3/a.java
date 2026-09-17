package w3;

import e2.v;
public final class a {
    public final int f47946a;
    public int f47947b;
    public int f47948c;
    public long d;
    public final boolean f47949e;
    public final v f47950f;
    public final v f47951g;
    public int h;
    public int f47952i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f47951g = vVar;
        this.f47950f = vVar2;
        this.f47949e = z10;
        vVar2.J(12);
        this.f47946a = vVar2.B();
        vVar.J(12);
        this.f47952i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f47947b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f47947b + 1;
        this.f47947b = i11;
        if (i11 == this.f47946a) {
            return false;
        }
        boolean z11 = this.f47949e;
        v vVar = this.f47950f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f47947b == this.h) {
            v vVar2 = this.f47951g;
            this.f47948c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f47952i - 1;
            this.f47952i = i12;
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
