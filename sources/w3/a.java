package w3;

import e2.v;
public final class a {
    public final int f48462a;
    public int f48463b;
    public int f48464c;
    public long d;
    public final boolean f48465e;
    public final v f48466f;
    public final v f48467g;
    public int h;
    public int f48468i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f48467g = vVar;
        this.f48466f = vVar2;
        this.f48465e = z10;
        vVar2.J(12);
        this.f48462a = vVar2.B();
        vVar.J(12);
        this.f48468i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f48463b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f48463b + 1;
        this.f48463b = i11;
        if (i11 == this.f48462a) {
            return false;
        }
        boolean z11 = this.f48465e;
        v vVar = this.f48466f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f48463b == this.h) {
            v vVar2 = this.f48467g;
            this.f48464c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f48468i - 1;
            this.f48468i = i12;
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
